package com.ib.projetFilRougeCommon.facade;

import java.util.List;

import com.ib.projetFilRougeCommon.bo.Utilisateur;
import com.ib.projetFilRougeCommon.dao.IUtilisateurDAO;

public class UtilisateurFacade implements IUtilisateurFacade {

	private IUtilisateurDAO utilisateurDAO = null;

	public UtilisateurFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> utilisateurs = null;

		// appel à la couche DAO
		utilisateurs = utilisateurDAO.findAll();

		return utilisateurs;
	}

	@Override
	public void delete(Utilisateur utilisateur) {
		utilisateurDAO.delete(utilisateur);

	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		Utilisateur utilisateurUpdate = utilisateurDAO.update(utilisateur);
		return utilisateurUpdate;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		Utilisateur utilisateurSave = utilisateurDAO.save(utilisateur);
		return utilisateurSave;

	}

	@Override
	public Utilisateur get(Integer id) {

		return null;
	}

	/**
	 * @return the utilisateurDAO
	 */
	public IUtilisateurDAO getUtilisateurDAO() {
		return utilisateurDAO;
	}

	/**
	 * @param utilisateurDAO the utilisateurDAO to set
	 */
	public void setUtilisateurDAO(IUtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

}
