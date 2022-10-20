package it.unisa.cc.gestioneOffertaMagistrale;

import it.unisa.cc.data.gestioneOffertaMagistrale.OrdinamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaMagistrale.RegolamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaTriennale.OrdinamentoTriennale;

import java.util.ArrayList;

public interface FacadeGestioneOffertaMagistrale {

	  public void insertOrdinamentoMagistarle(OrdinamentoMagistrale o);
			
	  public ArrayList<OrdinamentoMagistrale> visualizzaOrdinamentoMagistrale(String data);
			
	  public ArrayList<OrdinamentoMagistrale> caricaOrdinamentoMagistraleAnnoPrecedente(String data);
	
	  public void insertRegolamentoMagistrale(RegolamentoMagistrale reg);
		
	public ArrayList<RegolamentoMagistrale> visualizzaRegolamentoCurriculumMagistrale(String data);
		
		public ArrayList<RegolamentoMagistrale> caricaRegolamentoMagistraleAnnoPrecedente(String data);
		
		public ArrayList<RegolamentoMagistrale> visualizzaListaCurriculumDelRegolamentoMagistrale(String idRegolamento);
	  
	  
	  
	  
}
