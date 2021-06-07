package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Theme;
import com.ib.projetFilRougeCommon.dao.IThemeDAO;

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

	/**
	 * @return the themeDAO
	 */
	public IThemeDAO getThemeDAO() {
		return themeDAO;
	}

	/**
	 * @param themeDAO the themeDAO to set
	 */
	public void setThemeDAO(IThemeDAO themeDAO) {
		this.themeDAO = themeDAO;
	}

}
