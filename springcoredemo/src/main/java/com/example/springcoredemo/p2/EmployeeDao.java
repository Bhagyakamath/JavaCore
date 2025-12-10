package com.example.springcoredemo.p2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeDao {
	Session session=null;
	public EmployeeDao() {
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session=sessionfactory.openSession();
	}
	public void addEmployee(EmployeeEntity ob) throws Exception{
		Transaction tr=session.beginTransaction();
		session.save(ob);
		
		tr.commit();
	}
}
