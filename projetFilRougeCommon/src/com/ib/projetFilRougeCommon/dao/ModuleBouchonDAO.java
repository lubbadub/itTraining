package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Module;

public class ModuleBouchonDAO implements IModuleDAO {

	private List<Module> modules;

	@Override
	public List<Module> findAll() {
		// List<Livre> livres = new ArrayList<Livre>();

		// bouchon
		Module module = new Module(650, "xmen1", 120f, "fait", "fait", "fait");
		modules.add(module);
		module = new Module(650, "xmen1", 120f, "fait", "fait", "fait");
		modules.add(module);

		return modules;
	}

	@Override
	public void delete(Module module) {
		// TODO Auto-generated method stub

	}

	@Override
	public Module update(Module module) {
		return module;

	}

	@Override
	public Module save(Module module) {
		module.setId(800);
		return module;
	}

	@Override
	public Module get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

}
