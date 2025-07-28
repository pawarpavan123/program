package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Entity;

public class serviceClass {
	public void Add(String name,String address) {

		Entity en = new Entity();

		SessionFactory factory = new Configuration().configure("Banking.config.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(en);
		tx.commit();
		session.close();
		factory.close();
	}

	public void update() {

	}

	public void delete() {

	}

	public void view() {

	}
}
