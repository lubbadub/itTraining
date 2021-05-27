package com.ib.projetFilRouge.bo;

public class Parcours {

	private Integer id;
	private String nom;
	private Boolean isIntra;
	private Boolean isInter;
	private Responsable responsable;

	public Parcours() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param isIntra
	 * @param isInter
	 * @param responsable
	 */
	public Parcours(Integer id, String nom, Boolean isIntra, Boolean isInter, Responsable responsable) {
		super();
		this.id = id;
		this.nom = nom;
		this.isIntra = isIntra;
		this.isInter = isInter;
		this.responsable = responsable;
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

	/**
	 * @return the isIntra
	 */
	public Boolean getIsIntra() {
		return isIntra;
	}

	/**
	 * @param isIntra the isIntra to set
	 */
	public void setIsIntra(Boolean isIntra) {
		this.isIntra = isIntra;
	}

	/**
	 * @return the isInter
	 */
	public Boolean getIsInter() {
		return isInter;
	}

	/**
	 * @param isInter the isInter to set
	 */
	public void setIsInter(Boolean isInter) {
		this.isInter = isInter;
	}

	/**
	 * @return the responsable
	 */
	public Responsable getResponsable() {
		return responsable;
	}

	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Parcours [id=" + id + ", nom=" + nom + ", isIntra=" + isIntra + ", isInter=" + isInter
				+ ", responsable=" + responsable + "]";
	}

}
