package com.ib.projetfilrougeweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.projetFilRougeCommon.bo.Utilisateur;
import com.ib.projetFilRougeCommon.facade.IStagiaireFacade;
import com.ib.projetFilRougeCommon.facade.IUtilisateurFacade;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/connexion" })
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(Connexion.class);
	private IStagiaireFacade stagiaireFacade;
	private IUtilisateurFacade utilisateurFacade;

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

		HttpSession session = request.getSession();
		session.setAttribute(responsable, session);
		// Utilisateur utilisateur = new Utilisateur();
		List<Utilisateur> utilisateurs = utilisateurFacade.findAll();
		boolean okLogin = false;

		// On cherche si l'utilisateur est stagiaire et existe dans la bd
		if (role.equals(stagiaire)) {

			for (int i = 0; i < utilisateurs.size(); i++) {
				if (utilisateurs.get(i).getLogin().equals(mail) && utilisateurs.get(i).getPassword().equals(motDePasse)
						&& utilisateurs.get(i).getIdStagiaire() != null) {
					session.setAttribute("utilisateur", utilisateurs.get(i));
					session.setAttribute("role", "Stagiaire");
					okLogin = true;
					break;
				}

			}

			// On cherche si l'utilisateur est responsable et existe dans la bd
		} else if (role.equals(responsable)) {
			for (int i = 0; i < utilisateurs.size(); i++) {
				if (utilisateurs.get(i).getLogin().equals(mail) && utilisateurs.get(i).getPassword().equals(motDePasse)
						&& utilisateurs.get(i).getIdStagiaire() == null) {
					session.setAttribute("utilisateur", utilisateurs.get(i));
					session.setAttribute("role", "Responsable");

					okLogin = true;
					break;
				}
			}
		}

		// Si l'on a trouvé l'utilisateur
		if (okLogin == true) {
			// recuperation du dispatcher
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/connexionOk.jsp");
			// forward vers la jsp de la reponse
			requestDispatcher.forward(request, response);
		} else {
			// recuperation du dispatcher
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/erreur/erreur404.jsp");
			// forward vers la jsp de la reponse
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

	public IUtilisateurFacade getUtilisateurFacade() {
		return utilisateurFacade;
	}

	@Autowired
	public void setUtilisateurFacade(IUtilisateurFacade utilisateurFacade) {
		this.utilisateurFacade = utilisateurFacade;
	}

}
