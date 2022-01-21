package com.raystech.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBidOneToMany {
	public static void main(String[] args) {
		AuctionItem a = new AuctionItem();
		a.setDescription("Frame");
		
		Bid one = new Bid();
		one.setAmount(500);
		
		Bid two = new Bid();
		two.setAmount(2000);
		
		Set bids = new HashSet();
		bids.add(one);
		bids.add(two);
		
		a.setBids(bids);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(a);
		tx.commit();
		s.close();
		
		System.out.println("added to bids");
	}
}
