package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab12A {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		Address add=new Address("YPR-02","Blore","Karnataka");
		session.save(add);
		Customer cust=new Customer("Ravi","Jain","jain.Ravi@hcl","70987");
		cust.setAddress(add);
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
