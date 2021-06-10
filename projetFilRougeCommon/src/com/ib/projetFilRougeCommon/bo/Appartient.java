package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appartient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7835218165292280616L;
	@Id
	private Integer idTheme;
	private Integer idModule;

	/**
	 * @param idTheme
	 * @param idModule
	 */
	public Appartient(Integer idTheme, Integer idModule) {
		super();
		this.idTheme = idTheme;
		this.idModule = idModule;
	}

	/**
	 * 
	 */
	public Appartient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idTheme
	 */
	public Integer getIdTheme() {
		return idTheme;
	}

	/**
	 * @param idTheme the idTheme to set
	 */
	public void setIdTheme(Integer idTheme) {
		this.idTheme = idTheme;
	}

	/**
	 * @return the idModule
	 */
	public Integer getIdModule() {
		return idModule;
	}

	/**
	 * @param idModule the idModule to set
	 */
	public void setIdModule(Integer idModule) {
		this.idModule = idModule;
	}

	@Override
	public String toString() {
		return "Appartient [idTheme=" + idTheme + ", idModule=" + idModule + "]";
	}

}
