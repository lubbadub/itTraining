package com.ib.projetFilRouge.dao;

import java.util.List;

import com.ib.projetFilRouge.bo.Salle;

public class SalleDAO implements ISalleDAO {

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
