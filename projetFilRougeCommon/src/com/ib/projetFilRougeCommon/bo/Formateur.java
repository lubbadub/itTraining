package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Formateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6543293023549702183L;
	/**
	 * 
	 */
	@Id
	private Integer idFormateur;
	private String nom;
	private String prenom;
	private String mail;
	private String adr;
	private String tel;
	private Date datePremiereSession;
	// private double formateur;
	private Boolean isNouveau;

	/**
	 * @param idFormateur
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param adr
	 * @param tel
	 * @param datePremiereSession
	 * @param formateur
	 * @param isNouveau
	 */
	public Formateur(Integer idFormateur, String nom, String prenom, String mail, String adr, String tel,
			Date datePremiereSession, Boolean isNouveau) {
		super();
		this.idFormateur = idFormateur;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adr = adr;
		this.tel = tel;
		this.datePremiereSession = datePremiereSession;
		this.isNouveau = isNouveau;
	}

	public Formateur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Formateur [idFormateur=" + idFormateur + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", adr=" + adr + ", tel=" + tel + ", datePremiereSession=" + datePremiereSession + ", isNouveau="
				+ isNouveau + "]";
	}

	/**
	 * @return the idFormateur
	 */
	public Integer getId() {
		return idFormateur;
	}

	/**
	 * @param idFormateur the idFormateur to set
	 */
	public void setId(Integer idFormateur) {
		this.idFormateur = idFormateur;
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
	 * @return the adr
	 */
	public String getAdr() {
		return adr;
	}

	/**
	 * @param adr the adr to set
	 */
	public void setAdr(String adr) {
		this.adr = adr;
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

	/**
	 * @return the datePremiereSession
	 */
	public Date getDatePremiereSession() {
		return datePremiereSession;
	}

	/**
	 * @param datePremiereSession the datePremiereSession to set
	 */
	public void setDatePremiereSession(Date datePremiereSession) {
		this.datePremiereSession = datePremiereSession;
	}

	/**
	 * @return the isNouveau
	 */
	public Boolean getIsNouveau() {
		return isNouveau;
	}

	/**
	 * @param isNouveau the isNouveau to set
	 */
	public void setIsNouveau(Boolean isNouveau) {
		this.isNouveau = isNouveau;
	}

}
