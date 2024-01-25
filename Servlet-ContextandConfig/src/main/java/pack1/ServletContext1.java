package pack1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletContext1 extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletContext d = getServletContext();
		String s4 = d.getInitParameter("kk");
		
		System.out.println(s4);
		
		
	}

}
