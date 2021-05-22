package com.ib.projetFilRouge.bo;

public class Evaluation {
	
	private int idEval;
	private int evalAccueil;
	private int evalEnvironnement;
	private int evalContenu;
	private int evalFormateur;
	public int getIdEval() {
		return idEval;
	}
	public void setIdEval(int idEval) {
		this.idEval = idEval;
	}
	public int getEvalAccueil() {
		return evalAccueil;
	}
	public void setEvalAccueil(int evalAccueil) {
		this.evalAccueil = evalAccueil;
	}
	public int getEvalEnvironnement() {
		return evalEnvironnement;
	}
	public void setEvalEnvironnement(int evalEnvironnement) {
		this.evalEnvironnement = evalEnvironnement;
	}
	public int getEvalContenu() {
		return evalContenu;
	}
	public void setEvalContenu(int evalContenu) {
		this.evalContenu = evalContenu;
	}
	public int getEvalFormateur() {
		return evalFormateur;
	}
	public void setEvalFormateur(int evalFormateur) {
		this.evalFormateur = evalFormateur;
	}
	public Evaluation(int idEval, int evalAccueil, int evalEnvironnement, int evalContenu, int evalFormateur) {
		super();
		this.idEval = idEval;
		this.evalAccueil = evalAccueil;
		this.evalEnvironnement = evalEnvironnement;
		this.evalContenu = evalContenu;
		this.evalFormateur = evalFormateur;
	}
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
