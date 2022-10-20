package it.unisa.cc.gestioneSistema;

import it.unisa.cc.data.gestioneSistema.GestioneAnnoAccademico;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InserimentoAnnoAccademicoServlet
 */
@WebServlet("/InserimentoAnnoAccademicoServlet")
public class InserimentoAnnoAccademicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FacadeGestioneSistema gestioneAnnoAccademico;
	
	public void init(ServletConfig config){
		gestioneAnnoAccademico = GestioneSistema.getIstance();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserimentoAnnoAccademicoServlet() {
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
		//System.out.println("Sono nel metodo post, attendo i parametri!");
		String anno = request.getParameter("anno");
		String descrizione = request.getParameter("descrizione");
		
		
	try{	
		if(gestioneAnnoAccademico.inserisciAnnoAccademico(anno, descrizione)){
			request.getSession().setAttribute("successo", "anno accademico inserito con successo");
			String toUrl = request.getContextPath() +"/HomePresidente.jsp";
			response.sendRedirect(toUrl);
		}
		else{
			request.getSession().setAttribute("erroree", "errore inserimento anno accademico");  
			String toUrl=request.getContextPath() +"/InserimentoAnnoAccademico.jsp";
			response.sendRedirect(toUrl);
		}
			
	}
	catch(Exception e){
		e.printStackTrace();
		request.getSession().setAttribute("erroree", "errore inserimento anno accademico");  
		String toUrl=request.getContextPath() +"/InserimentoAnnoAccademico.jsp";
		response.sendRedirect(toUrl);

	}
	}

}
