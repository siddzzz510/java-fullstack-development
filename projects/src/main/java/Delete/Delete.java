package Delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
	     PrintWriter out = response.getWriter();

		// TODO Auto-generated method stub
		try{ 
		    Class.forName("com.mysql.jdbc.Driver"); 
		    Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","siddhartha"); 
		    PreparedStatement st = con.prepareStatement("DELETE FROM detailes WHERE name =?");
		    
		    
		     st.setString(1,name);
		
		     st.executeUpdate();
		     st.close();
		     con.close(); 
		     out.println("<html><body><b>Successfully Deleted"
		     + "</b></body></html>");
		}catch(Exception e){
		      System.out.println(e);} 
		}
		}
