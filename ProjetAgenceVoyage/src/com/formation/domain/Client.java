package com.formation.domain;

import java.io.Serializable;

public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nomC;
	private String prenomC;
	private String adresseC;
	private String codePostaleC;
	private String telC;
	private String mailC;
	
	public Client() {
		super();
	}

	public Client(String nomC, String prenomC, String adresseC, String codePostaleC, String telC, String mailC) {
		super();
		this.nomC = nomC;
		this.prenomC = prenomC;
		this.adresseC = adresseC;
		this.codePostaleC = codePostaleC;
		this.telC = telC;
		this.mailC = mailC;
	}

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public String getPrenomC() {
		return prenomC;
	}

	public void setPrenomC(String prenomC) {
		this.prenomC = prenomC;
	}

	public String getAdresseC() {
		return adresseC;
	}

	public void setAdresseC(String adresseC) {
		this.adresseC = adresseC;
	}

	public String getCodePostaleC() {
		return codePostaleC;
	}

	public void setCodePostaleC(String codePostaleC) {
		this.codePostaleC = codePostaleC;
	}

	public String getTelC() {
		return telC;
	}

	public void setTelC(String telC) {
		this.telC = telC;
	}

	public String getMailC() {
		return mailC;
	}

	public void setMailC(String mailC) {
		this.mailC = mailC;
	}

	@Override
	public String toString() {
		return "Client [nomC=" + nomC + ", prenomC=" + prenomC + ", adresseC=" + adresseC + ", codePostaleC="
				+ codePostaleC + ", telC=" + telC + ", mailC=" + mailC + "]";
	}

}
