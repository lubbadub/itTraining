package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Formateur;

public interface IFormateurFacade {
	List<Formateur> findAll();

	Formateur get(Integer id);

	Formateur save(Formateur formateur);

	Formateur update(Formateur formateur);

	void delete(Formateur formateur);
}
