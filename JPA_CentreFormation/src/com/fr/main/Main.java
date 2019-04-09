package com.fr.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fr.Entités.Apprenants;
import com.fr.Entités.Consultants;
import com.fr.Entités.Formation;
import com.fr.Service.ApprenantService;
import com.fr.Service.ConnectDB;
import com.fr.Service.ConsultantService;
import com.fr.Service.FormationService;

public class Main {

	public static void main(String[] args) throws ParseException {
	
	int choixCont; //variable permettant le choix de continuer l'application (do while).
	
	System.out.println("Bonjour et Bienvenue dans la GESTION DES CYCLES DE FORMATIONS.\n");
	
	do { // =============================== DEBUT DE L'APPLICATION ===============================================
		
		// OUVERTURE DE LA SESSION
		Session session = ConnectDB.getSession();
			
		// ACCES AUX DIFFERENTS SERVICES DE GESTION
		System.out.println("-----------------------------------------\n"
							+ "A quel service souhaitez-vous accéder?\n"
							+ " 1: Gestion des apprenants\n"
							+ " 2: Gestion des consultants\n"
							+ " 3: Gestion des formations");
		Scanner scChoixServ = new Scanner(System.in);
		int choixServ = scChoixServ.nextInt();	
		
		// CHOIX DE L'ACTION A ACCOMPLIR DANS LE SERVICE CHOISI
		System.out.println("Que voulez-vous faire? \n"
							+ " 1 : ajouter \n"
							+ " 2 : supprimer \n"
							+ " 3 : consulter \n"
							+ " 4 : rechercher");
		Scanner scAct1 = new Scanner(System.in);
		int choixAct1 = scAct1.nextInt();
		
		
		switch (choixServ) {
		
			// =========================== GESTION DES APPRENANTS ====================================
			case 1 : 
				
				switch (choixAct1) {
				
					case 1 : // ---------------- TRAITEMENT (AJOUTER) --------------------------------
						System.out.println("Entrer le nom de l'apprenant: ");
						Scanner scNom = new Scanner(System.in);
						String nom = scNom.nextLine();
						
						System.out.println("Entrer le prénom de l'apprenant: ");
						Scanner scPrenom = new Scanner(System.in);
						String prenom = scPrenom.nextLine();
						
						System.out.println("Entrer la date de naissance de l'apprenant (DD/MM/YYYY): ");
						Scanner scDateN = new Scanner(System.in);
						String dateN = scDateN.nextLine();
						String patternApp = "yyyy-MM-dd"; //changement du format java en format sql
						Date dateNa=new SimpleDateFormat("dd/MM/yyyy").parse(dateN);
						DateFormat dfNaissanceA = new SimpleDateFormat(patternApp);
						String dateNaisApp = dfNaissanceA.format(dateNa);
						java.sql.Date sqlDateNA = new java.sql.Date(dateNa.getTime());			
						
						System.out.println("Entrer le diplome de l'apprenant: ");
						Scanner scDiplome = new Scanner(System.in);
						String diplomeApp = scDiplome.nextLine();
						
						//Recherche de la formation en fonction de l'id rentré
						System.out.println("Entrer l'id de la formation de l'apprenant: ");
						Scanner scIdForm = new Scanner(System.in);
						int IdForm = scIdForm.nextInt();			
							//puis affectation de cette formation à l'apprenant			
							Criteria crAff = session.createCriteria(Formation.class); 
							crAff.add(Restrictions.eq("id", IdForm));
							List<Formation> result = crAff.list();	
							Formation formApp = result.get(0);
						
						Object appNew = new Apprenants(nom, prenom, dateNaisApp, diplomeApp, formApp);
						ApprenantService appServNew = new ApprenantService();	
							appServNew.ajouter(appNew, session);		
					break;	
						
					case 2 : // ---------------- TRAITEMENT (SUPPRIMER) ------------------------------
						System.out.println("Entrer l'identifiant de l'apprenant à supprimer: ");
						Scanner scIdappsup = new Scanner(System.in);
						int idAppSup = scIdappsup.nextInt();
						
						Object appSup = new Apprenants();
						((Apprenants) appSup).setId(idAppSup);
			
						ApprenantService appServSup = new ApprenantService();
							appServSup.supprimer(appSup, session);				
					break;
							
					case 3 : // ---------------- TRAITEMENT (CONSULTER) ------------------------------
						Object appList = new Apprenants();
						ApprenantService appServList = new ApprenantService();
							appServList.consulter(appList, session);
					break;
					
					case 4 : // ---------------- TRAITEMENT (RECHERCHER) -----------------------------
						System.out.println("Entrer le nom de l'apprenant recherché: ");
						Scanner scNomSearch = new Scanner(System.in);
						String nomSearch = scNomSearch .nextLine();
						
						System.out.println("Entrer le prénom de l'apprenant recherché: ");
						Scanner scPrenomSearch  = new Scanner(System.in);
						String prenomSearch  = scPrenomSearch .nextLine();
						
						Object appSearch = new Apprenants();
						((Apprenants) appSearch).setNom(nomSearch);
						((Apprenants) appSearch).setPrenom(prenomSearch);
						ApprenantService appServSearch = new ApprenantService();
						appServSearch.rechercher(appSearch, session);
					
					break;
					
				} // FERMETURE DES ACTIONS POUR LA GESTION DES APPRENANTS
				
			break; // FERMETURE DE LA GESTION DES APPRENANTS
			
			
			
			// =========================== GESTION DES CONSULTANTS ====================================
			case 2 : 
							
				switch (choixAct1) {
							
					case 1 : // ---------------- TRAITEMENT (AJOUTER) --------------------------------
						System.out.println("Entrer le nom du consultant: ");
						Scanner scNomCons = new Scanner(System.in);
						String nomCons = scNomCons.nextLine();
									
						System.out.println("Entrer le prénom du consultant: ");
						Scanner scPrenomCons = new Scanner(System.in);
						String prenomCons = scPrenomCons.nextLine();
									
						System.out.println("Entrer la date de naissance du consultant (DD/MM/YYYY): ");
						Scanner scDateN = new Scanner(System.in);
						String dateN = scDateN.nextLine();
						String patternCons = "yyyy-MM-dd"; //changement du format java en format sql
						Date dateNa=new SimpleDateFormat("dd/MM/yyyy").parse(dateN);
						DateFormat dfNaissanceA = new SimpleDateFormat(patternCons);
						String dateNaisCons = dfNaissanceA.format(dateNa);
						java.sql.Date sqlDateNA = new java.sql.Date(dateNa.getTime());			
									
						System.out.println("Entrer la spécialité du consultant: ");
						Scanner scSpecialite = new Scanner(System.in);
						String specialite = scSpecialite.nextLine();
						
						System.out.println("Entrer le nombre d'heure disponible du consultant: ");
						Scanner scHeureDispo = new Scanner(System.in);
						int heureDispo =scHeureDispo.nextInt();
									
						//Recherche de la formation en fonction de l'id rentré
						System.out.println("Entrer l'id de la formation du consultant: ");
						Scanner scIdForm = new Scanner(System.in);
						int IdForm = scIdForm.nextInt();			
							//puis affectation de cette formation à l'apprenant			
							Criteria crAff = session.createCriteria(Formation.class); 
							crAff.add(Restrictions.eq("id", IdForm));
							List<Formation> result = crAff.list();	
							Formation formCons = result.get(0);
									
						Object consNew = new Consultants(nomCons, prenomCons, dateNaisCons, specialite, heureDispo, formCons);
						ConsultantService consServNew = new ConsultantService();	
							consServNew.ajouter(consNew, session);		
					break;	
									
					case 2 : // ---------------- TRAITEMENT (SUPPRIMER) ------------------------------					
						System.out.println("Entrer l'identifiant du consultant à supprimer: ");
						Scanner scIdconssup = new Scanner(System.in);
						int idConsSup = scIdconssup.nextInt();
									
						Object consSup = new Consultants();
						((Consultants) consSup).setId(idConsSup);;
						
						ConsultantService consServSup = new ConsultantService();
							consServSup.supprimer(consSup, session);				
					break;
										
					case 3 : // ---------------- TRAITEMENT (CONSULTER) ------------------------------
						Object consList = new Consultants();
						ConsultantService consServList = new ConsultantService();
							consServList.consulter(consList, session);
					break;
								
					case 4 : // ---------------- TRAITEMENT (RECHERCHER) -----------------------------
						System.out.println("Entrer le nom du consultant recherché: ");
						Scanner scNomConsSearch = new Scanner(System.in);
						String nomConsSearch = scNomConsSearch .nextLine();
									
						System.out.println("Entrer le prénom du consultant recherché: ");
						Scanner scPrenomConsSearch  = new Scanner(System.in);
						String prenomConsSearch  = scPrenomConsSearch .nextLine();
														
						Object consSearch = new Consultants();
						((Consultants) consSearch).setNom(nomConsSearch);
						((Consultants) consSearch).setPrenom(prenomConsSearch);

						ConsultantService consServSearch = new ConsultantService();
						consServSearch.rechercher(consSearch, session);
					break;
								
				} // FERMETURE DES ACTIONS POUR LA GESTION DES CONSULTANTS
							
			break; // FERMETURE DE LA GESTION DES CONSULTANTS
			
			
			
			
			// =========================== GESTION DES FORMATIONS ====================================
			case 3 : 
							
				switch (choixAct1) {
							
					case 1 : // ---------------- TRAITEMENT (AJOUTER) --------------------------------
						System.out.println("Entrer le titre de la formation: ");
						Scanner scTitre = new Scanner(System.in);
						String titre = scTitre.nextLine();
						
						System.out.println("Entrer la description de la formation: ");
						Scanner scDescription = new Scanner(System.in);
						String description = scDescription.nextLine();
						
						System.out.println("Entrer la date de début de la formation (yyyy-MM-dd): ");
						Scanner scDateDeb = new Scanner(System.in);
						String dateDeb = scDateDeb.nextLine();
						String pattern = "yyyy-MM-dd"; //changement du format java en format sql
						Date dateD=new SimpleDateFormat("yyyy-MM-dd").parse(dateDeb);
						DateFormat df = new SimpleDateFormat(pattern);
						String dateDebsql = df.format(dateD);
						java.sql.Date sqlDateD = new java.sql.Date(dateD.getTime());
						
						System.out.println("Entrer la date de fin de la formation (yyyy-MM-dd): ");
						Scanner scDateFin = new Scanner(System.in);
						String dateFin = scDateFin.nextLine();
						String pattern2 = "yyyy-MM-dd"; //changement du format java en format sql
						Date dateF=new SimpleDateFormat("yyyy-MM-dd").parse(dateFin);
						DateFormat dfFin = new SimpleDateFormat(pattern2);
						String dateFinsql = dfFin.format(dateF);
						java.sql.Date sqlDateF = new java.sql.Date(dateF.getTime());
						
						System.out.println("Entrer le coût de la formation: ");
						Scanner scCoutForm = new Scanner(System.in);
						int coutForm = scCoutForm.nextInt();
						
						Object formNew = new Formation(titre, description, dateDebsql, dateFinsql, coutForm);
						FormationService formServNew = new FormationService();
								formServNew.ajouter(formNew, session);	
					break;	
									
					case 2 : // ---------------- TRAITEMENT (SUPPRIMER) ------------------------------
						System.out.println("Entrer l'identifiant de la formation à supprimer: ");
						Scanner scIdformsup = new Scanner(System.in);
						int idFormSup = scIdformsup.nextInt();
							
						Object formSup = new Formation();
						((Formation) formSup).setId(idFormSup);
											
						FormationService formServSup = new FormationService();
							formServSup.supprimer(formSup, session);				
					break;
										
					case 3 : // ---------------- TRAITEMENT (CONSULTER) ------------------------------
						Object formList = new Formation();
						FormationService formServList = new FormationService();
							formServList.consulter(formList, session);
					break;
								
					case 4 : // ---------------- TRAITEMENT (RECHERCHER) -----------------------------
						System.out.println("Entrer le titre de la formation recherchée: ");
						Scanner scTitreSearch = new Scanner(System.in);
						String titreSearch = scTitreSearch .nextLine();
									
						Object formSearch = new Formation();
						((Formation) formSearch).setTitre(titreSearch);
						
						FormationService formServSearch = new FormationService();
							formServSearch.rechercher(formSearch, session);
					break;
								
				} // FERMETURE DES ACTIONS POUR LA GESTION DES FORMATIONS
							
			break; // FERMETURE DE LA GESTION DES FORMATIONS
	
			}
			
		System.out.println("Voulez-vous continuer ? 1 = oui ; 2 = non");
		Scanner scChoix = new Scanner(System.in);
		choixCont = scChoix.nextInt();
			if (choixCont==2) {System.out.println("Merci et à bientôt !");}
	
	} // FERMETURE DE DO
	
	while (choixCont==1);
	
	} // FERMETURE DU MAIN

} // FERMETURE DE LA CLASSE MAIN
