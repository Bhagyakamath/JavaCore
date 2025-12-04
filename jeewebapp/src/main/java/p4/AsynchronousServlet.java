package p4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AsynchronousServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsynchronousServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		AsyncContext aynccontext=request.startAsync();
		out.print("<html><body><h1>Asynchronous Progress Bar</h1>");
		out.print("<progress id='a1' max='100'></progress>");
		aynccontext.start(()->{
			out.println(Thread.currentThread().getName());
			int i=0;
			while(i<=100) {
				out.print("<script> document.getElementById('a1').value=\""+ i++ + "\"</script>");
				out.flush();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
			}
		});
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
