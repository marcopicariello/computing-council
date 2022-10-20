package it.unisa.cc.gestioneAutenticazione;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FacadeGestioneAutenticazione gestioneAutenticazione;
    
	
	public void init(ServletConfig config) {
		gestioneAutenticazione = GestioneAutenticazione.getIstance();
	}
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
     public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		gestioneAutenticazione.logout(request);
		System.out.println("Disconnessione effettuata");
		request.getSession().invalidate();
		String toUrl = request.getContextPath() + "/index.jsp";
		response.sendRedirect(toUrl);
	}

}
