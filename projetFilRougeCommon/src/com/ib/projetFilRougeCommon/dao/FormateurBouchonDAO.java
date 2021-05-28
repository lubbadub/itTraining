package com.ib.projetFilRougeCommon.dao;

import java.util.Date;
import java.util.List;

import com.ib.projetFilRougeCommon.bo.Formateur;

public class FormateurBouchonDAO implements IFormateurDAO {

	private List<Formateur> formateurs;

	@Override
	public List<Formateur> findAll() {
		// List<Livre> livres = new ArrayList<Livre>();

		// bouchon
		Formateur formateur = new Formateur(750, " jean", "jeansgs", "batiste@pipe.fr", "122bshs", "122bshs",
				new Date(), 0, true);
		formateurs.add(formateur);
		formateur = new Formateur(750, " jean", "jeansgs", "batiste@pipe.fr", "122bshs", "122bshs", new Date(), 0,
				true);
		formateurs.add(formateur);

		return formateurs;
	}

	@Override
	public void delete(Formateur formateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public Formateur update(Formateur formateur) {
		return formateur;

	}

	@Override
	public Formateur save(Formateur formateur) {
		formateur.setId(750);
		return formateur;
	}

	@Override
	public Formateur get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

}
