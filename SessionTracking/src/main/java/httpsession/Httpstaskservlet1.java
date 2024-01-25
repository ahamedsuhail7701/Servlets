package httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hshs")
public class Httpstaskservlet1 extends HttpServlet 
{
	static HttpSession session1;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
	    session1 = req.getSession();
		
		session1.setAttribute("email", email);
		session1.setAttribute("password", password);
		
		RequestDispatcher rs = req.getRequestDispatcher("Httpsessiontask2.html");
		rs.forward(req, resp);
	}
}
