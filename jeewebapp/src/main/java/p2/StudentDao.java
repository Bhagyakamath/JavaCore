package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class StudentDao {
	public List<StudentDto> getAllStudents() throws Exception{
		Connection co=Dbconnect.getConnection();
		PreparedStatement ps=co.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		List<StudentDto> l1=new ArrayList<StudentDto>();
		while(rs.next()) {
			l1.add(new StudentDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
		}
		return l1;
	}
	
	public void editStudent(StudentDto ob) throws Exception{
		Connection co=Dbconnect.getConnection();
		PreparedStatement ps=co.prepareStatement("update student set firstname=?, lname=?, dob=? where sroll=?");
		ps.setString(1, ob.getFirstname());
		ps.setString(2, ob.getLname());
		ps.setDate(3, ob.getDob());
		ps.setInt(4, ob.getSroll());
		ps.executeUpdate();
		
	}
}
