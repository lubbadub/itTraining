package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParticipeSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8879790154662036363L;
	/**
	 * 
	 */

	/**
	 * 
	 */

	@Id
	private Integer idSession;
	private Integer idStagiaire;

	/**
	 * @param idTheme
	 * @param idModule
	 */
	public ParticipeSession(Integer idSession, Integer idStagiaire) {
		super();
		this.idSession = idSession;
		this.idStagiaire = idStagiaire;
	}

	/**
	 * 
	 */
	public ParticipeSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idSession
	 */
	public Integer getIdSession() {
		return idSession;
	}

	/**
	 * @param idSession the idSession to set
	 */
	public void setIdSession(Integer idSession) {
		this.idSession = idSession;
	}

	/**
	 * @return the idStagiaire
	 */
	public Integer getIdStagiaire() {
		return idStagiaire;
	}

	/**
	 * @param idStagiaire the idStagiaire to set
	 */
	public void setIdStagiaire(Integer idStagiaire) {
		this.idStagiaire = idStagiaire;
	}

	@Override
	public String toString() {
		return "ParticipeSession [idSession=" + idSession + ", idStagiaire=" + idStagiaire + "]";
	}

}
