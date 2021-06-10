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

import com.ib.projetFilRougeCommon.bo.Utilisateur;
import com.ib.projetFilRougeCommon.facade.IUtilisateurFacade;

@Component
@Path("/utilisateur")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class UtilisateurService {

	private IUtilisateurFacade utilisateurFacade = null;

	public UtilisateurService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idUtilisateur}")
	public Utilisateur getUtilisateur(@PathParam("idUtilisateur") Integer id) {
		Utilisateur utilisateur = utilisateurFacade.get(id);
		return utilisateur;
	}

	@GET
	@Path("/utilisateurs")
	public List<Utilisateur> findAll() {
		List<Utilisateur> utilisateurs = utilisateurFacade.findAll();
		return utilisateurs;
	}

	@DELETE
	@Path("{idUtilisateur}")
	public String delete(@PathParam("idUtilisateur") Integer id) {
		Utilisateur utilisateur = new Utilisateur(id, null, null, null, null);
		utilisateurFacade.delete(utilisateur);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Utilisateur utilisateur) {
		utilisateurFacade.save(utilisateur);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Utilisateur utilisateur) {
		utilisateurFacade.update(utilisateur);
		return "ok";
	}

	/**
	 * @return the themeFacade
	 */
	public IUtilisateurFacade getUtilisateurFacade() {
		return utilisateurFacade;
	}

	/**
	 * @param utilisateurFacade
	 * @param themeFacade       the themeFacade to set
	 */
	public void setUtilisateurFacade(IUtilisateurFacade utilisateurFacade) {
		this.utilisateurFacade = utilisateurFacade;
	}

}