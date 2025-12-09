package com.example.hibernatepractice.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernatepractice.entity.MinisterEntity;
import com.example.hibernatepractice.entity.ProfileEntity;

public class Demo8 {
	public static void main(String[] args) {
		Session session=null;
		Session session1=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			session1=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			MinisterEntity ob=session.get(MinisterEntity.class, "1");
			MinisterEntity ob1=session1.get(MinisterEntity.class, "1");
			System.out.println(ob.getName()+" "+ob1.getName());
			
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
