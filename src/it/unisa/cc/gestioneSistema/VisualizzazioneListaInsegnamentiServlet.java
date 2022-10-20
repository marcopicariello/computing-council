package it.unisa.cc.gestioneSistema;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import it.unisa.cc.commons.XMLConverter;
import it.unisa.cc.data.gestioneSistema.GestioneInsegnamento;
import it.unisa.cc.data.gestioneSistema.Insegnamento;

/**
 * Servlet implementation class VisualizzazioneListaEsamiServlet
 */
@WebServlet("/VisualizzazioneListaEsamiServlet")
public class VisualizzazioneListaInsegnamentiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("global");
	
	private FacadeGestioneSistema gestioneSistema;
	
	public void init(ServletConfig config){
		gestioneSistema= GestioneSistema.getIstance();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzazioneListaInsegnamentiServlet() {
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
		
		ArrayList<Insegnamento> insegnamento = null;
		try {
			insegnamento = gestioneSistema.getListaInsegnamenti();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if (insegnamento != null) {
			// CONVERTO ACCOUNT IN XML
			Document doc = XMLConverter.caricaListaInsegnamenti(insegnamento);

			// Risponde al client
			XMLOutputter xml_out = new XMLOutputter();
			xml_out.setFormat(Format.getPrettyFormat());
			response.setContentType("text/xml");
			response.setHeader("Cache-Control",
					"no-store, no-cache, must-revalidate");
			PrintWriter out = response.getWriter();

			// esporto su file il documento creato
			// xml_out.output(doc, new FileOutputStream("prova.xml"));
			xml_out.output(doc, out);
		}
		else {
			System.out.println("Lista insegnamenti vuota!");
		}
	}

}
