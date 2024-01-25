package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/savestudent")
public class SavingStudentTODB extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Suhail@7701");
			
			PreparedStatement ps = con.prepareStatement("insert into student(id,name,age) values(?,?,?)");
			
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setInt(3, Integer.parseInt(age));
			
			ps.execute();
			
			PrintWriter pr = res.getWriter();
			pr.println("<h1> Welcome "+name+"</h1>");
			pr.println("<a href = StudentForm.html>Save another Student</a>");
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
