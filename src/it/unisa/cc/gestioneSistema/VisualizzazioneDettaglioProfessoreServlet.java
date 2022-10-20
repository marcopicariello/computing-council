package it.unisa.cc.gestioneSistema;

import java.io.IOException;
import java.io.PrintWriter;
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
import it.unisa.cc.data.gestioneSistema.GestioneProfessore;
import it.unisa.cc.data.gestioneSistema.Professore;

/**
 * Servlet implementation class VisualizzazioneDettaglioProfessoreServlet
 */
@WebServlet("/VisualizzazioneDettaglioProfessoreServlet")
public class VisualizzazioneDettaglioProfessoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("global");
	
	private FacadeGestioneSistema gestioneSistema;
	
	public void init(ServletConfig config){
		gestioneSistema = GestioneSistema.getIstance();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzazioneDettaglioProfessoreServlet() {
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
		String professoreSelezionato=request.getParameter("matricola");
		Professore dettaglioProfessore=null;
		try{
			dettaglioProfessore=gestioneSistema.getDettaglioProfessore(professoreSelezionato);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(dettaglioProfessore!=null){
			Document doc = XMLConverter.caricaDettaglioProfessore(dettaglioProfessore);
			
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
						System.out.println("Professore ritornato null");
					}
		}
	}


