package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Formateur;
import com.ib.projetFilRougeCommon.dao.IFormateurDAO;

public class FormateurFacade implements IFormateurFacade {

	private IFormateurDAO formateurDAO = null;

	public FormateurFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Formateur> findAll() {
		List<Formateur> formateurs = null;

		// appel à la couche DAO
		formateurs = formateurDAO.findAll();

		return formateurs;
	}

	public void delete(Formateur formateur) {
		formateurDAO.delete(formateur);

	}

	public Formateur update(Formateur formateur) {
		Formateur formateurUpdate = formateurDAO.update(formateur);
		return formateurUpdate;
	}

	public Formateur save(Formateur formateur) {
		Formateur formateurSave = formateurDAO.save(formateur);
		return formateurSave;

	}

	public Formateur get(Integer id) {
		Formateur formateur = formateurDAO.get(id);
		return formateur;
	}

	/**
	 * @return the formateurDAO
	 */
	public IFormateurDAO getFormateurDAO() {
		return formateurDAO;
	}

	/**
	 * @param formateurDAO the formateurDAO to set
	 */
	public void setFormateurDAO(IFormateurDAO formateurDAO) {
		this.formateurDAO = formateurDAO;
	}
}
