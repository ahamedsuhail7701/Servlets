package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fdffestodb")
public class FetchingdataFromFEandSendingToDatabase extends GenericServlet{

	static String id;
	static String name;
	static String age;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
	
		 id = req.getParameter("id");
		 name = req.getParameter("name");
		 age = req.getParameter("age");
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(age);
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		 try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatafromfe","root","Suhail@7701")) {
	            String sql = "insert into userdata(id,name,age) values (?,?,?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	                preparedStatement.setString(1, id);
	                preparedStatement.setString(2, name );
	                preparedStatement.setString(3, age);
	                preparedStatement.executeUpdate();
	                System.out.println("Values updated to database");
	            }
	        } catch (Exception e) {
	            e.printStackTrace(); 
	        }
		 
	}
}