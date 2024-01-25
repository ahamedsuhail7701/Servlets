package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchcookies")
public class FetchingCookiesFromBrowser extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie [] cookies = req.getCookies();
		for(int i =0;i<cookies.length;i++)
		{
			Cookie c = cookies[i];
			System.out.println(c.getName());
			System.out.println(c.getValue());
			
			PrintWriter ps = resp.getWriter();
			ps.println("<h3>"+c.getName()+"</h3>");
			ps.println("<h3>"+c.getValue()+"</h3>");
			
			resp.setContentType("text/html");
		}
	}
}
