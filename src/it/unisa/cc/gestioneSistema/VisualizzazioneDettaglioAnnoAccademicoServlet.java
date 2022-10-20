package it.unisa.cc.gestioneSistema;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import it.unisa.cc.data.gestioneSistema.AnnoAccademico;
import it.unisa.cc.data.gestioneSistema.GestioneAnnoAccademico;

/**
 * Servlet implementation class VisualizzazioneDettaglioAnnoAccademicoServlet
 */
@WebServlet("/VisualizzazioneDettaglioAnnoAccademicoServlet")
public class VisualizzazioneDettaglioAnnoAccademicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FacadeGestioneSistema gestioneAnnoAccademico;
	
	public void init(ServletConfig config){
		gestioneAnnoAccademico = GestioneSistema.getIstance();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzazioneDettaglioAnnoAccademicoServlet() {
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
		String annoSelezionato = request.getParameter("anno");
		AnnoAccademico dettaglioAnnoAccademico = null;
		try {
			dettaglioAnnoAccademico = gestioneAnnoAccademico.getDettaglioAnnoAccademico(annoSelezionato);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if (dettaglioAnnoAccademico != null) {
			// CONVERTO ACCOUNT IN XML
			Document doc = null;

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
			System.out.println("Anno accademico ritornato null");
		}
	}

}
