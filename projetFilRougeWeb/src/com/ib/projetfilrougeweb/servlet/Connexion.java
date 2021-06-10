package com.ib.projetfilrougeweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.projetFilRougeCommon.bo.Stagiaire;
import com.ib.projetFilRougeCommon.facade.IStagiaireFacade;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/connexion" })
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(Connexion.class);
	private IStagiaireFacade stagiaireFacade;

	/**
	 * Default constructor.
	 */
	public Connexion() {
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
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/connexion.jsp");

		// passage du modele a la jsp
		request.setAttribute("modele", "mon modele");

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperation du mail
		String mail = request.getParameter("prenom");
		// recuperation du prenom
		String motDePasse = request.getParameter("motDePasse");
		// recuperation du role
		String role = request.getParameter("role");

		String stagiaire = "Stagiaire";
		String responsable = "Responsable";

		logger.debug("role " + role);
		logger.debug("mdp " + motDePasse);
		logger.debug("mail " + mail);
		logger.debug("coucou");

		if (role.equals(stagiaire)) {
			Stagiaire stagiaireLogin = new Stagiaire();
			List<Stagiaire> stagiaires = stagiaireFacade.findAll();
			for (int i = 0; i < stagiaires.size(); i++) {

			}

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/connexionEtudiant.jsp");
			// forward vers la jsp de la reponse
			requestDispatcher.forward(request, response);
		} else if (role.equals(responsable)) {
			// recuperation du dispatcher
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/connexionOk.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/erreur/erreur404.jsp");
			requestDispatcher.forward(request, response);
		}
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
	@Autowired
	public void setStagiaireFacade(IStagiaireFacade stagiaireFacade) {
		this.stagiaireFacade = stagiaireFacade;
	}

}
