package com.ib.projetFilRouge.dao;

import java.util.List;

import com.ib.projetFilRouge.bo.Module;

public class ModuleDAO implements IModuleDAO {

	public ModuleDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Module> findAll() {
		List<Module> module = null;

		// recuperation des livres en BD (SELECT)
		module = em.createQuery("from Module").getResultList();

		return module;
	}

	@Override
	public Module get(Integer id) {
		Module module = null;
		module = em.find(Module.class, id);
		return module;
	}
}
