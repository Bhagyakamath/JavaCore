package com.example.hibernatepractice.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernatepractice.entity.Marks1Entity;
import com.example.hibernatepractice.entity.MinisterEntity;
import com.example.hibernatepractice.entity.ProfileEntity;
import com.example.hibernatepractice.entity.Student1Entity;

public class Demo5 {
	public static void main(String[] args) {
		Session session=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			MinisterEntity ob=new MinisterEntity();
			ProfileEntity ob1=new ProfileEntity();
			ob.setId("1");
			ob.setName("Siddaramayya");
			ob1.setProfileid("p1");
			ob1.setProfilename("Home Minister");
			ob1.setOb(ob);
			ob.setP1(ob1);
			session.save(ob);
			session.save(ob1);
			
			
			
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
