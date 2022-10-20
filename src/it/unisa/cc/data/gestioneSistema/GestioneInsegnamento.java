package it.unisa.cc.data.gestioneSistema;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GestioneInsegnamento {

	private static GestioneInsegnamento gestioneInsegnamento;
	private DBInsegnamento dbInsegnamento;
	Logger logger = Logger.getLogger("global");
	
	private GestioneInsegnamento(){
		dbInsegnamento = DBInsegnamento.getInstance();
	}
	
	public static synchronized GestioneInsegnamento getIstance(){	
		if(gestioneInsegnamento==null){
			gestioneInsegnamento=new GestioneInsegnamento();	
		}	
		return gestioneInsegnamento;
	}	
	

	
	public boolean inserisciInsegnamento(String nome, String tipologiaAttività, String ssd){
		
		boolean f = dbInsegnamento.inserisciInsegnamento(nome, tipologiaAttività, ssd);
		if(!f){
			return false;
		}
		else
			return true;
	}
	
	/**
	 * Metodo che ricerca tutti gli insegnamenti all'interno del database
	 * @return ritorna la lista degli insegnamenti
	 */
	public ArrayList<Insegnamento> getListaInsegnamenti(){
		return dbInsegnamento.getListaInsegnamenti();
	}
		
		
		
	/**
	 * Metodo che ricerca all'interno del database l'insegnamento che è stato selezionato
	 * @param insegnamentoSelezionato
	 * @return ritorna il dettaglio dell'insegnamento che è stato selezionato
	 */
	public Insegnamento getDettaglioInsegnamento(int insegnamentoSelezionato){
		return dbInsegnamento.getDettaglioInsegnamento(insegnamentoSelezionato);
	}
		
}
