package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Formateur;

public class FormateurDAO extends AbstractDAO<Formateur> implements IFormateurDAO {

	public FormateurDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Formateur> findAll() {
		List<Formateur> formateur = null;

		// recuperation des livres en BD (SELECT)
		formateur = em.createQuery("from Formateur").getResultList();

		return formateur;
	}

	@Override
	public Formateur get(Integer id) {
		Formateur formateur = null;
		formateur = em.find(Formateur.class, id);
		return formateur;
	}
}
