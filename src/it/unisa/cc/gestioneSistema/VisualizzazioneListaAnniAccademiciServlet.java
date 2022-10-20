package it.unisa.cc.gestioneSistema;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.SQLException;
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
import it.unisa.cc.data.gestioneSistema.AnnoAccademico;
import it.unisa.cc.data.gestioneSistema.GestioneAnnoAccademico;

/**
 * Servlet implementation class ListaAnniAccademiciServlet
 */
@WebServlet("/VisualizzazioneListaAnniAccademiciServlet")
public class VisualizzazioneListaAnniAccademiciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("global");
	
	private FacadeGestioneSistema gestioneAnnoAccademico;
	
	public void init(ServletConfig config){
		gestioneAnnoAccademico = GestioneSistema.getIstance();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzazioneListaAnniAccademiciServlet() {
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
		
		ArrayList<AnnoAccademico> annoAccademico = null;
		try {
			annoAccademico = gestioneAnnoAccademico.getListaAnniAccademici();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if (annoAccademico != null) {
			// CONVERTO ACCOUNT IN XML
			Document doc = XMLConverter.caricaListaAnniAccademici(annoAccademico);

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
			System.out.println("Prodotto ritornato null");
		}
	}

}
