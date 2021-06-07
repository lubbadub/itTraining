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

import com.ib.projetFilRougeCommon.bo.Stagiaire;
import com.ib.projetFilRougeCommon.facade.IStagiaireFacade;

@Component
@Path("/stagiaire")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class StagiaireService {

	private IStagiaireFacade stagiaireFacade = null;

	public StagiaireService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idStagiaire}")
	public Stagiaire getStagiaire(@PathParam("idStagiaire") Integer idStagiaire) {
		Stagiaire stagiaire = stagiaireFacade.get(idStagiaire);
		return stagiaire;
	}

	@GET
	@Path("/stagiaires")
	public List<Stagiaire> findAll() {
		List<Stagiaire> stagiaires = stagiaireFacade.findAll();
		return stagiaires;
	}

	@DELETE
	@Path("{idStagiaire}")
	public String delete(@PathParam("idStagiaire") Integer idStagiaire) {
		Stagiaire stagiaire = new Stagiaire(idStagiaire, null, null, null, null, null);
		stagiaireFacade.delete(stagiaire);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Stagiaire stagiaire) {
		stagiaireFacade.save(stagiaire);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Stagiaire stagiaire) {
		stagiaireFacade.update(stagiaire);
		return "ok";
	}

	/**
	 * @return the stagiaireFacade
	 */
	public IStagiaireFacade getStagiaireFacade() {
		return stagiaireFacade;
	}

	/**
	 * @param stagiaireFacade the stagiaireFacade to set
	 */
	public void setStagiaireFacade(IStagiaireFacade stagiaireFacade) {
		this.stagiaireFacade = stagiaireFacade;
	}

}