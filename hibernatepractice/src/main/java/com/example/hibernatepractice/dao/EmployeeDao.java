package com.example.hibernatepractice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.hibernatepractice.entity.EmployeeEntity;
import com.example.hibernatepractice.entity.EmployeeSalary;
import com.example.hibernatepractice.entity.SalaryEntity;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;



public class EmployeeDao {
	Session session=null;

	public EmployeeDao() throws Exception{
		super();
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session=sessionfactory.openSession();
	}
	public void addEmployee(EmployeeEntity  ob) throws Exception{
		Transaction ts=session.beginTransaction();
		session.save(ob);
		ts.commit();
	}
	public void deleteEmployee(EmployeeEntity ob) throws Exception{
		Transaction ts=session.beginTransaction();
		session.delete(ob);
		ts.commit();
	}
	public void updateEmployee(EmployeeEntity ob) throws Exception{
		Transaction ts=session.beginTransaction();
		session.update(ob);
		ts.commit();
	}
	public List<EmployeeEntity> listEmployee() throws Exception{
		Transaction ts=session.beginTransaction();
		Query q1=session.createQuery("From EmployeeEntity");
		List<EmployeeEntity> l1=q1.list();
		ts.commit();
		return l1;
	}
	public List<EmployeeEntity> listEmployeeNativeQuery() throws Exception{
		Transaction ts=session.beginTransaction();
		Query q1=session.createNativeQuery("select * from Employee1", EmployeeEntity.class);
		List<EmployeeEntity> l1=q1.getResultList();
		ts.commit();
		return l1;
	}
	public List<EmployeeEntity> searchById(String eid1) throws Exception{
		Transaction ts=session.beginTransaction();
		Query q1=session.createQuery("From EmployeeEntity where eid=:eid");
		q1.setParameter("eid", eid1);
		List<EmployeeEntity> l1=q1.list();
		ts.commit();
		return l1;
	}
	public List<EmployeeEntity> searchByName(String name) throws Exception{
		Transaction ts=session.beginTransaction();
		Query q1=session.createQuery("From EmployeeEntity where fname=:fname");
		q1.setParameter("fname", name);
		List<EmployeeEntity> l1=q1.list();
		ts.commit();
		return l1;
	}
	
	public void addSalary(SalaryEntity ob) throws Exception{
		Transaction ts=session.beginTransaction();
		session.save(ob);
		ts.commit();
	}
	
	public List<EmployeeSalary> getEmployeeSalary() throws Exception{
		Transaction ts=session.beginTransaction();
		Query q1=session.createQuery("From EmployeeSalary");
		List<EmployeeSalary> l1=q1.list();
		ts.commit();
		return l1;
	}
	public void addEmployeeSalary(EmployeeSalary  ob) throws Exception{
		Transaction ts=session.beginTransaction();
		session.save(ob);
		ts.commit();
	}
}
