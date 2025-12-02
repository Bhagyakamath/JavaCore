package p2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Addcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rs=request.getRequestDispatcher("addtwonum.jsp");
		try {
			AddDto ob1=new AddDto();
			ob1.setNum1(Integer.parseInt(request.getParameter("a1")));
			ob1.setNum2(Integer.parseInt(request.getParameter("a2")));
			AddModel ob2=new AddModel();
			ob2.add(ob1);
			request.setAttribute("addkey", ob1);
			rs.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			rs.forward(request, response);
		}
	}

}
