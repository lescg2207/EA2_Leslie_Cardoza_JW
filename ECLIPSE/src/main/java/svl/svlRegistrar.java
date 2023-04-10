package svl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import bean.user;
import dao.RegistrarDAO;


public class svlRegistrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public svlRegistrar() {
        super();
  
    }
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");

    	
    	String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String pass = request.getParameter("pass");
	    
	    if (name == null || name.isEmpty() || 
		    	email == null || email.isEmpty() || 
		    	pass == null || pass.isEmpty()) {
		    	
		        request.setAttribute("mensaje", "Todos los campos son obligatorios");
		        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		        dispatcher.forward(request, response);
		        return;
		    }
	  
	    
		    user user = new user(name, email, pass);
		    user.setName(name);
		    user.setEmail(email);
		    user.setPass(pass);

		    try {
		        RegistrarDAO.registerUser(user);
		        request.setAttribute("mensaje", "Usuario registrado");
		        request.setAttribute("registroExitoso", true);
		        response.sendRedirect("index.jsp");
		    } catch (SQLException e) {
		        request.setAttribute("mensaje", "ERROR!!!");
		        e.printStackTrace();
		        request.setAttribute("ERROR!!!", true);
		        response.sendRedirect("index.jsp");
		    }
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
