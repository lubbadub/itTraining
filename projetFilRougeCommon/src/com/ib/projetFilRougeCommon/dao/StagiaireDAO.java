package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Stagiaire;

public class StagiaireDAO extends AbstractDAO<Stagiaire> implements IStagiaireDAO {

	public StagiaireDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Stagiaire> findAll() {
		List<Stagiaire> stagiaire = null;

		// recuperation des livres en BD (SELECT)
		stagiaire = em.createQuery("from Stagiaire").getResultList();

		return stagiaire;
	}

	@Override
	public Stagiaire get(Integer id) {
		Stagiaire stagiaire = null;
		stagiaire = em.find(Stagiaire.class, id);
		return stagiaire;
	}
}
