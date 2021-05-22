package com.ib.projetFilRouge.bo;

import java.util.Date;

public class Session {

	private int idSession;
	private Date dateDebSession;
	private Date dateFinSession;
	private int idFormateur;
	private int idModule;
	private int idSalle;
	public int getIdSession() {
		return idSession;
	}
	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}
	public Date getDateDebSession() {
		return dateDebSession;
	}
	public void setDateDebSession(Date dateDebSession) {
		this.dateDebSession = dateDebSession;
	}
	public Date getDateFinSession() {
		return dateFinSession;
	}
	public void setDateFinSession(Date dateFinSession) {
		this.dateFinSession = dateFinSession;
	}
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public int getIdModule() {
		return idModule;
	}
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public Session(int idSession, Date dateDebSession, Date dateFinSession, int idFormateur, int idModule,
			int idSalle) {
		super();
		this.idSession = idSession;
		this.dateDebSession = dateDebSession;
		this.dateFinSession = dateFinSession;
		this.idFormateur = idFormateur;
		this.idModule = idModule;
		this.idSalle = idSalle;
	}
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
