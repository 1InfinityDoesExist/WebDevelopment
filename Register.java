import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String un = request.getParameter("username");
		String ps = request.getParameter("pass");
		
		request.setAttribute("n" , un);
		request.setAttribute("p" , ps);
		
		RequestDispatcher rd = request.getRequestDispatcher("/dbreg");
		rd.forward(request, response);
	}
}
