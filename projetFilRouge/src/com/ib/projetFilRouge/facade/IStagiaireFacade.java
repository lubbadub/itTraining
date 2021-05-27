package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Stagiaire;

public interface IStagiaireFacade {

	List<Stagiaire> findAll();

	Stagiaire update(Stagiaire stagiaire);

	Stagiaire save(Stagiaire stagiaire);

	Stagiaire get(Integer id);

	void delete(Stagiaire stagiaire);

}