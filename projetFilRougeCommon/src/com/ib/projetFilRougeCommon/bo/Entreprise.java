package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entreprise implements Serializable {

	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 675619200102178343L;
	/**
	 * 
	 */
	@Id
	private Integer idEntreprise;
	private String nom;

	/**
	 * @param idEntreprise
	 * @param nom
	 */
	public Entreprise(Integer idEntreprise, String nom) {
		super();
		this.idEntreprise = idEntreprise;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Entreprise [idEntreprise=" + idEntreprise + ", nom=" + nom + "]";
	}

	/**
	 * @return the idEntreprise
	 */
	public Integer getId() {
		return idEntreprise;
	}

	/**
	 * @param idEntreprise the idEntreprise to set
	 */
	public void setId(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
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

	public Entreprise() {
		// TODO Auto-generated constructor stub
	}

}
