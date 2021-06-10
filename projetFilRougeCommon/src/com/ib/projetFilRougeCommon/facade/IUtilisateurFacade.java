package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Utilisateur;

public interface IUtilisateurFacade {

	Utilisateur get(Integer id);

	Utilisateur save(Utilisateur utilisateur);

	Utilisateur update(Utilisateur utilisateur);

	void delete(Utilisateur utilisateur);

	List<Utilisateur> findAll();

}
