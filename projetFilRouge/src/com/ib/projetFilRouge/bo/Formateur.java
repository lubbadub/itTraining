package com.ib.projetFilRouge.bo;

import java.util.Date;

public class Formateur {

	private int idFormateur;
	private String nomFormateur;
	private String prenomFormateur;
	private String mailFormateur;
	private String adrFormateur;
	private String telFormateur;
	private Date datePremiereSession;
	private float tarifFormateur;
	private boolean isNouveau;
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public String getNomFormateur() {
		return nomFormateur;
	}
	public void setNomFormateur(String nomFormateur) {
		this.nomFormateur = nomFormateur;
	}
	public String getPrenomFormateur() {
		return prenomFormateur;
	}
	public void setPrenomFormateur(String prenomFormateur) {
		this.prenomFormateur = prenomFormateur;
	}
	public String getMailFormateur() {
		return mailFormateur;
	}
	public void setMailFormateur(String mailFormateur) {
		this.mailFormateur = mailFormateur;
	}
	public String getAdrFormateur() {
		return adrFormateur;
	}
	public void setAdrFormateur(String adrFormateur) {
		this.adrFormateur = adrFormateur;
	}
	public String getTelFormateur() {
		return telFormateur;
	}
	public void setTelFormateur(String telFormateur) {
		this.telFormateur = telFormateur;
	}
	public Date getDatePremiereSession() {
		return datePremiereSession;
	}
	public void setDatePremiereSession(Date datePremiereSession) {
		this.datePremiereSession = datePremiereSession;
	}
	public float getTarifFormateur() {
		return tarifFormateur;
	}
	public void setTarifFormateur(float tarifFormateur) {
		this.tarifFormateur = tarifFormateur;
	}
	public boolean isNouveau() {
		return isNouveau;
	}
	public void setNouveau(boolean isNouveau) {
		this.isNouveau = isNouveau;
	}
	public Formateur(int idFormateur, String nomFormateur, String prenomFormateur, String mailFormateur,
			String adrFormateur, String telFormateur, Date datePremiereSession, float tarifFormateur,
			boolean isNouveau) {
		super();
		this.idFormateur = idFormateur;
		this.nomFormateur = nomFormateur;
		this.prenomFormateur = prenomFormateur;
		this.mailFormateur = mailFormateur;
		this.adrFormateur = adrFormateur;
		this.telFormateur = telFormateur;
		this.datePremiereSession = datePremiereSession;
		this.tarifFormateur = tarifFormateur;
		this.isNouveau = isNouveau;
	}
	public Formateur() {
		super();
	}
	
	
	
	
	
}
