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

import com.ib.projetFilRougeCommon.bo.Parcours;
import com.ib.projetFilRougeCommon.facade.IParcoursFacade;

@Component
@Path("/parcours")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ParcoursService {

	private IParcoursFacade parcoursFacade = null;

	public ParcoursService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idParcours}")
	public Parcours getParcours(@PathParam("idParcours") Integer idParcours) {
		Parcours parcours = parcoursFacade.get(idParcours);
		return parcours;
	}

	@GET
	@Path("/parcourss")
	public List<Parcours> findAll() {
		List<Parcours> parcourss = parcoursFacade.findAll();
		return parcourss;
	}

	@DELETE
	@Path("{idParcours}")
	public String delete(@PathParam("idParcours") Integer idParcours) {
		Parcours parcours = new Parcours(idParcours, null, null, null, null);
		parcoursFacade.delete(parcours);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Parcours parcours) {
		parcoursFacade.save(parcours);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Parcours parcours) {
		parcoursFacade.update(parcours);
		return "ok";
	}

	/**
	 * @return the parcoursFacade
	 */
	public IParcoursFacade getParcoursFacade() {
		return parcoursFacade;
	}

	/**
	 * @param parcoursFacade the parcoursFacade to set
	 */
	public void setParcoursFacade(IParcoursFacade parcoursFacade) {
		this.parcoursFacade = parcoursFacade;
	}

}