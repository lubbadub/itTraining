package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Responsable;

public interface IResponsableFacade {

	List<Responsable> findAll();

	void delete(Responsable responsable);

	Responsable update(Responsable responsable);

	Responsable save(Responsable responsable);

	Responsable get(Integer id);

}