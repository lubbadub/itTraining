package com.ib.projetFilRouge.bo;

public class Salle {

	private Integer id;
	private String ville;
	private String adresse;

	public Salle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param ville
	 * @param adresse
	 */
	public Salle(Integer id, String ville, String adresse) {
		super();
		this.id = id;
		this.ville = ville;
		this.adresse = adresse;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
		return "Salle [id=" + id + ", ville=" + ville + ", adresse=" + adresse + "]";
	}

}
