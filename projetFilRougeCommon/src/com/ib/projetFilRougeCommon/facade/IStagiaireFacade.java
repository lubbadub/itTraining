package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Stagiaire;

public interface IStagiaireFacade {

	List<Stagiaire> findAll();

	Stagiaire update(Stagiaire stagiaire);

	Stagiaire save(Stagiaire stagiaire);

	Stagiaire get(Integer id);

	void delete(Stagiaire stagiaire);

}