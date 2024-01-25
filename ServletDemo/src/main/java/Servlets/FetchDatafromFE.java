package Servlets;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetchingdatafromfrontend")
public class FetchDatafromFE extends GenericServlet {
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String monday  = req.getParameter("monday");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(monday);
		
		//writing in the Browser
		PrintWriter ps = res.getWriter();
		ps.println("Hello good afternoon....");
		
		ps.println("Welcome...."+name);
	}

}

