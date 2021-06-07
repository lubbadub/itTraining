package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Parcours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6167130170167460032L;
	@Id
	private Integer idParcours;
	private String nom;
	private Boolean isIntra;
	private Boolean isInter;
	@OneToOne
	private Responsable responsable;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "comporte", joinColumns = @JoinColumn(name = "idParcours", referencedColumnName = "idParcours"), inverseJoinColumns = @JoinColumn(name = "idSession", referencedColumnName = "idSession", updatable = true))
	private List<Session> session = new ArrayList<Session>();
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "participe_parcours", joinColumns = @JoinColumn(name = "idParcours", referencedColumnName = "idParcours"), inverseJoinColumns = @JoinColumn(name = "idStagiaire", referencedColumnName = "idStagiaire", updatable = true))
	private List<Stagiaire> stagiaire = new ArrayList<Stagiaire>();
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "compose", joinColumns = @JoinColumn(name = "idParcours", referencedColumnName = "idParcours"), inverseJoinColumns = @JoinColumn(name = "idModule", referencedColumnName = "idModule", updatable = true))
	private List<Module> module = new ArrayList<Module>();

	public Parcours() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idParcours
	 * @param nom
	 * @param isIntra
	 * @param isInter
	 * @param responsable
	 */
	public Parcours(Integer idParcours, String nom, Boolean isIntra, Boolean isInter, Responsable responsable) {
		super();
		this.idParcours = idParcours;
		this.nom = nom;
		this.isIntra = isIntra;
		this.isInter = isInter;
		this.responsable = responsable;
	}

	/**
	 * @return the idParcours
	 */
	public Integer getId() {
		return idParcours;
	}

	/**
	 * @param idParcours the idParcours to set
	 */
	public void setId(Integer idParcours) {
		this.idParcours = idParcours;
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
	 * @return the isIntra
	 */
	public Boolean getIsIntra() {
		return isIntra;
	}

	/**
	 * @param isIntra the isIntra to set
	 */
	public void setIsIntra(Boolean isIntra) {
		this.isIntra = isIntra;
	}

	/**
	 * @return the isInter
	 */
	public Boolean getIsInter() {
		return isInter;
	}

	/**
	 * @param isInter the isInter to set
	 */
	public void setIsInter(Boolean isInter) {
		this.isInter = isInter;
	}

	/**
	 * @return the responsable
	 */
	public Responsable getResponsable() {
		return responsable;
	}

	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Parcours [idParcours=" + idParcours + ", nom=" + nom + ", isIntra=" + isIntra + ", isInter=" + isInter
				+ ", responsable=" + responsable + "]";
	}

}
