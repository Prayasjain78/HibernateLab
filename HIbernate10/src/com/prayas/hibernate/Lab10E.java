package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10E {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		WeekendStudent wes=new WeekendStudent("Raman", "Pune", "Active",13000,11000, "10:00-12:00","BTM","HCL","raman.pune@hcl.com","12.5L");
		wes.setSid(1);
		session.save(wes);
		tx.commit();
		session.close();
	}catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
}
}
