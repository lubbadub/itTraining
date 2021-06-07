package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -128523932009422971L;
	@Id
	private Integer idModule;
	private String nom;
	private Float prixHT;
	private String objectif;
	private String prerequis;
	private String programme;

	public Module() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idModule
	 * @param nom
	 * @param prixHT
	 * @param objectif
	 * @param prerequis
	 * @param programme
	 */
	public Module(Integer idModule, String nom, Float prixHT, String objectif, String prerequis, String programme) {
		super();
		this.idModule = idModule;
		this.nom = nom;
		this.prixHT = prixHT;
		this.objectif = objectif;
		this.prerequis = prerequis;
		this.programme = programme;
	}

	/**
	 * @return the idModule
	 */
	public Integer getId() {
		return idModule;
	}

	/**
	 * @param idModule the idModule to set
	 */
	public void setId(Integer idModule) {
		this.idModule = idModule;
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
		return "Module [idModule=" + idModule + ", nom=" + nom + ", prixHT=" + prixHT + ", objectif=" + objectif
				+ ", prerequis=" + prerequis + ", programme=" + programme + "]";
	}

}
