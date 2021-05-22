package com.ib.projetFilRouge.bo;

public class Stagiaire {

	private int idStagiaire;
	private String nomStagiaire;
	private String prenomStagiaire;
	private String mailStagiaire;
	private String telStagiaire;
	private int idEntreprise;
	public int getIdStagiaire() {
		return idStagiaire;
	}
	public void setIdStagiaire(int idStagiaire) {
		this.idStagiaire = idStagiaire;
	}
	public String getNomStagiaire() {
		return nomStagiaire;
	}
	public void setNomStagiaire(String nomStagiaire) {
		this.nomStagiaire = nomStagiaire;
	}
	public String getPrenomStagiaire() {
		return prenomStagiaire;
	}
	public void setPrenomStagiaire(String prenomStagiaire) {
		this.prenomStagiaire = prenomStagiaire;
	}
	public String getMailStagiaire() {
		return mailStagiaire;
	}
	public void setMailStagiaire(String mailStagiaire) {
		this.mailStagiaire = mailStagiaire;
	}
	public String getTelStagiaire() {
		return telStagiaire;
	}
	public void setTelStagiaire(String telStagiaire) {
		this.telStagiaire = telStagiaire;
	}
	public int getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	
	public Stagiaire(int idStagiaire, String nomStagiaire, String prenomStagiaire, String mailStagiaire,
			String telStagiaire, int idEntreprise) {
		super();
		this.idStagiaire = idStagiaire;
		this.nomStagiaire = nomStagiaire;
		this.prenomStagiaire = prenomStagiaire;
		this.mailStagiaire = mailStagiaire;
		this.telStagiaire = telStagiaire;
		this.idEntreprise = idEntreprise;
	}
	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
