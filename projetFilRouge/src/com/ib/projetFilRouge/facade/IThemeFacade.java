package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Theme;

public interface IThemeFacade {

	List<Theme> findAll();

	void delete(Theme theme);

	Theme update(Theme theme);

	Theme save(Theme theme);

	Theme get(Integer id);

}