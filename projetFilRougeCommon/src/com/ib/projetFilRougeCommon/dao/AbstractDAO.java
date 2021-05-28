package com.ib.projetFilRougeCommon.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class AbstractDAO<T> {

	@PersistenceContext
	protected EntityManager em = null;

	public AbstractDAO() {
		super();
	}

	/**
	 * @return the em
	 */
	public EntityManager getEm() {
		return em;
	}

	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public T update(T bo) {
		T boUpdate = em.merge(bo);
		return boUpdate;
	}

	public T save(T bo) {
		em.persist(bo);
		return bo;
	}

	public void delete(T bo) {
		em.remove(em.contains(bo) ? bo : em.merge(bo));
	}
}