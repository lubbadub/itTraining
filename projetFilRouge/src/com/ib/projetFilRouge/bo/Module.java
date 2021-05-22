package com.ib.projetFilRouge.bo;

public class Module {

	private int idModule;
	private String nomModule;
	private float prixHtModule;
	private String objectifModule;
	private String prerequisModule;
	private String programmeModule;
	public int getIdModule() {
		return idModule;
	}
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	public String getNomModule() {
		return nomModule;
	}
	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}
	public float getPrixHtModule() {
		return prixHtModule;
	}
	public void setPrixHtModule(float prixHtModule) {
		this.prixHtModule = prixHtModule;
	}
	public String getObjectifModule() {
		return objectifModule;
	}
	public void setObjectifModule(String objectifModule) {
		this.objectifModule = objectifModule;
	}
	public String getPrerequisModule() {
		return prerequisModule;
	}
	public void setPrerequisModule(String prerequisModule) {
		this.prerequisModule = prerequisModule;
	}
	public String getProgrammeModule() {
		return programmeModule;
	}
	public void setProgrammeModule(String programmeModule) {
		this.programmeModule = programmeModule;
	}
	public Module(int idModule, String nomModule, float prixHtModule, String objectifModule, String prerequisModule,
			String programmeModule) {
		super();
		this.idModule = idModule;
		this.nomModule = nomModule;
		this.prixHtModule = prixHtModule;
		this.objectifModule = objectifModule;
		this.prerequisModule = prerequisModule;
		this.programmeModule = programmeModule;
	}
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
