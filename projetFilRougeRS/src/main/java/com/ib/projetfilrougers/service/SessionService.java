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

import com.ib.projetFilRougeCommon.bo.Session;
import com.ib.projetFilRougeCommon.facade.ISessionFacade;

@Component
@Path("/session")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class SessionService {

	private ISessionFacade sessionFacade = null;

	public SessionService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idSession}")
	public Session getSession(@PathParam("idSession") Integer idSession) {
		Session session = sessionFacade.get(idSession);
		return session;
	}

	@GET
	@Path("/sessions")
	public List<Session> findAll() {
		List<Session> sessions = sessionFacade.findAll();
		return sessions;
	}

	@DELETE
	@Path("{idSession}")
	public String delete(@PathParam("idSession") Integer idSession) {
		Session session = new Session(idSession, null, null, null, null, null);
		sessionFacade.delete(session);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Session session) {
		sessionFacade.save(session);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Session session) {
		sessionFacade.update(session);
		return "ok";
	}

	/**
	 * @return the sessionFacade
	 */
	public ISessionFacade getSessionFacade() {
		return sessionFacade;
	}

	/**
	 * @param sessionFacade the sessionFacade to set
	 */
	public void setSessionFacade(ISessionFacade sessionFacade) {
		this.sessionFacade = sessionFacade;
	}

}