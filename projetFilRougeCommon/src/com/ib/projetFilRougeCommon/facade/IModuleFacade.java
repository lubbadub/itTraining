package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Module;

public interface IModuleFacade {

	List<Module> findAll();

	void delete(Module module);

	Module update(Module module);

	Module save(Module module);

	Module get(Integer id);

}