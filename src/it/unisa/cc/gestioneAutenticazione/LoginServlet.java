package it.unisa.cc.gestioneAutenticazione;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import it.unisa.cc.data.gestioneAutenticazione.Professore;
import it.unisa.cc.data.gestioneAutenticazione.Account;
import it.unisa.cc.data.gestioneAutenticazione.Presidente;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FacadeGestioneAutenticazione gestioneAutenticazione;
	Logger logger = Logger.getLogger("global");
	
	public void init(ServletConfig config) {
		gestioneAutenticazione = GestioneAutenticazione.getIstance();
	}
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		Account account;
		
		System.out.println("Username: "+Username);
		System.out.println("Password: "+Password);
		PrintWriter out = response.getWriter();
		out.println("Username: "+Username);
		out.println("Password: "+Password);
		
		try{
			account=gestioneAutenticazione.login(Username, Password);
			if(account==null){
				logger.info("Account nullo!");
				request.getSession().setAttribute("error", "Le credenziali di accesso non sono corrette.");
				String toUrl = request.getContextPath() + "/index.jsp";
				System.out.println("Account non trovato");
				//response.sendRedirect("Account non trovato(LOGIN)!");
				//Modifica di Simone:
				response.sendRedirect(toUrl);
			}
			//else if(account instanceof Professore){
			//Modifica di Simone:
			else if(!account.getPermessi()){
				Account accountProfessore = (Account) account;
				logger.info("Account non nullo!"+accountProfessore.getUsername());
				request.getSession().setAttribute("success", "connessione effettuata");
				String toUrl=request.getContextPath() +"/HomeProfessore.jsp";
				request.getSession().setAttribute("Professore", accountProfessore);
				request.getSession().setMaxInactiveInterval(1 * 60 * 60); // durata della sessione
				response.sendRedirect(toUrl);
				logger.info("Account trovato(LOGIN)!");
			}
			//else if(account instanceof Presidente){
			//Modifica di Simone:
			else if(account.getPermessi()){
				Account accountPresidente = (Account) account;
				logger.info("Account non nullo!"+accountPresidente.getUsername());
				request.getSession().setAttribute("success", "connessione effettuata");
				String toUrl=request.getContextPath() +"/HomePresidente.jsp"; 
				request.getSession().setAttribute("Presidente", accountPresidente);
				request.getSession().setMaxInactiveInterval(1 * 60 * 60); 
				response.sendRedirect(toUrl);
				logger.info("Account trovato(LOGIN)!");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		doGet(request, response);
	}
}
