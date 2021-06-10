package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Appartient;

public interface IAppartientFacade {

	List<Appartient> findAll();

	void delete(Appartient appartient);

	Appartient update(Appartient appartient);

	Appartient save(Appartient appartient);

	Appartient get(Integer id);

}