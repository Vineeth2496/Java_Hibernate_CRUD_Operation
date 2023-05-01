

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Dao;
import com.model.Data;
public class FetchAction extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
	//	HttpSession hs=request.getSession(false);
	//	if(hs!=null)
	//	{
			out.println("<html>");
			out.println("<center>");			
			out.println("WELCOME TO MVC CRUID OPERATION USING HIBERNATE STREAM");
	//		String email=(String) hs.getAttribute("email");
			
	//		Data d=new Data();
	//		d.setEmail(email);
			
			Dao s=new Dao();
			List<Data> lis=s.fetch_profile();
			
			for(Data dd: lis )
			{
				out.println("<table border=3>");
				out.println("<tr>");
				out.println("<th>"+"User Id"+"</th>");
				out.println("<th>"+"FullName"+"</th>");
				out.println("<th>"+"Email"+"</th>");
				out.println("<th>"+"Password"+"</th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>"+dd.getId()+"</td>");
				out.println("<td>"+dd.getFullname()+"</td>");
				out.println("<td>"+dd.getEmail()+"</td>");
				out.println("<td>"+dd.getPassword()+"</td>");
				out.println("</tr>");
				out.println("</table>");
			}
			out.println("<a href='endSer'>Logout</a>");
			out.println("</center>");
			out.println("</html>");
	/*	}
		else
		{
			out.println("<html>");
			out.println("<center>");
			out.println("<h1 style='color:red;'>Enter Email and Password</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
			out.println("</center>");
			out.println("</html>");
		}
	*/
		
	}
}
