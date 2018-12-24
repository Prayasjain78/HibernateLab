package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10C {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			OldStudent os=new OldStudent("Raju", "Nagpur", "Active", 15000, "CTS", "raju123@gmail.com", "4.5L");
			os.setSid(1);
			session.save(os);
			tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
