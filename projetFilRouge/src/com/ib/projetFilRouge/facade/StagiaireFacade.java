package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Stagiaire;
import com.ib.projetFilRouge.dao.IStagiaireDAO;

public class StagiaireFacade {

	private IStagiaireDAO stagiaireDAO = null;

	public StagiaireFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Stagiaire> findAll() {
		List<Stagiaire> stagiaires = null;

		// appel à la couche DAO
		stagiaires = stagiaireDAO.findAll();

		return stagiaires;
	}

	public void delete(Stagiaire stagiaire) {
		stagiaireDAO.delete(stagiaire);

	}

	public Stagiaire update(Stagiaire stagiaire) {
		Stagiaire stagiaireUpdate = stagiaireDAO.update(stagiaire);
		return stagiaireUpdate;
	}

	public Stagiaire save(Stagiaire stagiaire) {
		Stagiaire stagiaireSave = stagiaireDAO.save(stagiaire);
		return stagiaireSave;

	}

	public Stagiaire get(Integer id) {
		Stagiaire stagiaire = stagiaireDAO.get(id);
		return stagiaire;
	}

}
