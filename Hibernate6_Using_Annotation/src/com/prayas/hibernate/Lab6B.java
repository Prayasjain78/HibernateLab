package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab6B {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Employee emp=(Employee)session.load(Employee.class, 6);
		System.out.println(emp);
		CurrentEmployee cemp=(CurrentEmployee)session.load(CurrentEmployee.class, 7);
		System.out.println(cemp);
		OldEmployee oemp=(OldEmployee)session.load(OldEmployee.class, 8);
		System.out.println(oemp);
		WeekdayEmployee wdemp=(WeekdayEmployee)session.load(WeekdayEmployee.class, 9);
		System.out.println(wdemp);
		WeekendEmployee weemp=(WeekendEmployee)session.load(WeekendEmployee.class, 10);
		System.out.println(weemp);
		
		tx.commit();
		session.close();
		
	}catch(Exception e) {
		e.printStackTrace();
		if (tx!=null) {
			tx.rollback();
			
		}
	}
}
}
