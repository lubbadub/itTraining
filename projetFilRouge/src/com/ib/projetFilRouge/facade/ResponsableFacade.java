package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Responsable;
import com.ib.projetFilRouge.dao.IResponsableDAO;

public class ResponsableFacade implements IResponsableFacade {

	private IResponsableDAO responsableDAO = null;

	public ResponsableFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Responsable> findAll() {
		List<Responsable> responsables = null;

		// appel à la couche DAO
		responsables = responsableDAO.findAll();

		return responsables;
	}

	@Override
	public void delete(Responsable responsable) {
		responsableDAO.delete(responsable);

	}

	@Override
	public Responsable update(Responsable responsable) {
		Responsable responsableUpdate = responsableDAO.update(responsable);
		return responsableUpdate;
	}

	@Override
	public Responsable save(Responsable responsable) {
		Responsable responsableSave = responsableDAO.save(responsable);
		return responsableSave;

	}

	@Override
	public Responsable get(Integer id) {
		Responsable responsable = responsableDAO.get(id);
		return responsable;
	}

}
