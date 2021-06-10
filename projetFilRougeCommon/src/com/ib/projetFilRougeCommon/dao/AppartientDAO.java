package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Appartient;

public class AppartientDAO extends AbstractDAO<Appartient> implements IAppartientDAO {

	public AppartientDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Appartient> findAll() {
		List<Appartient> appartient = null;

		// recuperation des livres en BD (SELECT)
		appartient = em.createQuery("from Appartient").getResultList();

		return appartient;
	}

	@Override
	public Appartient get(Integer id) {
		Appartient appartient = null;
		appartient = em.find(Appartient.class, id);
		return appartient;
	}
}
