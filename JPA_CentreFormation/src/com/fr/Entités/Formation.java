package com.fr.Entités;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Formation {
	
	// ============================ ATTRIBUTS ========================================
	@Id //clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_form")
	private int id;
	
	@Column(length=50)
	private String titre;
	
	@Column(length=200)
	private String description;
	
	private String dateDebut;
	private String dateFin;
	private int coutFormation;
	
	// 1 formation contient * apprenants (one to many)
	@OneToMany(cascade=CascadeType.ALL, mappedBy="formation", fetch=FetchType.LAZY)
		List<Apprenants> apprenants = new ArrayList<Apprenants>();
	
	// 1 formation contient 1 consultant (one to one)
	@OneToOne(mappedBy="formation")
		private Consultants consultants;
	
	
	// ============================ CONSTRUCTEURS ========================================
	public Formation() {
		super();	
	}
	
	public Formation(String titre, String description, String dateDebut, String dateFin, int coutFormation) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.coutFormation = coutFormation;
	}
	
	public Formation(String titre, String description, String dateDebut, String dateFin, int coutFormation,
			Consultants consultants) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.coutFormation = coutFormation;
		this.consultants = consultants;
	}

	public Formation(int id, String titre, String description, String dateDebut, String dateFin, int coutFormation,
			List<Apprenants> apprenants, Consultants consultants) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.coutFormation = coutFormation;
		this.apprenants = apprenants;
		this.consultants = consultants;
	}


	// ========================== GETTERS ET SETTERS ================================
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public int getCoutFormation() {
		return coutFormation;
	}
	public void setCoutFormation(int coutFormation) {
		this.coutFormation = coutFormation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public List<Apprenants> getApprenants() {
		return apprenants;
	}
	public void setApprenants(List<Apprenants> apprenants) {
		this.apprenants = apprenants;
	}

	public Consultants getConsultants() {
		return consultants;
	}
	public void setConsultants(Consultants consultants) {
		this.consultants = consultants;
	}


	@Override
	public String toString() {
		return "Formation [id=" + id + ", titre=" + titre + ", description=" + description + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", coutFormation=" + coutFormation + "]";
	}
	
}
