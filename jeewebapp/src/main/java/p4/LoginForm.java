package p4;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LoginForm extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		try {
			out.print("<div>Enter username: <input type='text' name='a1' value=''/></div>");
			out.print("<div>Enter password: <input type='password' name='a2' value=''/></div>");
			out.print("<input type='submit'  value='Login'/>");
		}catch (Exception e) {
			out.print(e.getMessage());
		}
	}
}
