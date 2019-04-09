package com.fr.Service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ConnectDB {
	
	public static SessionFactory factory;

	public static Session getSession() {

		factory = new Configuration().configure().buildSessionFactory();
		
		return factory.openSession();
		
	}
	
}
