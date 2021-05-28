package com.ib.projetfilrougers.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.ib.projetFilRougeCommon.bo.Module;
import com.ib.projetFilRougeCommon.facade.IModuleFacade;

@Component
@Path("/module")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ModuleService {

	private IModuleFacade moduleFacade = null;

	public ModuleService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idModule}")
	public Module getModule(@PathParam("idModule") Integer idModule) {
		Module module = moduleFacade.get(idModule);
		return module;
	}

	@GET
	@Path("/modules")
	public List<Module> findAll() {
		List<Module> modules = moduleFacade.findAll();
		return modules;
	}

	@DELETE
	@Path("{idModule}")
	public String delete(@PathParam("idModule") Integer idModule) {
		Module module = new Module(idModule, null, null, null, null, null);
		moduleFacade.delete(module);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Module module) {
		moduleFacade.save(module);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Module module) {
		moduleFacade.update(module);
		return "ok";
	}

	/**
	 * @return the moduleFacade
	 */
	public IModuleFacade getModuleFacade() {
		return moduleFacade;
	}

	/**
	 * @param moduleFacade the moduleFacade to set
	 */
	public void setModuleFacade(IModuleFacade moduleFacade) {
		this.moduleFacade = moduleFacade;
	}

}