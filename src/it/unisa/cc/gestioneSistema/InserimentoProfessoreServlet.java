package it.unisa.cc.gestioneSistema;

import it.unisa.cc.data.gestioneSistema.GestioneProfessore;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InserimentoProfessoreServlet
 */
@WebServlet("/InserimentoProfessoreServlet")
public class InserimentoProfessoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("global");
	
	private FacadeGestioneSistema gestioneSistema;
	
	public void init(ServletConfig config){
		gestioneSistema = GestioneSistema.getIstance();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserimentoProfessoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sono nel metodo post, attendo i parametri!");
			
		String Nome = request.getParameter("Nome");
		String Cognome = request.getParameter("Cognome");
		String Matricola=request.getParameter("Matricola");
		String SSD = request.getParameter("SSD");
		String Telefono =  request.getParameter("Telefono");
		String Email = request.getParameter("Email");
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String Ruolo = request.getParameter("Ruolo");
		String Stato = request.getParameter("Stato");
	try{	
		//if(gestioneProfessore.inserisciProfessore(Nome, Cognome,Matricola, SSD, Telefono, Email, Username, Password, Ruolo, Stato)){
		if(gestioneSistema.inserisciProfessore(Nome, Cognome,Matricola, SSD, Telefono, Email, Ruolo, Stato)){
			System.out.println("sono nel gestioneProfessore");
			request.getSession().setAttribute("successo", "professore inserito con successo");
			String toUrl = request.getContextPath() +"/ListaProfessori_Presidente.jsp";
			response.sendRedirect(toUrl);
		}
		else{
			request.getSession().setAttribute("errore", "errore inserimento insegnamento");  
			String toUrl=request.getContextPath() +"/InserimentoProfessore.jsp";
			response.sendRedirect(toUrl);
		}
			
	}
	catch(Exception e){
		e.printStackTrace();
		request.getSession().setAttribute("errore", "errore inserimento insegnamento");  
		String toUrl=request.getContextPath() +"/InserimentoProfessore.jsp";
		response.sendRedirect(toUrl);

	}
}

}
