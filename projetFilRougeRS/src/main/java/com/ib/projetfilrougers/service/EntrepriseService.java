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

import com.ib.projetFilRougeCommon.bo.Entreprise;
import com.ib.projetFilRougeCommon.facade.IEntrepriseFacade;

@Component
@Path("/entreprise")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class EntrepriseService {

	private IEntrepriseFacade entrepriseFacade = null;

	public EntrepriseService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idEntreprise}")
	public Entreprise getEntreprise(@PathParam("idEntreprise") Integer idEntreprise) {
		Entreprise entreprise = entrepriseFacade.get(idEntreprise);
		return entreprise;
	}

	@GET
	@Path("/entreprises")
	public List<Entreprise> findAll() {
		List<Entreprise> entreprises = entrepriseFacade.findAll();
		return entreprises;
	}

	@DELETE
	@Path("{idEntreprise}")
	public String delete(@PathParam("idEntreprise") Integer idEntreprise) {
		Entreprise entreprise = new Entreprise(idEntreprise, null);
		entrepriseFacade.delete(entreprise);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Entreprise entreprise) {
		entrepriseFacade.save(entreprise);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Entreprise entreprise) {
		entrepriseFacade.update(entreprise);
		return "ok";
	}

	/**
	 * @return the entrepriseFacade
	 */
	public IEntrepriseFacade getEntrepriseFacade() {
		return entrepriseFacade;
	}

	/**
	 * @param entrepriseFacade the entrepriseFacade to set
	 */
	public void setEntrepriseFacade(IEntrepriseFacade entrepriseFacade) {
		this.entrepriseFacade = entrepriseFacade;
	}

}