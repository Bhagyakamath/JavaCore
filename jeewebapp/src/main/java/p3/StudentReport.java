package p3;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import p2.StudentDao;
import p2.StudentDto;

public class StudentReport extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		StudentDao s=new StudentDao();
		try {
			List<StudentDto> l1=s.getAllStudents();
			out.print("<h1>All Student List</h1>");
			out.print("<table border='1'>");
			out.print("<tr><th>Roll Number</th>");
			out.print("<th>First Name</th>");
			out.print("<th>Last Name</th>");
			out.print("<th>Date of Birth</th>");
			out.print("<th>Gender</th></tr>");
			for(int i=0; i<l1.size(); i++) {
				out.print("<tr><td>"+l1.get(i).getSroll()+"</td>");
				out.print("<td>"+l1.get(i).getFirstname()+"</td>");
				out.print("<td>"+l1.get(i).getLname()+"</td>");
				out.print("<td>"+l1.get(i).getDob()+"</td>");
				out.print("<td>"+l1.get(i).getGender()+"</td></tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
