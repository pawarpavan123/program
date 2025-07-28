package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Loginentity;

public class service_loginC {
public void Add(String username,String password) {
	Loginentity log=new Loginentity();
SessionFactory Factory = new Configuration().configure("HR.cfg.xml").buildSessionFactory();

Session session = Factory.openSession();


//session.merge(login);
//session.createQuery("");
//session.flush();
Transaction tx=session.beginTransaction();
session.save(log);
tx.commit();
session.close();
Factory.close();



}
public void update() {
	
	
}
public void delete() {
	
}
public void view() {
	
}

}
