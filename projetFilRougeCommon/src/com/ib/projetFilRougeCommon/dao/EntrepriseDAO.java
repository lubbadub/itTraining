package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Entreprise;

public class EntrepriseDAO extends AbstractDAO<Entreprise> implements IEntrepriseDAO {

	public EntrepriseDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Entreprise> findAll() {
		List<Entreprise> entreprise = null;

		// recuperation des livres en BD (SELECT)
		entreprise = em.createQuery("from Entreprise").getResultList();

		return entreprise;
	}

	@Override
	public Entreprise get(Integer id) {
		Entreprise entreprise = null;
		entreprise = em.find(Entreprise.class, id);
		return entreprise;
	}
}
