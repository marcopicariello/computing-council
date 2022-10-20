package it.unisa.cc.gestioneProgrDidattica;

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
 * Servlet implementation class inserimentoProgrammazioneDidatticaServlet
 */
@WebServlet("/inserimentoProgrammazioneDidatticaServlet")
public class inserimentoProgrammazioneDidatticaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private FacadeGestioneProgrammazioneDidattica gestioneprogrammazioneDidattica;
	
	public void init(ServletConfig config){
		gestioneprogrammazioneDidattica =GestioneProgrammazioneDidattica.getIstance();
	}  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inserimentoProgrammazioneDidatticaServlet() {
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
