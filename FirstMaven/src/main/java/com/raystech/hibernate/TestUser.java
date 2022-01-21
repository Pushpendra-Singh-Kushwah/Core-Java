package com.raystech.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TestUser {
	public static void main(String[] args) {
		// add();
		// update();
		// delete();
		// select(); // in this select method we use criteria, in hibernate criteria is used in place of select query, 
		// printSingleAttribute();
		// printMultipleAttribute();
		 getparts_Restrictions();
		// SelectedAttribute_Projection();
		
	}
	private static void SelectedAttribute_Projection() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		Criteria criteria = s.createCriteria(User.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("id"));
		//p.add(Projections.property("fName"));
		
		criteria.setProjection(p);
        List list = criteria.list();
        
        System.out.println(list);
		}
	
	private static void getparts_Restrictions() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		Criteria criteria = s.createCriteria(User.class);
		// criteria.add(Restrictions.like("lName","S%"));
		 // criteria.add(Restrictions.eq("pwd", "2020")); 
		criteria.add(Restrictions.gt("id", 2));    // check this also
		 List<User> list = criteria.list();          
		
		for (User u: list) {
			System.out.println(u.getId());
			System.out.println(u.getfName());
			System.out.println(u.getlName());
			System.out.println(u.getUserId());
			System.out.println(u.getPwd());
		}
			
		}


	private static void printMultipleAttribute() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		Query q = s.createQuery("select p.fName, p.lName from User p ");
		// we can give any object to User table, here we give s, we can give anything a,b,c,etc
		List list = q.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object str [] = (Object[]) it.next();
			System.out.println(str[0]);
			System.out.println(str[1]);
		}

		tx.commit();
		s.close();

		System.out.println("----print multiple attribute run successfully---");

	}

	public static void printSingleAttribute() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		Query q = s.createQuery("select s.fName from User s ");
		// we can give any object to User table, here we give s, we can give anything
		// a,b,c,etc
		List list = q.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		tx.commit();
		s.close();

		System.out.println("----print single attribute run successfully---");
	}

	public static void select() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		Criteria criteria = s.createCriteria(User.class);

		List<User> list = criteria.list();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			User u = (User) it.next();
			System.out.println(u.getId());
			System.out.println(u.getfName());
			System.out.println(u.getlName());
			System.out.println(u.getUserId());
			System.out.println(u.getPwd());
		}

		tx.commit();
		s.close();

		System.out.println("----select runs successfully---");

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
		a.setfName("Satyam");
		a.setlName("Singh");
		a.setUserId("ss");
		a.setPwd("2022");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(a);
		tx.commit();
		s.close();

		System.out.println("Add");

	}
}
