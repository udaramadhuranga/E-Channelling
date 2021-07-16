package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppoinmentDeleteServlet
 */
@WebServlet("/AppoinmentDeleteServlet")
public class AppoinmentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppoinmentDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String aid = request.getParameter("aid");
      
             boolean isTrue;
		
		isTrue = AppoinmentDButil.deleteAppointment(aid);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Appointmentinfo.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("Deleteunsuccess.jsp");
			dispatcher2.forward(request, response);
		}
	}

}
