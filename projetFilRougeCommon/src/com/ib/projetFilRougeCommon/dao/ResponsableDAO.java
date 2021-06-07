package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Responsable;

public class ResponsableDAO extends AbstractDAO<Responsable> implements IResponsableDAO {

	public ResponsableDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Responsable> findAll() {
		List<Responsable> responsable = null;

		// recuperation des livres en BD (SELECT)
		responsable = em.createQuery("from Responsable").getResultList();

		return responsable;
	}

	@Override
	public Responsable get(Integer id) {
		Responsable responsable = null;
		responsable = em.find(Responsable.class, id);
		return responsable;
	}
}
