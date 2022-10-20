package it.unisa.cc.data.gestioneOffertaTriennale;

import it.unisa.cc.data.gestioneAutenticazione.DBAccount;

import java.util.ArrayList;
import java.util.logging.Logger;

public class DBRegolamentoTriennale {

	private static Logger logger = Logger.getLogger("global");
	private static DBRegolamentoTriennale regolamentoTriennale;
	private DBRegolamentoTriennale (){
		
	}
	
	
	public static synchronized DBRegolamentoTriennale getInstance() {//applico il singleton	
		if(regolamentoTriennale==null){
			regolamentoTriennale=new DBRegolamentoTriennale ();	
		}
		return regolamentoTriennale;	
	}
	
	
	
	public void insertRegolamentoTriennale(RegolamentoTriennale reg){
		

	}
	
	public ArrayList<RegolamentoTriennale> visualizzaRegolamentoTriennale(String data){
		return null;
		

	}
	
	public ArrayList<RegolamentoTriennale> caricaRegolamentoTriennaleAnnoPrecedente(String data){
		return null;
		

	}
	
	public ArrayList<RegolamentoTriennale> visualizzaListaCurriculumDelRegolamento(String idRegolamento){
		return null;
		

	}
	
}
