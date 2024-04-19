

import jakarta.servlet.ServletException;
import java.io.*;  
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DisplayNameServlet
 */
public class DisplayNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		{
            
	        try
	        {
	        PrintWriter out =response.getWriter();
	        response.setContentType("text/html");
	        String name=request.getParameter("n");
	        out.println("<h1><center> Welcome Mr.  "  + name + "</center></h1");
	        }
	        catch(Exception e){}
	        
	    }
		
	}

}
