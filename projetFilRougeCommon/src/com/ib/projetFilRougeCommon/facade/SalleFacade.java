package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Salle;
import com.ib.projetFilRougeCommon.dao.ISalleDAO;

public class SalleFacade implements ISalleFacade {
	private ISalleDAO salleDAO = null;

	public SalleFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Salle> findAll() {
		List<Salle> salles = null;

		// appel à la couche DAO
		salles = salleDAO.findAll();

		return salles;
	}

	@Override
	public void delete(Salle salle) {
		salleDAO.delete(salle);

	}

	@Override
	public Salle update(Salle salle) {
		Salle salleUpdate = salleDAO.update(salle);
		return salleUpdate;
	}

	@Override
	public Salle save(Salle salle) {
		Salle salleSave = salleDAO.save(salle);
		return salleSave;

	}

	@Override
	public Salle get(Integer id) {
		Salle salle = salleDAO.get(id);
		return salle;
	}

	/**
	 * @return the salleDAO
	 */
	public ISalleDAO getSalleDAO() {
		return salleDAO;
	}

	/**
	 * @param salleDAO the salleDAO to set
	 */
	public void setSalleDAO(ISalleDAO salleDAO) {
		this.salleDAO = salleDAO;
	}

}
