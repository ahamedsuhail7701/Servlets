package httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//here we are going to save the data in the server using HTTP session technique Dynamically

@WebServlet("/httpsession1")
public class HttpSessiondynamically extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String status = req.getParameter("status");
		String age = req.getParameter("age");
		
		HttpSession s1 = req.getSession();
		//adding the data to session object
		s1.setAttribute("id", Integer.parseInt(id));
		s1.setAttribute("name", name);
		s1.setAttribute("status", Boolean.parseBoolean(status));
		s1.setAttribute("age", Integer.parseInt(age));
		
		
		System.out.println(s1.getAttribute("id"));
		System.out.println(s1.getAttribute("name"));
		System.out.println(s1.getAttribute("status"));
		System.out.println(s1.getAttribute("age"));
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req,resp);
	}
	

}
