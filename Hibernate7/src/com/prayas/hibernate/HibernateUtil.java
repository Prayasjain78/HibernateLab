package com.prayas.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
static SessionFactory factory;
static {
	Configuration cfg=new Configuration();
	cfg=cfg.configure();
	StandardServiceRegistryBuilder ssrBulider=new StandardServiceRegistryBuilder();
	StandardServiceRegistry ssRegitry=ssrBulider.applySettings(cfg.getProperties()).build();
	factory=cfg.buildSessionFactory(ssRegitry);
}
public static SessionFactory getSessionFactory(){
	return factory;
	
}

}
