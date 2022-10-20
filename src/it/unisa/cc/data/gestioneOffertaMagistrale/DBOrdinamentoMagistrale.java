package it.unisa.cc.data.gestioneOffertaMagistrale;

import java.util.ArrayList;
import java.util.logging.Logger;

public class DBOrdinamentoMagistrale {

	
	private static Logger logger = Logger.getLogger("global");
	private static DBOrdinamentoMagistrale ordinamentoMagistrale;
	private DBOrdinamentoMagistrale (){
		
	}
	
	public static synchronized DBOrdinamentoMagistrale getInstance() {//applico il singleton	
		if(ordinamentoMagistrale==null){
			ordinamentoMagistrale=new DBOrdinamentoMagistrale ();	
		}
		return ordinamentoMagistrale;	
	}
	
	
    public void insertOrdinamentoMagistarle(OrdinamentoMagistrale o){
		

	}
	
	public ArrayList<OrdinamentoMagistrale> visualizzaOrdinamentoMagistrale(String data){
		return null;
		

	}
	
	public ArrayList<OrdinamentoMagistrale> caricaOrdinamentoMagistraleAnnoPrecedente(String data){
		return null;
		

	}
	
}
