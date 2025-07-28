package services;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.studententity;

public class serclass {
	public void add(String name, String address, String id,String city) {
		studententity obj = new studententity();
		SessionFactory factory=new Configuration().configure("hbm.cfg.xml").buildSessionFactory();
	}

}
