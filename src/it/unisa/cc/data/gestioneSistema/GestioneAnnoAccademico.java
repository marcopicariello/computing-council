package it.unisa.cc.data.gestioneSistema;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GestioneAnnoAccademico {

	private static GestioneAnnoAccademico gestioneAnnoAccademico;
	private DBAnnoAccademico dbAnnoAccademico;
	Logger logger = Logger.getLogger("global");
	
	
	private GestioneAnnoAccademico(){
		dbAnnoAccademico = DBAnnoAccademico.getInstance();
	}
	
	
	public static synchronized GestioneAnnoAccademico getIstance(){	
		if(gestioneAnnoAccademico==null){
			gestioneAnnoAccademico=new GestioneAnnoAccademico();	
		}	
		return gestioneAnnoAccademico;
	}
	
	
	
/**
 * Metodo per inserire un anno accademico all'interno del database
 * @param anno
 * @param descrizione
 * @return ritorna un booleano 
 */
public boolean inserisciAnnoAccademico(String anno, String descrizione){
		
		boolean f = dbAnnoAccademico.inserisciAnnoAccademico(anno, descrizione);
		if(!f){
			
			return false;
		}
		else
			return true;
		
	}


/**
 * Metodo che ricerca tutti gli anni accademici all'interno del database
 * @return ritorna la lista degli anni accademici
 */
	public ArrayList<AnnoAccademico> getListaAnniAccademici(){
		return dbAnnoAccademico.getListaAnniAccademici();
	}
	
	
	
/**
 * Metodo che ricerca all'interno del database l'anno accademico che è stato selezionato
 * @param annoAccademicoSelezionato
 * @return ritorna il dettaglio dell'anno accademico che è stato selezionato
 */
	public AnnoAccademico getDettaglioAnnoAccademico(String annoSelezionato){
		return dbAnnoAccademico.getDettaglioAnnoAccademico(annoSelezionato);
	}
	
}
