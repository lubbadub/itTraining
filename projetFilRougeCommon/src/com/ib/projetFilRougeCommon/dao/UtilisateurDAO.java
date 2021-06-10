package com.ib.projetFilRougeCommon.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.ib.projetFilRougeCommon.bo.Role;
import com.ib.projetFilRougeCommon.bo.Utilisateur;

public class UtilisateurDAO extends AbstractDAO<Utilisateur> implements IUtilisateurDAO {

	public UtilisateurDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> utilisateurs = null;

		// implementation avec hibernate/JPA
		// recuperation des utilisateurs en BD (SELECT)
		utilisateurs = em.createQuery("from Utilisateur").getResultList();

		return utilisateurs;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		/*
		 * Role role = new Role(); role.setNom("utilisateur");
		 * utilisateur.getRoles().add(role);
		 */

		Role role = getRole("utilisateur");
		if (role != null) {
			utilisateur.getRoles().add(role);
		}

		return super.save(utilisateur);
	}

	/**
	 * recuperation d un role a partir de son nom
	 * 
	 * @param nom
	 * @return
	 */
	public Role getRole(String nom) {
		Role role = null;
		CriteriaBuilder builder = getEm().getCriteriaBuilder();

		// creation de la requete
		CriteriaQuery<Role> criteria = builder.createQuery(Role.class);

		// on prepare la sortie
		Root<Role> root = criteria.from(Role.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("nom"), nom));

		try {
			role = getEm().createQuery(criteria).getSingleResult();

		} catch (NoResultException e) {
			// le role n'existe pas
			role = null;
		}

		return role;
	}

	@Override
	public Utilisateur get(Integer id) {
		Utilisateur utilisateur = null;
		utilisateur = em.find(Utilisateur.class, id);
		return utilisateur;
	}

	@Override
	public void delete(Utilisateur utilisateur) {
		em.remove(em.contains(utilisateur) ? utilisateur : em.merge(utilisateur));
	}

}
