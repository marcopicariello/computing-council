package it.unisa.cc.gestioneOffertaMagistrale;

import it.unisa.cc.gestioneOffertaTriennale.FacadeGestioneOffertaTriennale;
import it.unisa.cc.gestioneOffertaTriennale.GestioneOffertaTriennale;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisualizzaCurriculumTriennaleServlet
 */
@WebServlet("/VisualizzaCurriculumTriennaleServlet")
public class VisualizzaCurriculumMagistraleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private FacadeGestioneOffertaMagistrale gestioneOffertaTrennale;
	
	public void init(ServletConfig config){
		gestioneOffertaTrennale = GestioneOffertaMagistrale.getIstance();
	}  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzaCurriculumMagistraleServlet() {
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
