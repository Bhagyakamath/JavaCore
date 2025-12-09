package com.example.hibernatepractice.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernatepractice.entity.CitizenEntity;
import com.example.hibernatepractice.entity.MinisterEntity;
import com.example.hibernatepractice.entity.ProfileEntity;
import com.example.hibernatepractice.entity.PropertyEntity;

public class Demo6 {

	public static void main(String[] args) {
		Session session=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			CitizenEntity ob=new CitizenEntity();
			PropertyEntity ob1=new PropertyEntity();
			ob.setId("1");
			ob.setName("Rahul");
			ob1.setSiteno("21/2");
			ob1.setPropertyname("Duplex house");
//			
			PropertyEntity ob2=new PropertyEntity();
//			
			ob2.setSiteno("21/3");
			ob2.setPropertyname("Shopping complex");
			ob.getProperty().add(ob1);
			ob.getProperty().add(ob2);
			ob1.getCitizen().add(ob);
			ob1.getCitizen().add(ob);
//			session.save(ob);
			session.save(ob1);
			session.save(ob2);
			
			ob2=new PropertyEntity();
			ob2.setSiteno("21/4");
			ob2.setPropertyname("Housing complex");
			ob.getProperty().add(ob2);
			ob2.getCitizen().add(ob);
			session.save(ob);
			session.save(ob2);
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
