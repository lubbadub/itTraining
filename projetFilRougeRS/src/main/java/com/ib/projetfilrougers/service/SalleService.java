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

import com.ib.projetFilRougeCommon.bo.Salle;
import com.ib.projetFilRougeCommon.facade.ISalleFacade;

@Component
@Path("/salle")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class SalleService {

	private ISalleFacade salleFacade = null;

	public SalleService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idSalle}")
	public Salle getSalle(@PathParam("idSalle") Integer idSalle) {
		Salle salle = salleFacade.get(idSalle);
		return salle;
	}

	@GET
	@Path("/salles")
	public List<Salle> findAll() {
		List<Salle> salles = salleFacade.findAll();
		return salles;
	}

	@DELETE
	@Path("{idSalle}")
	public String delete(@PathParam("idSalle") Integer idSalle) {
		Salle salle = new Salle(idSalle, null, null);
		salleFacade.delete(salle);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Salle salle) {
		salleFacade.save(salle);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Salle salle) {
		salleFacade.update(salle);
		return "ok";
	}

	/**
	 * @return the salleFacade
	 */
	public ISalleFacade getSalleFacade() {
		return salleFacade;
	}

	/**
	 * @param salleFacade the salleFacade to set
	 */
	public void setSalleFacade(ISalleFacade salleFacade) {
		this.salleFacade = salleFacade;
	}

}