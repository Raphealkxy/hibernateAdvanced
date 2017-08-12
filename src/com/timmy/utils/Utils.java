package com.timmy.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Utils {
	private static SessionFactory sessionFactory;
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
	
		// 创建sessionfactory对象
		 sessionFactory=cfg.buildSessionFactory();
		
		
		
	}
	
	public  static SessionFactory getSessionFactory()
	{
		
		return sessionFactory;
	}
	
//	public static void main(String []args)
//	{
//		Session session=getSessionFactory().openSession();
//		Transaction tx=session.beginTransaction();
//		tx.commit();
//		session.close();
//	     sessionFactory.close();
//	}
}
