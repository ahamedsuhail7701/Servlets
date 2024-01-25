package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewstudent")
public class ViewStudent extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Suhail@7701");
			
			PreparedStatement ps = con.prepareStatement("select * from student where id = ?");
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rr = ps.executeQuery();
			rr.next();
			PrintWriter pr = resp.getWriter();
			pr.println(rr.getInt(1)); 
			pr.println(rr.getString(2));
			pr.println(rr.getInt(3));
		} 
		catch (ClassNotFoundException | SQLException e) {
			
		}
	}
}
