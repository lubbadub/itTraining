package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Module;
import com.ib.projetFilRouge.dao.IModuleDAO;

public class ModuleFacade implements IModuleDAO {

	private IModuleDAO moduleDAO = null;

	public ModuleFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Module> findAll() {
		List<Module> modules = null;

		// appel à la couche DAO
		modules = moduleDAO.findAll();

		return modules;
	}

	@Override
	public void delete(Module module) {
		moduleDAO.delete(module);

	}

	@Override
	public Module update(Module module) {
		Module moduleUpdate = moduleDAO.update(module);
		return moduleUpdate;
	}

	@Override
	public Module save(Module module) {
		Module moduleSave = moduleDAO.save(module);
		return moduleSave;

	}

	@Override
	public Module get(Integer id) {
		Module module = moduleDAO.get(id);
		return module;
	}

}
