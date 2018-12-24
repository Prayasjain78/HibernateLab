package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10A {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Student st=new Student("Prayas","BLOR","Active",18000);
		st.setSid(1);
	session.save(st);
	tx.commit();
	session.close();
	}catch(Exception e) {
		e.printStackTrace();
		
			tx.rollback();
	}
}
}
