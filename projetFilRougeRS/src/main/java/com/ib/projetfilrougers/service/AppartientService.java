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

import com.ib.projetFilRougeCommon.bo.Appartient;
import com.ib.projetFilRougeCommon.facade.IAppartientFacade;

@Component
@Path("/appartient")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class AppartientService {

	private IAppartientFacade appartientFacade = null;

	public AppartientService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idAppartient}")
	public Appartient getAppartient(@PathParam("idAppartient") Integer idAppartient) {
		Appartient appartient = appartientFacade.get(idAppartient);
		return appartient;
	}

	@GET
	@Path("/appartients")
	public List<Appartient> findAll() {
		List<Appartient> appartients = appartientFacade.findAll();
		return appartients;
	}

	@DELETE
	@Path("{idAppartient}")
	public String delete(@PathParam("idAppartient") Integer idAppartient) {
		Appartient appartient = new Appartient(idAppartient, null);
		appartientFacade.delete(appartient);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Appartient appartient) {
		appartientFacade.save(appartient);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Appartient appartient) {
		appartientFacade.update(appartient);
		return "ok";
	}

	/**
	 * @return the appartientFacade
	 */
	public IAppartientFacade getAppartientFacade() {
		return appartientFacade;
	}

	/**
	 * @param appartientFacade the appartientFacade to set
	 */
	public void setAppartientFacade(IAppartientFacade appartientFacade) {
		this.appartientFacade = appartientFacade;
	}

}