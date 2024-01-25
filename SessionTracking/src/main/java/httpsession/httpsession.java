package httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpsession")
public class httpsession extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session1 = req.getSession();
		
		session1.setAttribute("id", 101);
		session1.setAttribute("name", "Suhail");
		session1.setAttribute("status", true);
		session1.setAttribute("age", 22);
		
		HttpSession session2 = req.getSession();
		
		System.out.println(session2.getAttribute("id"));
		System.out.println(session2.getAttribute("name"));
		System.out.println(session2.getAttribute("status"));
		System.out.println(session2.getAttribute("age"));
		System.out.println(session2.getAttribute("Shifa"));
	}
}
