package com.prayas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab6A {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		tx=session.beginTransaction();
		
		//1.Adding the Employee
		Employee emp=new Employee("Rahul","Indore","Disabled",15000.0);
		Integer it=(Integer)session.save(emp);
		System.out.println(it.intValue());
		
		//Adding the CurrentEmployee
		CurrentEmployee cemp=new CurrentEmployee("Arif","Delhi","Enabled",18000.0,25000.0,"7:30 A.M","Pune");
		it=(Integer)session.save(cemp);
		System.out.println(it.intValue());
				
		//Adding the OLDEmployee
		OldEmployee oemp=new OldEmployee("Mohan", "BLORE", "Enabled", 17000.0,"SDSOFT","AA@SD.com",9.0);
		it=(Integer)session.save(oemp);
		System.out.println(it.intValue());
		
		//Adding the WeekdayStudent
		WeekdayEmployee wdemp=new WeekdayEmployee("Rudra", "Kanpur", "Enabled",15000.0, 50000.0, "06:30 pm", "Mathekere","B.Tech","85.5",2013);
		it=(Integer)session.save(wdemp);
		System.out.println(it.intValue());
		
		//Adding the Weekend Employee
		WeekendEmployee wemp=new WeekendEmployee("CC", "Pune", "Enabled", 250000, 20000.0, "05:30PM", "HSR", "SDSOFT", "CCsdsoft", 9.0);
		it=(Integer)session.save(wemp);
		System.out.println(it.intValue());
		tx.commit();
		session.close();
		
				
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
