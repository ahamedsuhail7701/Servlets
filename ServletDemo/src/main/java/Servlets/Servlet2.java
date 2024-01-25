package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/suhail")
public class Servlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}
