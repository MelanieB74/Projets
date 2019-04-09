package com.fr.Entités;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@DiscriminatorValue("cons")

@Entity
public class Consultants extends Personne {
	
	// ============================ ATTRIBUTS ========================================
	@Column(length=50)
	private String specialite;
	
	private int heureDispo;
	
	// 1 consultant appartient à 1 formation (one to one)
	@OneToOne
	@JoinColumn(name="id_form")
	private Formation formation;
	
	
	// ============================ CONSTRUCTEURS ========================================
	public Consultants() {
		super();		
	}
	
	public Consultants(String nom, String prenom, String dateNaissance, String specialite, int heureDispo, Formation formation) {
		super(nom, prenom, dateNaissance);
		this.specialite = specialite;
		this.heureDispo = heureDispo;
		this.formation = formation;
	}

	public Consultants(String specialite, int heureDispo, Formation formation) {
		super();
		this.specialite = specialite;
		this.heureDispo = heureDispo;
		this.formation = formation;
	}


	// ========================== GETTERS ET SETTERS ================================	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public int getHeureDispo() {
		return heureDispo;
	}
	public void setHeureDispo(int heureDispo) {
		this.heureDispo = heureDispo;
	}

	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	
	@Override
	public String toString() {
		return "Consultants [Id=" + getId() + ", Nom=" + getNom() + ", Prenom=" + getPrenom()
				+ ", DateNaissance=" + getDateNaissance() + "specialite=" + specialite + ", heureDispo=" + heureDispo + ", formation=" + formation
				+ "]";
	}

}
