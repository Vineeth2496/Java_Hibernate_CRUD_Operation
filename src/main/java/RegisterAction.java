

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Dao;
import com.model.Data;

public class RegisterAction extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i=request.getParameter("id");
		Integer id=Integer.parseInt(i);
		String fullname=request.getParameter("fn");
		String email=request.getParameter("em");
		String password=request.getParameter("pa");
		
		PrintWriter out=response.getWriter();
		
		Data d=new Data();
		d.setId(id);
		d.setFullname(fullname);
		d.setEmail(email);
		d.setPassword(password);
		
		Dao s=new Dao();
		int res=s.register_logics(d);
		
		out.println("<html>");
		out.println("<center>");
		out.println("<h2>"+"Record Updated Sucessfully"+"</h2>");
		RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		rd.include(request, response);
		out.println("</center>");
		out.println("</html>");
		
		
		
	}

}
