package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Theme;
import com.ib.projetFilRouge.dao.IThemeDAO;

public class ThemeFacade implements IThemeFacade {

	private IThemeDAO themeDAO = null;

	public ThemeFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Theme> findAll() {
		List<Theme> themes = null;

		// appel à la couche DAO
		themes = themeDAO.findAll();

		return themes;
	}

	@Override
	public void delete(Theme theme) {
		themeDAO.delete(theme);

	}

	@Override
	public Theme update(Theme theme) {
		Theme themeUpdate = themeDAO.update(theme);
		return themeUpdate;
	}

	@Override
	public Theme save(Theme theme) {
		Theme themeSave = themeDAO.save(theme);
		return themeSave;

	}

	@Override
	public Theme get(Integer id) {
		Theme theme = themeDAO.get(id);
		return theme;
	}

}
