package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10D {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		WeekdayStudent wds=new WeekdayStudent("Arun", "Indore", "Active", 12000, 14000, "10:00-5:00", "Bhavarkua", "MSC", "67%", "2015");
		wds.setSid(1);
		session.save(wds);
		tx.commit();
		session.close();
		
	}catch(Exception e) {
		e.printStackTrace();
		tx.rollback();
	}
}
}
