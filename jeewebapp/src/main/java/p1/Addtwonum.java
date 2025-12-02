package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addtwonum
 */
public class Addtwonum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addtwonum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			out.print("<html><body>");
			out.print("<form action='Addtwonum' method='post'>");
			out.print("<br><h1> Addition of Two Numbers</h1> <br><hr>");
			out.print("<br> Enter number 1: <input type='text' name='a1' value='0'>");
			out.print("<br> Enter number 2: <input type='text' name='a2' value='0'>");
			out.print("<br> Result: <input type='text' name='a3' value='0'>");
			out.print("<br> <input type='submit' value='click to add'>");
			out.print("</form>");
			out.print("</body></html>");
		} catch (Exception e) {
			out.print("There is an exception"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			
			int a=Integer.parseInt(request.getParameter("a1"));
			int b=Integer.parseInt(request.getParameter("a2"));
			int c=a+b;
			out.print("<html><body>");
			out.print("<form action='Addtwonum' method='post'>");
			out.print("<br><h1> Addition of Two Numbers</h1> <br><hr>");
			out.print("<br> Enter number 1: <input type='text' name='a1' value='"+a+"'>");
			out.print("<br> Enter number 2: <input type='text' name='a2' value='"+b+"'>");
			out.print("<br> Result: <input type='text' name='a3' value='"+c+"'>");
			out.print("<br> <input type='submit' value='click to add'>");
			out.print("</form>");
			out.print("</body></html>");
		} catch (Exception e) {
			out.print("There is an exception"+e.getMessage());
		}
	}

}
