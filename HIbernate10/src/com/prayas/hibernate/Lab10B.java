package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10B {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
		   CurrentStudent cs=new CurrentStudent("Raaj","BLORE","Active",15000,5000,"7:00-9:00","Mathekere");
		cs.setSid(1);
		session.save(cs);
		tx.commit();
		session.close();
		}catch(Exception e) {
			e.printStackTrace();
			
				tx.rollback();
		}
	}
}
