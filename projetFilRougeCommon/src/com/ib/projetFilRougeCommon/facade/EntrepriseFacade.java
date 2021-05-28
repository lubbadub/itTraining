package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Entreprise;
import com.ib.projetFilRougeCommon.dao.IEntrepriseDAO;

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

	/**
	 * @return the entrepriseDAO
	 */
	public IEntrepriseDAO getEntrepriseDAO() {
		return entrepriseDAO;
	}

	/**
	 * @param entrepriseDAO the entrepriseDAO to set
	 */
	public void setEntrepriseDAO(IEntrepriseDAO entrepriseDAO) {
		this.entrepriseDAO = entrepriseDAO;
	}

}
