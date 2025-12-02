package p2;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Studentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Studentcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rs=request.getRequestDispatcher("liststudents.jsp");
		try {
			StudentDao ob1=new StudentDao();
			request.setAttribute("addkey", ob1.getAllStudents());
			rs.forward(request, response);
		}catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			rs.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rs=request.getRequestDispatcher("student.jsp");
		try {
		StudentDao ob3=new StudentDao();
		StudentDto ob=new StudentDto();
		ob.setSroll(Integer.parseInt(request.getParameter("a1")));
		ob.setFirstname(request.getParameter("a2"));
		ob.setLname(request.getParameter("a3"));
		ob.setDob((new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("a4"))));
		ob.setGender(request.getParameter("a5"));
		StudentDao ob2=new StudentDao();
		ob3.editStudent(ob);
		request.setAttribute("msg", "Record updated");
		rs.forward(request, response);
		ob2.editStudent(ob);
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			rs.forward(request, response);
		}
		
	}

}
