package com.ib.projetfilrougeweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.projetFilRougeCommon.bo.Session;
import com.ib.projetFilRougeCommon.facade.ISessionFacade;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/catalogue" })
public class Catalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ISessionFacade sessionFacade;

	/**
	 * Default constructor.
	 */
	public Catalogue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/catalogue.jsp");

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String erreur = "";

		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/enregistrementEnLigne.jsp");

		// recuperation de la session
		String idSession = request.getParameter("session");

		Integer numSession = Integer.parseInt(idSession);

		Session session = new Session();

		session = sessionFacade.get(numSession);

		Cookie cookieSession = new Cookie("idSession", idSession);

		response.addCookie(cookieSession);

		// passage des infos dans la session
		request.getSession().setAttribute("session", session);

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);
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
	@Autowired
	public void setSessionFacade(ISessionFacade sessionFacade) {
		this.sessionFacade = sessionFacade;
	}

}
