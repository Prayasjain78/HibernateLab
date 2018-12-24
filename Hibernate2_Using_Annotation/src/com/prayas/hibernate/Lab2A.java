package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2A {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("Yogesh","Yogesh@gmail.com",7030095805L,"BLORE",100000.0);
			session.save(cust);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		
			if(tx!=null)
				tx.rollback();
		}
	}
	

}
