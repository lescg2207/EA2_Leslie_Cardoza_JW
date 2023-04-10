package svl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import bean.user;
import dao.LoginDAO;

public class svlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlLogin() {
        super();
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		 
		    
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		
	
		LoginDAO log = new LoginDAO();
		user user = log.logueo(email, pass);

		if (user == null) {
			request.setAttribute("mensaje", "Error nombre de usuario y/o clave. Vuelva a intentarlo");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	        dispatcher.forward(request, response);

	        return;
			
		} else {
			response.sendRedirect("welcome.jsp");
			session.setAttribute("email", email);		
		}
	}
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
    

	

}
