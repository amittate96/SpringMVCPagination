package com.javatpoint.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmoDAO2 {
	
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(Song.class);

	// Create Session Factory
	SessionFactory sessionFactory
	    = configuration.buildSessionFactory();

	// Initialize Session Object
	Session session = sessionFactory.openSession();

}
