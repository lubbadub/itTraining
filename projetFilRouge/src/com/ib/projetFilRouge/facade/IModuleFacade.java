package com.ib.projetFilRouge.facade;

import java.util.List;

import com.ib.projetFilRouge.bo.Module;

public interface IModuleFacade {

	List<Module> findAll();

	void delete(Module module);

	Module update(Module module);

	Module save(Module module);

	Module get(Integer id);

}