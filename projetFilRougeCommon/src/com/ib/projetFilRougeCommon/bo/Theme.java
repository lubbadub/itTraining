package com.ib.projetFilRougeCommon.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Theme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 632717809271888697L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute
	private Integer idTheme;
	@XmlAttribute
	private String nom;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinTable(name = "appartient", joinColumns = @JoinColumn(name = "idTheme", referencedColumnName = "idTheme"), inverseJoinColumns = @JoinColumn(name = "idModule", referencedColumnName = "idModule", updatable = true))
	private List<Module> module = new ArrayList<Module>();
//  TODO
//	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
//	@JoinTable(name = "compose", joinColumns = @JoinColumn(name = "idTheme", referencedColumnName = "idTheme"), inverseJoinColumns = @JoinColumn(name = "idTheme", referencedColumnName = "idTheme", updatable = true))
//	private List<Module> moduleCompose = new ArrayList<Module>();

	public Theme() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Theme(Integer id, String nom) {
		super();
		this.idTheme = id;
		this.nom = nom;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return idTheme;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.idTheme = id;
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

	@Override
	public String toString() {
		return "Theme [idTheme=" + idTheme + ", nom=" + nom + "]";
	}

}
