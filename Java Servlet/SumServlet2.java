

import jakarta.servlet.ServletException;
import java.io.*;  
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SumServlet2
 */
public class SumServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		{
	         try
	        {
	        PrintWriter out=response.getWriter();
	        response.setContentType("text/html");
	        int a=Integer.parseInt(request.getParameter("no1"));
	        int b=Integer.parseInt(request.getParameter("no2"));
	        int c=a+b;
	        out.println("<html>");
	        out.println("<body bgcolor=powderblue>");
	        out.println("<font color=black>");
	        out.println("<h1> <center> Sum of Two Numbers </center> </h1>");
	        out.println("<h2> <center> Sum of " + a + "  and  " + b + "   is   "+  c + "</center></h2>");
	        out.println("</font>");
	        out.println("</html>");
	        out.println("<body>");
	        }
	        catch(Exception e){}
	        
	    
	    }
	
	}

}
