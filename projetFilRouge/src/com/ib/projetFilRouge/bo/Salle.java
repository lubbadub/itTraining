package com.ib.projetFilRouge.bo;

public class Salle {

	private int idSalle;
	private String ville;
	private String Adresse;
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public Salle(int idSalle, String ville, String adresse) {
		super();
		this.idSalle = idSalle;
		this.ville = ville;
		Adresse = adresse;
	}
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
