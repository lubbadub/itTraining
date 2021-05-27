package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Parcours;

public interface IParcoursFacade {

	List<Parcours> findAll();

	void delete(Parcours parcours);

	Parcours update(Parcours parcours);

	Parcours save(Parcours parcours);

	Parcours get(Integer id);

}