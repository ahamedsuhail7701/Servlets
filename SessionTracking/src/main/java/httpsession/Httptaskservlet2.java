package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hshs1")
public class Httptaskservlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Object s1 = Httpstaskservlet1.session1.getAttribute("email");
		Object s2 = Httpstaskservlet1.session1.getAttribute("password");
		
		PrintWriter ps = resp.getWriter();
		ps.println(s1);
		ps.println(s2);
	
	}
}
