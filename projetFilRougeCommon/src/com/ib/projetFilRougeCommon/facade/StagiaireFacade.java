package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Stagiaire;
import com.ib.projetFilRougeCommon.dao.IStagiaireDAO;

public class StagiaireFacade implements IStagiaireFacade {

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

	/**
	 * @return the stagiaireDAO
	 */
	public IStagiaireDAO getStagiaireDAO() {
		return stagiaireDAO;
	}

	/**
	 * @param stagiaireDAO the stagiaireDAO to set
	 */
	public void setStagiaireDAO(IStagiaireDAO stagiaireDAO) {
		this.stagiaireDAO = stagiaireDAO;
	}

}
