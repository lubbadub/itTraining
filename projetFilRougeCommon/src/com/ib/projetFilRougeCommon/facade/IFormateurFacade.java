package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Formateur;

public interface IFormateurFacade {
	List<Formateur> findAll();

	Formateur get(Integer id);

	Formateur save(Formateur formateur);

	Formateur update(Formateur formateur);

	void delete(Formateur formateur);
}
