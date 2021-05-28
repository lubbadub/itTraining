package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stagiaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2860601176483322167L;
	@Id
	private Integer idStagiaire;
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	// @OneToMany
	private Entreprise entreprise;

	/**
	 * @param idStagiaire
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param tel
	 * @param entreprise
	 */
	public Stagiaire(Integer idStagiaire, String nom, String prenom, String mail, String tel, Entreprise entreprise) {
		super();
		this.idStagiaire = idStagiaire;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.entreprise = entreprise;
	}

	public Stagiaire() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Formateur [idStagiaire=" + idStagiaire + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", tel=" + tel + "]";
	}

	/**
	 * @return the idStagiaire
	 */
	public Integer getId() {
		return idStagiaire;
	}

	/**
	 * @param idStagiaire the idStagiaire to set
	 */
	public void setId(Integer idStagiaire) {
		this.idStagiaire = idStagiaire;
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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

}
