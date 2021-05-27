package com.ib.projetFilRouge.bo;

public class Entreprise {

	private Integer id;
	private String nom;

	/**
	 * @param id
	 * @param nom
	 */
	public Entreprise(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + "]";
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
