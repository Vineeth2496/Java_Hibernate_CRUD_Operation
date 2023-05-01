

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Dao;
public class LoginAction extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("pass");
		
		PrintWriter out=response.getWriter();
		
		String remail=null, rpassword=null;
		Dao s=new Dao();
		Vector v=s.login_logics();
		
		HttpSession hs=request.getSession();
		
		if(v.contains(email) && v.contains(password))
		{
			hs.setAttribute("email", email);
			hs.setAttribute("pass", password);
			out.println("WELCOME TO LOGIN PAGE");
		//	RequestDispatcher rd=request.getRequestDispatcher("FetchAction");
		//	rd.forward(request, response);
		}
		else
		{
			out.println("<html>");
			out.println("<center>");
			out.println("<h1 style='color:red;'>Invalid Username or Password</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
			out.println("</center>");
			out.println("</html>");
		}
		
	}
}
