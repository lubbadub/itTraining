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

import com.ib.projetFilRougeCommon.bo.Responsable;
import com.ib.projetFilRougeCommon.facade.IResponsableFacade;

@Component
@Path("/responsable")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ResponsableService {

	private IResponsableFacade responsableFacade = null;

	public ResponsableService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idResponsable}")
	public Responsable getResponsable(@PathParam("idResponsable") Integer idResponsable) {
		Responsable responsable = responsableFacade.get(idResponsable);
		return responsable;
	}

	@GET
	@Path("/responsables")
	public List<Responsable> findAll() {
		List<Responsable> responsables = responsableFacade.findAll();
		return responsables;
	}

	@DELETE
	@Path("{idResponsable}")
	public String delete(@PathParam("idResponsable") Integer idResponsable) {
		Responsable responsable = new Responsable(idResponsable, null, null, null);
		responsableFacade.delete(responsable);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Responsable responsable) {
		responsableFacade.save(responsable);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Responsable responsable) {
		responsableFacade.update(responsable);
		return "ok";
	}

	/**
	 * @return the responsableFacade
	 */
	public IResponsableFacade getResponsableFacade() {
		return responsableFacade;
	}

	/**
	 * @param responsableFacade the responsableFacade to set
	 */
	public void setResponsableFacade(IResponsableFacade responsableFacade) {
		this.responsableFacade = responsableFacade;
	}

}