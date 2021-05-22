package com.ib.projetFilRouge.bo;

public class Responsable {
	
	private int idResponsable;
	private String nomResponsable;
	private String prenomResponsable;
	private String fonctionResponsable;
	public int getIdResponsable() {
		return idResponsable;
	}
	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}
	public String getNomResponsable() {
		return nomResponsable;
	}
	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	public String getPrenomResponsable() {
		return prenomResponsable;
	}
	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}
	public String getFonctionResponsable() {
		return fonctionResponsable;
	}
	public void setFonctionResponsable(String fonctionResponsable) {
		this.fonctionResponsable = fonctionResponsable;
	}
	public Responsable(int idResponsable, String nomResponsable, String prenomResponsable, String fonctionResponsable) {
		super();
		this.idResponsable = idResponsable;
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.fonctionResponsable = fonctionResponsable;
	}
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
