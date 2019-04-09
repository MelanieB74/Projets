package com.formation.domain;

import java.io.Serializable;

public class Hotel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idH;
	private String ville;
	private String nomH;
	private String adresseH;
	private String telH;
	private String mailH;
	private float prixH;
	private Integer note;
	private String descriptionH;
	
	public Hotel() {
		super();
	}

	public Hotel(int idH, String ville, String nomH, String adresseH, String telH, String mailH, float prixH, Integer note, String descriptionH) {
		super();
		this.idH = idH;
		this.ville = ville;
		this.nomH = nomH;
		this.adresseH = adresseH;
		this.telH = telH;
		this.mailH = mailH;
		this.prixH = prixH;
		this.note = note;
		this.descriptionH = descriptionH;
	}

	public int getIdH() {
		return idH;
	}
	public void setIdH(int idH) {
		this.idH = idH;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNomH() {
		return nomH;
	}
	public void setNomH(String nomH) {
		this.nomH = nomH;
	}

	public String getAdresseH() {
		return adresseH;
	}
	public void setAdresseH(String adresseH) {
		this.adresseH = adresseH;
	}

	public String getTelH() {
		return telH;
	}
	public void setTelH(String telH) {
		this.telH = telH;
	}

	public String getMailH() {
		return mailH;
	}
	public void setMailH(String mailH) {
		this.mailH = mailH;
	}

	public float getPrixH() {
		return prixH;
	}
	public void setPrixH(float prixH) {
		this.prixH = prixH;
	}
	
	public String getDescriptionH() {
		return descriptionH;
	}
	public void setDescriptionH(String descriptionH) {
		this.descriptionH = descriptionH;
	}
	
	public Integer getNote() {
        return note;
    }
    public void setNote(Integer note) {
        this.note = note;
    }

	@Override
	public String toString() {
		return "Hotel [idH=" + idH + ", nomH=" + nomH + ", adresseH=" + adresseH + ", telH=" + telH + ", mailH=" + mailH
				+ ", prixH=" + prixH + ", note=" + note + "]";
	}

}
