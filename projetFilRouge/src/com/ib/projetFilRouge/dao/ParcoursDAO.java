package com.ib.projetFilRouge.dao;

import java.util.List;

import com.ib.projetFilRouge.bo.Parcours;

public class ParcoursDAO implements IParcoursDAO {

	public ParcoursDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Parcours> findAll() {
		List<Parcours> parcours = null;

		// recuperation des livres en BD (SELECT)
		parcours = em.createQuery("from Parcours").getResultList();

		return parcours;
	}

	@Override
	public Parcours get(Integer id) {
		Parcours parcours = null;
		parcours = em.find(Parcours.class, id);
		return parcours;
	}
}
