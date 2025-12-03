package p3;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Welcome extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.print("Welcome to J2EE application" + new Date());
	}
}
