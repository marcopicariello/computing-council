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

import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import it.unisa.cc.commons.XMLConverter;
import it.unisa.cc.data.gestioneSistema.GestioneProfessore;
import it.unisa.cc.data.gestioneSistema.Professore;

/**
 * Servlet implementation class VisualizzazioneListaProfessori
 */
@WebServlet("/VisualizzazioneListaProfessoriServlet")
public class VisualizzazioneListaProfessoriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Logger logger = Logger.getLogger("global");
	
	private FacadeGestioneSistema gestioneSistema;
	
	public void init(ServletConfig config){
		gestioneSistema = GestioneSistema.getIstance();
	}

    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzazioneListaProfessoriServlet() {
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
		ArrayList<Professore> professore =null;
		try{
			professore=gestioneSistema.getListaProfessori();
			logger.info("LISTA PROF OTTENUTA!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(professore!=null){
			Document doc=XMLConverter.caricaListaProfessori(professore);
			
			XMLOutputter xml_out = new XMLOutputter();
			xml_out.setFormat(Format.getPrettyFormat());
			response.setContentType("text/xml");
			response.setHeader("Cache-Control",
					"no-store, no-cache, must-revalidate");
			PrintWriter out = response.getWriter();
			
			xml_out.output(doc, out);
		}
		else{
			System.out.println("Impossibile creare lista professori");
		}
		
	
	}

}
