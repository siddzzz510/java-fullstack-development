package Registerdata;

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
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

@WebServlet("/Registerdata")
public class Registerdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String room = request.getParameter("room");
		String mail = request.getParameter("mail");
		String adr = request.getParameter("adr");
		
		
	     PrintWriter out = response.getWriter();

		// TODO Auto-generated method stub
		try{ 
		    Class.forName("com.mysql.jdbc.Driver"); 
		    Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","siddhartha"); 
		    PreparedStatement st = con.prepareStatement("insert into detailes values(?, ?, ?, ?, ?)");
		    
		    
		     st.setString(1,name);
		     st.setString(2, number);
		     st.setString(3, room);
		     st.setString(4, mail);
		     st.setString(5, adr);
	     
	         /* Printing column names */ 
	        
		     
		     if(name == "") {
		    	 

			     out.println("<html><body><b>Not Booked"
			     + "</b></body></html>");

		    	 
		     }
		     else {
		    	
		              out.print("Name :"+name+"\n"+
		            		  "Number:"+number+"\n"+   
		            		  "Room:"+room+"\n"+
		            		  "Mail:"+mail+"\n"+
		            		  "adr:" + adr+"\n"+"Successfully Booked"); 
		              		    	 
		     }
		     
		     st.executeUpdate();
		     st.close();
		     con.close(); 
		     
		}catch(Exception e){
		      System.out.println(e);} 
		}
}
		
		
