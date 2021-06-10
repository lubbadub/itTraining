package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Session implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 880873079402171856L;
	/**
	 * 
	 */

	@Id
	private Integer idSession;
	private Date dateDeb;
	private Date dateFin;
	@OneToOne
	private Formateur formateur;
	@OneToOne
	private Module module;
	@OneToOne
	private Salle salle;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinTable(name = "participesession", joinColumns = @JoinColumn(name = "idSession", referencedColumnName = "idSession"), inverseJoinColumns = @JoinColumn(name = "idStagiaire", referencedColumnName = "idStagiaire", updatable = true))
	private Set<Stagiaire> stagiaire = new HashSet<Stagiaire>();

	public Session() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idSession
	 * @param dateDeb
	 * @param dateFin
	 * @param formateur
	 * @param module
	 * @param salle
	 */
	public Session(Integer idSession, Date dateDeb, Date dateFin, Formateur formateur, Module module, Salle salle) {
		super();
		this.idSession = idSession;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.formateur = formateur;
		this.module = module;
		this.salle = salle;
	}

	/**
	 * @return the idSession
	 */
	public Integer getId() {
		return idSession;
	}

	/**
	 * @param idSession the idSession to set
	 */
	public void setId(Integer idSession) {
		this.idSession = idSession;
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
		return "Session [idSession=" + idSession + ", dateDeb=" + dateDeb + ", dateFin=" + dateFin + ", formateur="
				+ formateur + ", module=" + module + ", salle=" + salle + "]";
	}

}
