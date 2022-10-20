package it.unisa.cc.data.gestioneOffertaTriennale;

import java.util.ArrayList;
import java.util.logging.Logger;

public class DBOrdinamentoTriennale {

	
	private static Logger logger = Logger.getLogger("global");
	private static DBOrdinamentoTriennale ordinamentoTriennale;
	private DBOrdinamentoTriennale (){
		
	}
	
	
	public static synchronized DBOrdinamentoTriennale getInstance() {//applico il singleton	
		if(ordinamentoTriennale==null){
			ordinamentoTriennale=new DBOrdinamentoTriennale ();	
		}
		return ordinamentoTriennale;	
	}
	
	
    public void insertOrdinamentoTriennale(OrdinamentoTriennale o){
		

	}
	
	public ArrayList<OrdinamentoTriennale> visualizzaOrdinamentoTriennale(String data){
		return null;
		

	}
	
	public ArrayList<OrdinamentoTriennale> caricaOrdinamentoTriennaleAnnoPrecedente(String data){
		return null;
		

	}
	
	
	
	
	
	
	
}
