package p4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page="login1.jsp";
		String msg="Invalid user";
		try {
			String uname=request.getParameter("a1");
			String pword=request.getParameter("a2");
			if(uname.equals("admin") && pword.equals("admin123")) {
				page="home.jsp";
				msg="Login successful";
				HttpSession session= request.getSession();
				session.setAttribute("uname", uname);
			}
			else {
				HttpSession session= request.getSession();
				session.invalidate();
			}
			RequestDispatcher rs=request.getRequestDispatcher(page);
			request.setAttribute("msg", msg);
			rs.forward(request, response);
		} catch (Exception e) {
			
		}
	}

}
