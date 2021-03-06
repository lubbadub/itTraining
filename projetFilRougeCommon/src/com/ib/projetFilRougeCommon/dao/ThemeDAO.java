package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Theme;

public class ThemeDAO extends AbstractDAO<Theme> implements IThemeDAO {

	public ThemeDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Theme> findAll() {
		List<Theme> theme = null;

		// recuperation des livres en BD (SELECT)
		theme = em.createQuery("from Theme").getResultList();

		return theme;
	}

	@Override
	public Theme get(Integer id) {
		Theme theme = null;
		theme = em.find(Theme.class, id);
		return theme;
	}
}
