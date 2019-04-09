package com.fr.Entités;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@DiscriminatorValue("app")

@Entity
public class Apprenants extends Personne {
	
	// ============================ ATTRIBUTS ========================================
	@Column(length=50)
	private String diplome;
	
	// * apprenants appartiennent à 1 formation (many to one)
	@ManyToOne
	@JoinColumn(name="id_form")
		private Formation formation;

	
	// ============================ CONSTRUCTEURS ========================================
	public Apprenants() {
		super();		
	}
	
	public Apprenants(String nom, String prenom, String dateNaissance, String diplome, Formation formation) {
		super(nom, prenom, dateNaissance);
		this.diplome = diplome;
		this.formation = formation;
	}

	public Apprenants(int id, String diplome, Formation formation) {
		super();
		this.diplome = diplome;
		this.formation = formation;
	}


	// ========================== GETTERS ET SETTERS ================================		
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	
	@Override
	public String toString() {
		return "Apprenants [Id=" + getId() + ", Nom=" + getNom() + ", Prenom=" + getPrenom() + ", DateNaissance=" + getDateNaissance() + ", diplome=" + diplome + ", formation=" + formation + "]";
	}

}
