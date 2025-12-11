package springmvcdemo.p1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class StudentDao {
	Session session=null;

	public StudentDao() throws Exception{
		super();
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session=sessionfactory.openSession();
	}
	public List<StudentEntity> getStudents() throws Exception{
		Transaction ts=session.beginTransaction();
		Query<StudentEntity> q1=session.createQuery("from StudentEntity");
		return q1.list();
		
	}
	
	public boolean findUser(LoginEntity le) throws Exception{
		LoginEntity le1=session.get(LoginEntity.class, le.getUsername());
		if(le1.getPassword().equals(le.getPassword())) {
			return true;
		}
		else
			return false;
	}
}
