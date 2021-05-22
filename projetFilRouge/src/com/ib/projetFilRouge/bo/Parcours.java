package com.ib.projetFilRouge.bo;

public class Parcours {
	
	private int idParcours;
	private String nomParcours;
	private boolean isIntra;
	private boolean isInter;
	private int idResponsable;
	public int getIdParcours() {
		return idParcours;
	}
	public void setIdParcours(int idParcours) {
		this.idParcours = idParcours;
	}
	public String getNomParcours() {
		return nomParcours;
	}
	public void setNomParcours(String nomParcours) {
		this.nomParcours = nomParcours;
	}
	public boolean isIntra() {
		return isIntra;
	}
	public void setIntra(boolean isIntra) {
		this.isIntra = isIntra;
	}
	public boolean isInter() {
		return isInter;
	}
	public void setInter(boolean isInter) {
		this.isInter = isInter;
	}
	public int getIdResponsable() {
		return idResponsable;
	}
	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}
	public Parcours(int idParcours, String nomParcours, boolean isIntra, boolean isInter, int idResponsable) {
		super();
		this.idParcours = idParcours;
		this.nomParcours = nomParcours;
		this.isIntra = isIntra;
		this.isInter = isInter;
		this.idResponsable = idResponsable;
	}
	public Parcours() {
		super();
	}
	
	
	
	

}
