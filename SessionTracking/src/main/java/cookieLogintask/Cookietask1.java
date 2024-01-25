package cookieLogintask;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hometologin")
public class Cookietask1 extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie []  cookies = req.getCookies();
		
		
			if(cookies==null)
			{
				RequestDispatcher rd = req.getRequestDispatcher("logincookietask.html");
				rd.forward(req, resp);
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("welcomecookietask.html");
				rd.forward(req, resp);
			}
			
			
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
}

