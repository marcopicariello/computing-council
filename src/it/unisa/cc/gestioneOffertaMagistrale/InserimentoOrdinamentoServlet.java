package it.unisa.cc.gestioneOffertaMagistrale;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InserimentoOrdinamentoServlet
 */
@WebServlet("/InserimentoOrdinamentoServlet")
public class InserimentoOrdinamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private FacadeGestioneOffertaMagistrale gestioneOffertaMagistrale;
		
		public void init(ServletConfig config){
			gestioneOffertaMagistrale = GestioneOffertaMagistrale.getIstance();
		}  
   /**
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserimentoOrdinamentoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
