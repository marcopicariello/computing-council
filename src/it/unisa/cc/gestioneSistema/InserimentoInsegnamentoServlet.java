package it.unisa.cc.gestioneSistema;


import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InserimentoEsameServlet
 */
@WebServlet("/InserimentoInsegnamentoServlet")
public class InserimentoInsegnamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private FacadeGestioneSistema gestioneSistema;
	
	public void init(ServletConfig config){
		gestioneSistema = GestioneSistema.getIstance();
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserimentoInsegnamentoServlet() {
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
		String nome = request.getParameter("name");
		String ssd = request.getParameter("ssd");
		String tipologiaAttività = request.getParameter("tipologiaAttivita");
		
	try{	
		if(gestioneSistema.inserisciInsegnamento(nome, tipologiaAttività, ssd)){
			request.getSession().setAttribute("successo", "insegnamento inserito con successo");
			String toUrl = request.getContextPath() +"/ListaEsami_Presidente.jsp";
			response.sendRedirect(toUrl);
		}
		else{
			request.getSession().setAttribute("erroree", "errore inserimento insegnamento");  
			String toUrl=request.getContextPath() +"/InserimentoEsame.jsp";
			response.sendRedirect(toUrl);
		}
			
	}
	catch(Exception e){
		e.printStackTrace();
		request.getSession().setAttribute("erroree", "errore inserimento insegnamento");  
		String toUrl=request.getContextPath() +"/InserimentoEsame.jsp";
		response.sendRedirect(toUrl);

	}
	}

}
