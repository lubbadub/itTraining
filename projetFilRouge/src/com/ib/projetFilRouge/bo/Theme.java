package com.ib.projetFilRouge.bo;

public class Theme {

	private Integer id;
	private String nom;

	public Theme() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Theme(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Theme [id=" + id + ", nom=" + nom + "]";
	}

}
