package com.example.hibernatepractice.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernatepractice.entity.Marks1Entity;
import com.example.hibernatepractice.entity.Student1Entity;



public class Demo4 {
	public static void main(String[] args) {
		Session session=null;
		try {
			SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session=sessionfactory.openSession();
			Transaction tr= session.beginTransaction();
			Student1Entity ob=new Student1Entity();
			Marks1Entity ob1=new Marks1Entity();
			ob.setSid("1");
			ob.setName("Ram");
			List<Marks1Entity> l1=new ArrayList<Marks1Entity>();
			ob1.setId1("m1");
			ob1.setMarks(100);
			ob1.setTestno(1);
			ob1.setOb(ob);
			l1.add(ob1);
			session.save(ob);
			session.save(ob1);
			Marks1Entity ob2=new Marks1Entity();
			ob2.setId1("m2");
			ob2.setMarks(200);
			ob2.setTestno(2);
			ob2.setOb(ob);
			l1.add(ob2);
			
			ob.setL1(l1);
			session.save(ob2);
			
			tr.commit();
			System.out.println("Transaction completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
