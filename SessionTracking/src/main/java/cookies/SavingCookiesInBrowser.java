package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecookies")
public class SavingCookiesInBrowser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie cookie1 = new Cookie("name","Suhail");
		Cookie cookie2 = new Cookie("age","24");
		Cookie cookie3 = new Cookie("email","ahamedsuhail7701@gmail.com");
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		PrintWriter ps = resp.getWriter();
		ps.println("<h1> cookies saved successfully</h1>");
	}
}
