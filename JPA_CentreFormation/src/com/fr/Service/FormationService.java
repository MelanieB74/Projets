package com.fr.Service;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fr.Entités.Formation;
import com.fr.Service.ICrud;


public class FormationService implements ICrud {

	// ============== METHODE AJOUTER ============================
	@Override
	public void ajouter(Object o, Session sess) {
				
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
				
		//DESCRIPTION DE LA METHODE (transaction car modification de la BD)
		Transaction t = session.beginTransaction();		
			Formation formNew = (Formation)o;		
			session.persist(formNew);		
		t.commit();
	}
			
			
	// ============= METHODE SUPPRIMER ===========================
	@Override
	public void supprimer(Object o, Session sess) {
			
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
			
		//DESCRIPTION DE LA METHODE
		Transaction t = session.beginTransaction();		
			Formation formSup = (Formation) o;
			formSup = (Formation) session.get(Formation.class, formSup.getId());
			session.delete(formSup);		
		t.commit();		
	}
	
	
	// ======== METHODE CONSULTER TOUTE LA LISTE =================
	@Override
	public void consulter(Object o, Session sess) {
				
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE 
		//(utilisation de criteria pour retourner un résultat sans modification de la BD) 
		Criteria crList = session.createCriteria(Formation.class);
		List<Formation> resultsList = crList.list();	
		System.out.println(resultsList);		
	}
		
	
	// ======= METHODE RECHERCHER UN ELEMENT DE LA LISTE =========
	@Override
	public void rechercher(Object o, Session sess) {
			
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE
		Formation formSearch = (Formation)o;	
		Criteria crSearch = session.createCriteria(Formation.class);
		crSearch.add(Restrictions.eq("titre", formSearch.getTitre())); //titre égal au titre rentrer dans main
		List<Formation> resultSearch = crSearch.list();
		System.out.println(resultSearch);			
	}
	
}
