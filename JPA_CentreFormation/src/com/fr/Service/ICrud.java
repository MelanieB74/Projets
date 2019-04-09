package com.fr.Service;

import org.hibernate.Session;

public interface ICrud {
	
	public void ajouter(Object o, Session sess);
	public void supprimer(Object o, Session sess);
	public void consulter(Object o, Session sess);
	public void rechercher(Object o, Session sess);

}
