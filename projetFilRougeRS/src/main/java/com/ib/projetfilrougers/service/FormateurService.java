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

import com.ib.projetFilRougeCommon.bo.Formateur;
import com.ib.projetFilRougeCommon.facade.IFormateurFacade;

@Component
@Path("/formateur")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class FormateurService {

	private IFormateurFacade formateurFacade = null;

	public FormateurService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idFormateur}")
	public Formateur getFormateur(@PathParam("idFormateur") Integer idFormateur) {
		Formateur formateur = formateurFacade.get(idFormateur);
		return formateur;
	}

	@GET
	@Path("/formateurs")
	public List<Formateur> findAll() {
		List<Formateur> formateurs = formateurFacade.findAll();
		return formateurs;
	}

	@DELETE
	@Path("{idFormateur}")
	public String delete(@PathParam("idFormateur") Integer idFormateur) {
		Formateur formateur = new Formateur(idFormateur, null, null, null, null, null, null, null);
		formateurFacade.delete(formateur);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Formateur formateur) {
		formateurFacade.save(formateur);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Formateur formateur) {
		formateurFacade.update(formateur);
		return "ok";
	}

	/**
	 * @return the formateurFacade
	 */
	public IFormateurFacade getFormateurFacade() {
		return formateurFacade;
	}

	/**
	 * @param formateurFacade the formateurFacade to set
	 */
	public void setFormateurFacade(IFormateurFacade formateurFacade) {
		this.formateurFacade = formateurFacade;
	}

}