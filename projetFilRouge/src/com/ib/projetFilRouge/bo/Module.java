package com.ib.projetFilRouge.bo;

public class Module {

	private Integer id;
	private String nom;
	private Float prixHT;
	private String objectif;
	private String prerequis;
	private String programme;

	public Module() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prixHT
	 * @param objectif
	 * @param prerequis
	 * @param programme
	 */
	public Module(Integer id, String nom, Float prixHT, String objectif, String prerequis, String programme) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHT = prixHT;
		this.objectif = objectif;
		this.prerequis = prerequis;
		this.programme = programme;
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
	 * @return the prixHT
	 */
	public Float getPrixHT() {
		return prixHT;
	}

	/**
	 * @param prixHT the prixHT to set
	 */
	public void setPrixHT(Float prixHT) {
		this.prixHT = prixHT;
	}

	/**
	 * @return the objectif
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * @param objectif the objectif to set
	 */
	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}

	/**
	 * @return the prerequis
	 */
	public String getPrerequis() {
		return prerequis;
	}

	/**
	 * @param prerequis the prerequis to set
	 */
	public void setPrerequis(String prerequis) {
		this.prerequis = prerequis;
	}

	/**
	 * @return the programme
	 */
	public String getProgramme() {
		return programme;
	}

	/**
	 * @param programme the programme to set
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", prixHT=" + prixHT + ", objectif=" + objectif + ", prerequis="
				+ prerequis + ", programme=" + programme + "]";
	}

}
