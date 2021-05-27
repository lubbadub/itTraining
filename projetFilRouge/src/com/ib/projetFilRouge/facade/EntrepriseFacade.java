package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Entreprise;
import com.ib.projetFilRouge.dao.IEntrepriseDAO;

public class EntrepriseFacade implements IEntrepriseFacade {

	private IEntrepriseDAO entrepriseDAO = null;

	public EntrepriseFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Entreprise> findAll() {
		List<Entreprise> entreprises = null;

		// appel à la couche DAO
		entreprises = entrepriseDAO.findAll();

		return entreprises;
	}

	@Override
	public void delete(Entreprise entreprise) {
		entrepriseDAO.delete(entreprise);

	}

	@Override
	public Entreprise update(Entreprise entreprise) {
		Entreprise entrepriseUpdate = entrepriseDAO.update(entreprise);
		return entrepriseUpdate;
	}

	@Override
	public Entreprise save(Entreprise entreprise) {
		Entreprise entrepriseSave = entrepriseDAO.save(entreprise);
		return entrepriseSave;

	}

	@Override
	public Entreprise get(Integer id) {
		Entreprise entreprise = entrepriseDAO.get(id);
		return entreprise;
	}

}
