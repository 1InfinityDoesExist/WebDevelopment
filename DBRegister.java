import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DBRegister extends HttpServlet
{
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String connectionClass_driver = "com.mysql.cj.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "employee";
	String username = "root";
	String password = "iit2014006";
	String sql = "INSERT INTO LOGIN VALUES(?, ?)" ;
	
	public void init(ServletConfig fconfig) throws ServletException
	{
		try
		{
			Class.forName(connectionClass_driver);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			con = DriverManager.getConnection(connectionUrl + dbName, username, password);
			pstmt = con.prepareStatement(sql);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uName = (String)request.getAttribute("n");
		String pass = (String)request.getAttribute("p");
		try{
			pstmt.setString(1, uName);
			pstmt.setString(2, pass);
			
			int k = pstmt.executeUpdate();
			if(k != 0)
			{
				out.println("Successfully Registed...!!!1");
				RequestDispatcher rd = request.getRequestDispatcher("SignIn.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("404 Error...!!!!");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void destroy()
	{
		try
		{
			if(pstmt != null)
			{
				pstmt.close();
			}
			if(con != null)
			{
				pstmt.close();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
