package com.fr.Service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fr.Entités.Consultants;
import com.fr.Entités.Personne;
import com.fr.Service.ICrud;

public class ConsultantService implements ICrud {

	// ============== METHODE AJOUTER ============================
	@Override
	public void ajouter(Object o, Session sess) {
			
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
			
		//DESCRIPTION DE LA METHODE (transaction car modification dans la BD)
		Transaction t = session.beginTransaction();		
			Consultants consNew = (Consultants) o;
			session.persist(consNew);		
		t.commit();
	}
		
		
	// ============= METHODE SUPPRIMER ===========================
	@Override
	public void supprimer(Object o, Session sess) {
		
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE
		Transaction t = session.beginTransaction();
			Consultants consSup = (Consultants) o;
			consSup = (Consultants) session.get(Personne.class, consSup.getId());
			session.delete(consSup);	
		t.commit();		
	}

		
	// ======== METHODE CONSULTER TOUTE LA LISTE =================
	@Override
	public void consulter(Object o, Session sess) {
			
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE 
		//(utilisation de criteria pour retourner un résultat sans modification de la BD) 
		Criteria crList = session.createCriteria(Consultants.class);
		List<Consultants> resultsList = crList.list();	
		System.out.println(resultsList);		
	}

	
	// ======= METHODE RECHERCHER UN ELEMENT DE LA LISTE =========
	@Override
	public void rechercher(Object o, Session sess) {
			
		//OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
		
		//DESCRIPTION DE LA METHODE
		Consultants consSearch = (Consultants)o;	
		Criteria crSearch = session.createCriteria(Consultants.class);
		crSearch.add(Restrictions.eq("nom", consSearch.getNom())); 		 //recherche selon le nom rentré
		crSearch.add(Restrictions.eq("prenom", consSearch.getPrenom())); //et le prénom rentré dans le main 
		List<Consultants> resultSearch = crSearch.list();
		System.out.println(resultSearch);			
	}

}
