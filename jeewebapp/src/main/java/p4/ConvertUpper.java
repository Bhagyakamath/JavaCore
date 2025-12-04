package p4;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class ConvertUpper extends BodyTagSupport{
	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;
		
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try {
			String body=bodyContent.getString();
			String upper=body.toUpperCase();
			out.print(upper);
			
		}catch (Exception e) {
			
		}
		return super.doEndTag();
	}
}
