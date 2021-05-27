package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Parcours;
import com.ib.projetFilRouge.dao.IParcoursDAO;

public class ParcoursFacade implements IParcoursFacade {

	private IParcoursDAO parcoursDAO = null;

	public ParcoursFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Parcours> findAll() {
		List<Parcours> parcourss = null;

		// appel à la couche DAO
		parcourss = parcoursDAO.findAll();

		return parcourss;
	}

	@Override
	public void delete(Parcours parcours) {
		parcoursDAO.delete(parcours);

	}

	@Override
	public Parcours update(Parcours parcours) {
		Parcours parcoursUpdate = parcoursDAO.update(parcours);
		return parcoursUpdate;
	}

	@Override
	public Parcours save(Parcours parcours) {
		Parcours parcoursSave = parcoursDAO.save(parcours);
		return parcoursSave;

	}

	@Override
	public Parcours get(Integer id) {
		Parcours parcours = parcoursDAO.get(id);
		return parcours;
	}

}
