package svl;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlLogin() {
        super();
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		    
		    
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		LoginDAO log = new LoginDAO();
		user user = log.logueo(email, password);

		if (user == null) {
			request.setAttribute("mensaje", "Error nombre de usuario y/o clave. Vuelva a intentarlo");
			response.sendRedirect("index.jsp");
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