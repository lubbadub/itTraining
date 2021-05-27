package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Salle;

public interface ISalleFacade {

	List<Salle> findAll();

	void delete(Salle salle);

	Salle update(Salle salle);

	Salle save(Salle salle);

	Salle get(Integer id);

}