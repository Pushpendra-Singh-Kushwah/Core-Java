package com.raystech.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUser {
	public static void main(String[] args) {
		add();
		//update();
		//delete();
	}

	private static void delete() {
		User a = new User();
		a.setId(1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.delete(a);
		tx.commit();
		s.close();
		
		System.out.println("delete");
		
	}

	private static void update() {
		
		User a = new User();
		a.setId(1);
		a.setfName("Anshu");
		a.setlName("Bhadouria");
		a.setUserId("ansh");
		a.setPwd("1111");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.update(a);
		tx.commit();
		s.close();
		
		System.out.println("update");
		
	}

	private static void add() {
		User a = new User();
		a.setfName("Shiv");
		a.setlName("Deep");
		a.setUserId("sd");
		a.setPwd("2020");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(a);
		tx.commit();
		s.close();
		
		System.out.println("Add");
		
	}
}
