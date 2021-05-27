package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Entreprise;

public interface IEntrepriseFacade {

	List<Entreprise> findAll();

	void delete(Entreprise entreprise);

	Entreprise update(Entreprise entreprise);

	Entreprise save(Entreprise entreprise);

	Entreprise get(Integer id);

}