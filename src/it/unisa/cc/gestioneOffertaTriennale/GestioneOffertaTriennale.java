package it.unisa.cc.gestioneOffertaTriennale;



import it.unisa.cc.data.gestioneOffertaTriennale.DBOrdinamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.DBRegolamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.OrdinamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.RegolamentoTriennale;

import java.util.ArrayList;

public class GestioneOffertaTriennale implements FacadeGestioneOffertaTriennale {

	
	private static GestioneOffertaTriennale gestore;
	private DBOrdinamentoTriennale dbordinamentotriennale;
	private DBRegolamentoTriennale dbregolamentotriennale;
	
	private GestioneOffertaTriennale (){
		dbordinamentotriennale=dbordinamentotriennale.getInstance();
		dbregolamentotriennale=dbregolamentotriennale.getInstance();
	}
	
	public static synchronized GestioneOffertaTriennale getIstance(){
		if(gestore==null){
			gestore = new GestioneOffertaTriennale ();
		}
		return gestore;
	}
	
     public void insertOrdinamentoTriennale(OrdinamentoTriennale o){
    	 dbordinamentotriennale.insertOrdinamentoTriennale(o);
     }
	
	public ArrayList<OrdinamentoTriennale> visualizzaOrdinamentoTriennale(String data){
		return dbordinamentotriennale.visualizzaOrdinamentoTriennale(data);
	}
	
	public ArrayList<OrdinamentoTriennale> caricaOrdinamentoTriennaleAnnoPrecedente(String data){
		return dbordinamentotriennale.caricaOrdinamentoTriennaleAnnoPrecedente(data);
	}

	   public void insertRegolamentoTriennale(RegolamentoTriennale reg){
		   dbregolamentotriennale.insertRegolamentoTriennale( reg);
	   }
		public ArrayList<RegolamentoTriennale> visualizzaRegolamentoTriennale(String data){
			return dbregolamentotriennale.visualizzaRegolamentoTriennale(data);
		}
		public ArrayList<RegolamentoTriennale> caricaRegolamentoTriennaleAnnoPrecedente(String data){
			return dbregolamentotriennale.caricaRegolamentoTriennaleAnnoPrecedente(data);
		}
		public ArrayList<RegolamentoTriennale> visualizzaListaCurriculumDelRegolamento(String idRegolamento){
			return dbregolamentotriennale.visualizzaListaCurriculumDelRegolamento(idRegolamento);
		}
		
	
}
