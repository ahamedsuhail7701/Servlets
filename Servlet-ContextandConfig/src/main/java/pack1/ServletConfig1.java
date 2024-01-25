package pack1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfig1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
//		ServletConfig s = getServletConfig();
//		String s1 = s.getInitParameter("username");
//		String s2 = s.getInitParameter("databaseurl");
//		String s3 = s.getInitParameter("databasepassword");
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
//		ServletContext d = getServletContext();
//		String s4 = d.getInitParameter("Application Name");
//		
//		System.out.println(s4);
//		
	}

}
