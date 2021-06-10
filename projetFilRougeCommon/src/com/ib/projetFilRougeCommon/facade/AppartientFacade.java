package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Appartient;
import com.ib.projetFilRougeCommon.dao.IAppartientDAO;

public class AppartientFacade implements IAppartientFacade {

	private IAppartientDAO appartientDAO = null;

	public AppartientFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Appartient> findAll() {
		List<Appartient> appartients = null;

		// appel à la couche DAO
		appartients = appartientDAO.findAll();

		return appartients;
	}

	@Override
	public void delete(Appartient appartient) {
		appartientDAO.delete(appartient);

	}

	@Override
	public Appartient update(Appartient appartient) {
		Appartient appartientUpdate = appartientDAO.update(appartient);
		return appartientUpdate;
	}

	@Override
	public Appartient save(Appartient appartient) {
		Appartient appartientSave = appartientDAO.save(appartient);
		return appartientSave;

	}

	@Override
	public Appartient get(Integer id) {
		Appartient appartient = appartientDAO.get(id);
		return appartient;
	}

	/**
	 * @return the appartientDAO
	 */
	public IAppartientDAO getAppartientDAO() {
		return appartientDAO;
	}

	/**
	 * @param appartientDAO the appartientDAO to set
	 */
	public void setAppartientDAO(IAppartientDAO appartientDAO) {
		this.appartientDAO = appartientDAO;
	}

}
