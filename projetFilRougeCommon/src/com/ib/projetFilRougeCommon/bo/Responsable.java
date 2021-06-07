package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 44571888049914391L;
	@Id
	private Integer idResponsable;
	private String nom;
	private String prenom;
	private String fonction;

	/**
	 * @param idResponsable
	 * @param nom
	 * @param prenom
	 * @param fonction
	 */
	public Responsable(Integer idResponsable, String nom, String prenom, String fonction) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}

	public Responsable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idResponsable
	 */
	public Integer getId() {
		return idResponsable;
	}

	/**
	 * @param idResponsable the idResponsable to set
	 */
	public void setId(Integer idResponsable) {
		this.idResponsable = idResponsable;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	@Override
	public String toString() {
		return "Responsable [idResponsable=" + idResponsable + ", nom=" + nom + ", prenom=" + prenom + ", fonction="
				+ fonction + "]";
	}

}
