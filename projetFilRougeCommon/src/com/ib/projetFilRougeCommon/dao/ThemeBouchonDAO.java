package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Theme;

public class ThemeBouchonDAO implements IThemeDAO {

	private List<Theme> themes;

	@Override
	public List<Theme> findAll() {
		Theme theme = new Theme(98, "themecoucou");
		themes.add(theme);
		theme = new Theme(99, "themehihihi");
		themes.add(theme);

		return themes;
	}

	@Override
	public Theme save(Theme theme) {
		return theme;
	}

	@Override
	public Theme get(Integer id) {
		return null;
	}

	@Override
	public Theme update(Theme theme) {
		return theme;
	}

	@Override
	public void delete(Theme theme) {

	}

	/**
	 * @return the themes
	 */
	public List<Theme> getThemes() {
		return themes;
	}

	/**
	 * @param themes the themes to set
	 */
	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

}
