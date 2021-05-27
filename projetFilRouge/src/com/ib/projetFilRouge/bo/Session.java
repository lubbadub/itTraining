package com.ib.projetFilRouge.bo;

import java.util.Date;

public class Session {

	private Integer id;
	private Date dateDeb;
	private Date dateFin;
	private Formateur formateur;
	private Module module;
	private Salle salle;

	public Session() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param dateDeb
	 * @param dateFin
	 * @param formateur
	 * @param module
	 * @param salle
	 */
	public Session(Integer id, Date dateDeb, Date dateFin, Formateur formateur, Module module, Salle salle) {
		super();
		this.id = id;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.formateur = formateur;
		this.module = module;
		this.salle = salle;
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
	 * @return the dateDeb
	 */
	public Date getDateDeb() {
		return dateDeb;
	}

	/**
	 * @param dateDeb the dateDeb to set
	 */
	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the formateur
	 */
	public Formateur getFormateur() {
		return formateur;
	}

	/**
	 * @param formateur the formateur to set
	 */
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	/**
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	/**
	 * @return the salle
	 */
	public Salle getSalle() {
		return salle;
	}

	/**
	 * @param salle the salle to set
	 */
	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", dateDeb=" + dateDeb + ", dateFin=" + dateFin + ", formateur=" + formateur
				+ ", module=" + module + ", salle=" + salle + "]";
	}

}
