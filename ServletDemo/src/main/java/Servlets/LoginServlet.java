package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String userEmail = "ahamedsuhail7701@gmail.com";
		String userPassword = "1234";
		
		String enteredEmail = req.getParameter("email");
		String enteredPassword = req.getParameter("password");
		
		if(userEmail.equals(enteredEmail)&&userPassword.equals(enteredPassword))
		{
			RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
			rd.forward(req, res);
		}
		else
		{
			PrintWriter ps = res.getWriter();
			ps.println("Invalid Creditials");
			
			RequestDispatcher rd = req.getRequestDispatcher("LoginForm.html");
			rd.include(req, res);
			
			res.setContentType("text/html");//setContentType() method specifies the browser that response will be in the form of text or html
			
		}
	}

}
