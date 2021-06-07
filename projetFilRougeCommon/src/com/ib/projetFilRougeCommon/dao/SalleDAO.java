package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Salle;

public class SalleDAO extends AbstractDAO<Salle> implements ISalleDAO {

	public SalleDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Salle> findAll() {
		List<Salle> salle = null;

		// recuperation des livres en BD (SELECT)
		salle = em.createQuery("from Salle").getResultList();

		return salle;
	}

	@Override
	public Salle get(Integer id) {
		Salle salle = null;
		salle = em.find(Salle.class, id);
		return salle;
	}
}
