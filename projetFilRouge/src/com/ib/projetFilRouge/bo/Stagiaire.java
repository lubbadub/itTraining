package com.ib.projetFilRouge.bo;

public class Stagiaire {

	private Integer id;
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private Entreprise entreprise;

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param tel
	 * @param entreprise
	 */
	public Stagiaire(Integer id, String nom, String prenom, String mail, String tel, Entreprise entreprise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.entreprise = entreprise;
	}

	public Stagiaire() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + "]";
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

}
