package com.formation.domain;

import java.io.Serializable;

public class Reservation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int nbNuit;
	private int nbPers;
	private String dateDeb;
	private String dateFin;
	
	public Reservation() {
		super();
	}

	public Reservation(int nbNuit, int nbPers, String dateDeb, String dateFin) {
		super();
		this.nbNuit = nbNuit;
		this.nbPers = nbPers;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
	}

	public int getNbNuit() {
		return nbNuit;
	}

	public void setNbNuit(int nbNuit) {
		this.nbNuit = nbNuit;
	}

	public int getNbPers() {
		return nbPers;
	}

	public void setNbPers(int nbPers) {
		this.nbPers = nbPers;
	}

	public String getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "Reservation [nbNuit=" + nbNuit + ", nbPers=" + nbPers + ", dateDeb=" + dateDeb + ", dateFin=" + dateFin
				+ "]";
	}

}
