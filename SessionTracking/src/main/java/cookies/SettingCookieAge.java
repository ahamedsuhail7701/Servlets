package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/settingcookieage")
public class SettingCookieAge extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email =  req.getParameter("email");
		String password = req.getParameter("password");
		
		Cookie c1 = new Cookie("email",email);
		c1.setMaxAge(10); // unit in seconds
		Cookie c2 = new Cookie("password",password);
		c2.setMaxAge(100);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		PrintWriter ps = resp.getWriter();
		ps.println("<h1> cookies saved successfully</h1>");
	}
}
