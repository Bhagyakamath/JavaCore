package com.example.hibernatepractice.demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.hibernatepractice.entity.MinisterEntity;

public class Demo9 {

	public static void main(String[] args) {
		Session session=null;
		Session session1=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			session1=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			Query<MinisterEntity> q1=session.createQuery("From MinisterEntity");
			Query<MinisterEntity> q2=session.createQuery("From MinisterEntity where name=:name");
			
			List<MinisterEntity> l1=q1.list();
			l1.forEach((x)->{
				System.out.println(x.getId()+" "+x.getName());
			});
			q2.setParameter("name", "Siddaramayya");
			l1=q2.list();
			l1.forEach((x)->{
				System.out.println(x.getId()+" "+x.getName());
			});
			
			
			//Named Query
			Query<MinisterEntity> q3=session.getNamedQuery("minister.q1");
			l1=q3.list();
			l1.forEach((x)->{
				System.out.println(x.getId()+" "+x.getName());
			});
			
			
			
			
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
