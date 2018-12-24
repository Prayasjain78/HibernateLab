package com.prayas.hibernate;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Lab4A {
public static void main(String[] args) {
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String cous[]= {"JAVA","JDBC","JSP"};
		List<String> ems=new ArrayList<String>();
		ems.add("aaa@gmail.com");
		ems.add("bbb@gmail.com");
		ems.add("ccc@gmail.com");
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(new Integer(100));
		marks.add(new Integer(99));
		marks.add(new Integer(95));
		
		Set<Long> phs=new HashSet<Long>();
		phs.add(new Long(1111));
		phs.add(new Long(2222));
		phs.add(new Long(3333));
		
		
		Map<String,Long> refs=new HashMap<String,Long>();
		refs.put("aaa", new Long(1111));
		refs.put("bbb", new Long(2222));
		refs.put("ccc", new Long(3333));
		
		Student stu=new Student("prayas","03-03-1992","BE",cous,ems,marks,phs,refs);
		session.save(stu);
		tx.commit();
		session.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
