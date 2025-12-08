package com.example.hibernatepractice.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernatepractice.entity.CitizenEntity;
import com.example.hibernatepractice.entity.MinisterEntity;
import com.example.hibernatepractice.entity.PropertyEntity;

public class Demo7 {

	public static void main(String[] args) {
		Session session=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			//Level 1 caching
			MinisterEntity m1=session.get(MinisterEntity.class, "1");
			System.out.println(m1.getId()+" "+m1.getName());
			MinisterEntity m2=session.get(MinisterEntity.class, "2");
			System.out.println(m1.getId()+" "+m1.getName());
			
			
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
