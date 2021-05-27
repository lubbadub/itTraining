package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Responsable;

public interface IResponsableFacade {

	List<Responsable> findAll();

	void delete(Responsable responsable);

	Responsable update(Responsable responsable);

	Responsable save(Responsable responsable);

	Responsable get(Integer id);

}