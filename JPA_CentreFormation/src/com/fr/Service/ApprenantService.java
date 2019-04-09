package com.fr.Service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fr.Entit�s.Apprenants;
import com.fr.Entit�s.Formation;
import com.fr.Entit�s.Personne;

public class ApprenantService implements ICrud {
	
	// ============== METHODE AJOUTER ============================
	@Override
	public void ajouter(Object o, Session sess) {
		
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE (transaction car modification dans la BD)
		Transaction t = session.beginTransaction();		
			Apprenants appNew = (Apprenants) o;			
			session.persist(appNew);		
		t.commit();
	}
	
	
	// ============= METHODE SUPPRIMER ===========================
	@Override
	public void supprimer(Object o, Session sess) {
		
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE
		Transaction t = session.beginTransaction();	
			Apprenants appSup = (Apprenants) o;
			appSup = (Apprenants) session.get(Personne.class, appSup.getId());
			session.delete(appSup);	
		t.commit();		
	}

	
	// ======== METHODE CONSULTER TOUTE LA LISTE =================
	@Override
	public void consulter(Object o, Session sess) {
		
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE 
		//(utilisation de criteria pour retourner un r�sultat sans modification de la BD) 
		Criteria crList = session.createCriteria(Apprenants.class);
		List<Apprenants> resultsList = crList.list();	
		System.out.println(resultsList);		
	}

	
	// ======= METHODE RECHERCHER UN ELEMENT DE LA LISTE =========
	@Override
	public void rechercher(Object o, Session sess) {
		
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE
		Apprenants appSearch = (Apprenants) o;
		Criteria crSearch = session.createCriteria(Apprenants.class);
		crSearch.add(Restrictions.eq("nom", appSearch.getNom())); 	  //recherche selon le nom rentr�
		crSearch.add(Restrictions.eq("prenom", appSearch.getPrenom())); //et le pr�nom rentr� dans le main
		List<Apprenants> resultSearch = crSearch.list();
		System.out.println(resultSearch);			
	}
	
}

