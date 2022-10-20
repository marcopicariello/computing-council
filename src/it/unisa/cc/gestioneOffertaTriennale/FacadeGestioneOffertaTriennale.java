package it.unisa.cc.gestioneOffertaTriennale;

import it.unisa.cc.data.gestioneOffertaTriennale.OrdinamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.RegolamentoTriennale;

import java.util.ArrayList;

public interface FacadeGestioneOffertaTriennale {

    public void insertOrdinamentoTriennale(OrdinamentoTriennale o);

	
	public ArrayList<OrdinamentoTriennale> visualizzaOrdinamentoTriennale(String data);

	
	public ArrayList<OrdinamentoTriennale> caricaOrdinamentoTriennaleAnnoPrecedente(String data);


	   public void insertRegolamentoTriennale(RegolamentoTriennale reg);

		public ArrayList<RegolamentoTriennale> visualizzaRegolamentoTriennale(String data);

		public ArrayList<RegolamentoTriennale> caricaRegolamentoTriennaleAnnoPrecedente(String data);

		public ArrayList<RegolamentoTriennale> visualizzaListaCurriculumDelRegolamento(String idRegolamento);

	
}
