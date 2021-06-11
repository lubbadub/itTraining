package com.ib.projetfilrougeweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ib.projetFilRougeCommon.bo.Entreprise;
import com.ib.projetFilRougeCommon.bo.ParticipeSession;
import com.ib.projetFilRougeCommon.bo.Stagiaire;
import com.ib.projetFilRougeCommon.bo.Utilisateur;
import com.ib.projetFilRougeCommon.facade.IParticipeSessionFacade;
import com.ib.projetFilRougeCommon.facade.IStagiaireFacade;
import com.ib.projetFilRougeCommon.facade.IUtilisateurFacade;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({ "/enregistrementEnLigne" })
public class EnregistrementEnLigne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStagiaireFacade stagiaireFacade;
	private IParticipeSessionFacade participe_sessionFacade;
	private IUtilisateurFacade utilisateurFacade;

	/**
	 * Default constructor.
	 */
	public EnregistrementEnLigne() {
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
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/enregistrementEnLigne.jsp");

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String erreur = "";

		// recuperation du dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/enregistrementEnLigneOk.jsp");

		// recuperation du nom
		String nom = request.getParameter("nom");
		// recuperation du prenom
		String prenom = request.getParameter("prenom");
		// recuperation du mail
		String mail = request.getParameter("mail");
		// recuperation du tel
		String tel = request.getParameter("tel");
		// recuperation du password
		String password = request.getParameter("password");

		// controle des champs du formulaire
		if (nom == null || nom.isEmpty()) {
			// champ nom obligatoire
			erreur += "Champ nom obligatoire <br />";
		}
		if (prenom == null || prenom.isEmpty()) {
			// champ prenom obligatoire
			erreur += "Champ pr&eacute;nom obligatoire <br />";
		}
		if (mail == null || prenom.isEmpty()) {
			// champ prenom obligatoire
			erreur += "Champ mail obligatoire <br />";
		}
		if (tel == null || prenom.isEmpty()) {
			// champ prenom obligatoire
			erreur += "Champ t&eacute;l&eacute;phone obligatoire <br />";
		}

		// creation du stagiaire
		Stagiaire stagiaire = new Stagiaire(null, nom, prenom, mail, tel, new Entreprise());

		if (!erreur.isEmpty()) {
			// on place l erreur dans la request
			request.setAttribute("erreur", erreur);

			// on a une erreur
			requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/enregistrementEnLigne.jsp");
		} else {
			// sauvegarde de l utilisateur
			stagiaireFacade.save(stagiaire);
		}

		// recuperation de idSession
		Cookie[] cookieSession = request.getCookies();
		String idSession = "";
		for (int i = 0; i < cookieSession.length; i++) {
			if (cookieSession[i].getName().equals("idSession")) {
				idSession = cookieSession[i].getValue();
			}
		}
		Integer numSession = Integer.parseInt(idSession);

		// recuperation idStagiaire créé
		List<Stagiaire> stagiaires = stagiaireFacade.findAll();

		Integer idStagiaire = null;

		for (int i = 0; i < stagiaires.size(); i++) {
			if ((stagiaires.get(i).getNom().equals(nom)) && (stagiaires.get(i).getPrenom().equals(prenom))) {
				idStagiaire = stagiaires.get(i).getId();
			}
		}

		ParticipeSession participeSession = new ParticipeSession(numSession, idStagiaire);

		participe_sessionFacade.save(participeSession);

		String login = prenom.substring(0, 1) + nom;

		Utilisateur utilisateur = new Utilisateur(null, nom, prenom, login, password, idStagiaire);

		utilisateurFacade.save(utilisateur);

		// passage des infos dans la session
		request.getSession().setAttribute("stagiaire", stagiaire);

		// forward vers la jsp de la reponse
		requestDispatcher.forward(request, response);

		// System.out.println(stagiaire);
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

	/**
	 * @return the participe_sessionFacade
	 */
	public IParticipeSessionFacade getParticipe_sessionFacade() {
		return participe_sessionFacade;
	}

	/**
	 * @param participe_sessionFacade the participe_sessionFacade to set
	 */
	@Autowired
	public void setParticipe_sessionFacade(IParticipeSessionFacade participe_sessionFacade) {
		this.participe_sessionFacade = participe_sessionFacade;
	}

	/**
	 * @return the utilisateurFacade
	 */
	public IUtilisateurFacade getUtilisateurFacade() {
		return utilisateurFacade;
	}

	/**
	 * @param utilisateurFacade the utilisateurFacade to set
	 */
	@Autowired
	public void setUtilisateurFacade(IUtilisateurFacade utilisateurFacade) {
		this.utilisateurFacade = utilisateurFacade;
	}

}
