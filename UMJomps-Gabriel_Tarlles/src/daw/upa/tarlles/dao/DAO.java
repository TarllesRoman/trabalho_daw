package daw.upa.tarlles.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import daw.umjomps.gabriel.tarlles.modelo.Login;

public class DAO<T> {
	private Class <T> classe;
	
	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public void adiciona(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public void altera(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remove(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();
	}
	
	public T buscaPorId(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		return em.find(classe, id);
	}
	
	public List<T> listaTodos(){
		EntityManager em = JPAUtil.getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		List<T> list = em.createQuery(query).getResultList();
		return list;
	}
	
	public Login login(String cpf, String senha) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from Login l where l.cpf = :cpf and l.senha = :senha");
		
		query.setParameter("cpf", cpf);
		query.setParameter("senha", senha);
		List results = query.getResultList();
		Login user =  results.isEmpty()? null : (Login)results.get(0);
		em.getTransaction().commit();
		em.close();
		return user;
	}
	
}
