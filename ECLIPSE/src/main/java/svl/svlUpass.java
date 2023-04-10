package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.LoginDAO;


public class svlUpass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public svlUpass() {
        super();
        // TODO Auto-generated constructor stub
    }

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	
    	String email = request.getParameter("email");
    	String pass = request.getParameter("pass");
    	String newPass = request.getParameter("newPass");

    	LoginDAO log = new LoginDAO();
    	boolean resultado = log.updatepass(email, pass, newPass);

    	if (resultado) {
    	    String mensaje = "Se ha actualizado la contraseña de manera exitosa - Por favor inicia sesión";
    	    request.setAttribute("mensaje", mensaje);
    	    response.sendRedirect("login.jsp");
    	} else {
    	    String mensaje = "Error al ingresar el e-mail y contraseña";
    	    request.setAttribute("mensaje", mensaje);
    	    response.sendRedirect("actualizarpass.jsp");
    	}
    }
		



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


}
