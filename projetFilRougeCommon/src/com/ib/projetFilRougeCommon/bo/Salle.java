package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -71160700647876532L;
	@Id
	private Integer idSalle;
	private String ville;
	private String adresse;

	public Salle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idSalle
	 * @param ville
	 * @param adresse
	 */
	public Salle(Integer idSalle, String ville, String adresse) {
		super();
		this.idSalle = idSalle;
		this.ville = ville;
		this.adresse = adresse;
	}

	/**
	 * @return the idSalle
	 */
	public Integer getId() {
		return idSalle;
	}

	/**
	 * @param idSalle the idSalle to set
	 */
	public void setId(Integer idSalle) {
		this.idSalle = idSalle;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", ville=" + ville + ", adresse=" + adresse + "]";
	}

}
