package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Salle;

public interface ISalleFacade {

	List<Salle> findAll();

	void delete(Salle salle);

	Salle update(Salle salle);

	Salle save(Salle salle);

	Salle get(Integer id);

}