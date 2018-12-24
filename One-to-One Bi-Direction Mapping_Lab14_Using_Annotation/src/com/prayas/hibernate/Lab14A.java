package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab14A {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Address add=new Address("RameshKaloni", "Afjalpur", "U.P");
		session.save(add);
		Customer cust=new Customer("Ravi","Nagar","Ravi.Nagar@gmail.com","32277");
		session.save(cust);
		cust.setAddress(add);
		tx.commit();
		session.close();
		System.out.println("record inserted");
		
	}catch(Exception e) {
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
}
}
