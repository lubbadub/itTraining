package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Stagiaire;

public class StagiaireBouchonDAO implements IStagiaireDAO {

	private List<Stagiaire> stagiaires;

	@Override
	public List<Stagiaire> findAll() {
		Stagiaire stagiaire = new Stagiaire(98, "nom", "prenom", "mail", "tel", null);
		stagiaires.add(stagiaire);
		stagiaire = new Stagiaire(99, "nom2", "prenom2", "mail2", "tel2", null);
		stagiaires.add(stagiaire);

		return stagiaires;
	}

	@Override
	public Stagiaire save(Stagiaire stagiaire) {
		return stagiaire;
	}

	@Override
	public Stagiaire get(Integer id) {
		return null;
	}

	@Override
	public Stagiaire update(Stagiaire stagiaire) {
		return stagiaire;
	}

	@Override
	public void delete(Stagiaire theme) {

	}

	/**
	 * @return the stagiaires
	 */
	public List<Stagiaire> getStagiaires() {
		return stagiaires;
	}

	/**
	 * @param stagiaires the stagiaires to set
	 */
	public void setStagiaires(List<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}

}
