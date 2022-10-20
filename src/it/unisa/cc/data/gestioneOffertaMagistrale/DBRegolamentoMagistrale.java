package it.unisa.cc.data.gestioneOffertaMagistrale;



import java.util.ArrayList;
import java.util.logging.Logger;

public class DBRegolamentoMagistrale {

	private static Logger logger = Logger.getLogger("global");
	private static DBRegolamentoMagistrale regolamentoMagistrale;
	private DBRegolamentoMagistrale (){
		
	}
	
	
	public static synchronized DBRegolamentoMagistrale getInstance() {//applico il singleton	
		if(regolamentoMagistrale==null){
			regolamentoMagistrale=new DBRegolamentoMagistrale ();	
		}
		return regolamentoMagistrale;	
	}
	
	
	
	public void insertRegolamentoMagistrale(RegolamentoMagistrale reg){
		

	}
	
	public ArrayList<RegolamentoMagistrale> visualizzaRegolamentoCurriculumMagistrale(String data){
		return null;
		

	}
	
	public ArrayList<RegolamentoMagistrale> caricaRegolamentoMagistraleAnnoPrecedente(String data){
		return null;
		

	}
	
	public ArrayList<RegolamentoMagistrale> visualizzaListaCurriculumDelRegolamentoMagistrale(String idRegolamento){
		return null;
		

	}
	
}
