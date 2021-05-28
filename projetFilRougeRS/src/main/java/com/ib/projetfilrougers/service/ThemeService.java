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

import com.ib.projetFilRougeCommon.bo.Theme;
import com.ib.projetFilRougeCommon.facade.IThemeFacade;

@Component
@Path("/theme")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ThemeService {

	private IThemeFacade themeFacade = null;

	public ThemeService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("{idTheme}")
	public Theme getTheme(@PathParam("idTheme") Integer id) {
		Theme theme = themeFacade.get(id);
		return theme;
	}

	@GET
	@Path("/themes")
	public List<Theme> findAll() {
		List<Theme> themes = themeFacade.findAll();
		return themes;
	}

	@DELETE
	@Path("{idTheme}")
	public String delete(@PathParam("idTheme") Integer id) {
		Theme theme = new Theme(id, null);
		themeFacade.delete(theme);
		return "ok";
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public String ajouter(Theme theme) {
		themeFacade.save(theme);
		return "ok";
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public String update(Theme theme) {
		themeFacade.update(theme);
		return "ok";
	}

	/**
	 * @return the themeFacade
	 */
	public IThemeFacade getThemeFacade() {
		return themeFacade;
	}

	/**
	 * @param themeFacade the themeFacade to set
	 */
	public void setThemeFacade(IThemeFacade themeFacade) {
		this.themeFacade = themeFacade;
	}

}