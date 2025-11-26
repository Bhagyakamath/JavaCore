package com.test.mavenproject1.p5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
//	private ResultSet performQuery(String query) {
//		
//	}
	
	public List<StudentDto> getAllStudents() throws Exception{
		Connection con=DbConnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();  //rs is a cursor which points data
		List<StudentDto> l1=new ArrayList<StudentDto>();
		
		ResultSetMetaData rm=rs.getMetaData();
		System.out.println(rm.getColumnCount());
		int c=rm.getColumnCount();
		for(int i=1; i<=c; i++) {
			System.out.println(rm.getColumnName(i)+" "+rm.getColumnType(i));
		}
		while(rs.next()) {
			l1.add(new StudentDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
		}
		return l1;
	}
	
	public StudentDto getById(StudentDto ob) throws Exception{
		Connection con=DbConnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student where sroll=?");
		ps.setInt(1, ob.getSroll());
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			ob.setFirstname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setDob(rs.getDate(4));
			ob.setGender(rs.getString(5));
		}
		else{
			throw new Exception("sroll "+ob.getSroll()+" does not exist");
		}
		return ob;
	}
	
	 public void insertStudents(StudentDto ob) throws Exception{
		 Connection con=DbConnector.getConnection();
		 PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		 ps.setInt(1, ob.getSroll());
		 ps.setString(2, ob.getFirstname());
		 ps.setString(3, ob.getLname());
		 ps.setDate(4, ob.getDob());
		 ps.setString(5, ob.getGender());
		 int u=ps.executeUpdate();
		 if(u!=1) {
			 System.out.println("Could not able to insert");
		 }
		 
	 }
	 
	 public void deleteStudent(StudentDto ob) throws Exception{
		 Connection con=DbConnector.getConnection();
		 PreparedStatement ps=con.prepareStatement("delete from student where sroll=?");
		 ps.setInt(1, ob.getSroll());
		 int rs=ps.executeUpdate();
	 }
	 
	 
}
