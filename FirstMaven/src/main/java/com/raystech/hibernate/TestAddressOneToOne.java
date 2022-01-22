package com.raystech.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAddressOneToOne {
	public static void main(String[] args) {
		
		EmployeeHiber emp = new EmployeeHiber();
		emp.setFirstName("Pushpendra");
		emp.setLastName("Kushwah");
		
		Address a = new Address();
		a.setStreet("Pinto Park");
		a.setCity("Gwalior");
		a.setState("M P");
		
		emp.setEmpAdd(a);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(emp);
		tx.commit();
		s.close();
		
		System.out.println("one to one!!! successfull");
		
	}
}
