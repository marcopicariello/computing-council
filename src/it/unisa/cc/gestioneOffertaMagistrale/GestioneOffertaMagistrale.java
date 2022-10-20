package it.unisa.cc.gestioneOffertaMagistrale;



import it.unisa.cc.data.gestioneOffertaMagistrale.DBOrdinamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaMagistrale.DBRegolamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaMagistrale.OrdinamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaMagistrale.RegolamentoMagistrale;
import it.unisa.cc.data.gestioneOffertaTriennale.DBOrdinamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.DBRegolamentoTriennale;
import it.unisa.cc.data.gestioneOffertaTriennale.OrdinamentoTriennale;

import java.util.ArrayList;

public class GestioneOffertaMagistrale implements FacadeGestioneOffertaMagistrale{

	
	private static GestioneOffertaMagistrale gestore;
	private DBOrdinamentoMagistrale dbordinamentomagistrale;
	private DBRegolamentoMagistrale dbregolamentomagistrale;
	
	private GestioneOffertaMagistrale (){
		dbordinamentomagistrale = DBOrdinamentoMagistrale.getInstance();
		dbregolamentomagistrale= DBRegolamentoMagistrale.getInstance();
	}
	
	public static synchronized GestioneOffertaMagistrale getIstance(){
		if(gestore==null){
			gestore = new GestioneOffertaMagistrale ();
		}
		return gestore;
	}

	@Override
	public void insertOrdinamentoMagistarle(OrdinamentoMagistrale o) {
		// TODO Auto-generated method stub
		dbordinamentomagistrale.insertOrdinamentoMagistarle(o);
	}

	@Override
	public ArrayList<OrdinamentoMagistrale> visualizzaOrdinamentoMagistrale(
			String data) {
		// TODO Auto-generated method stub
		return dbordinamentomagistrale.visualizzaOrdinamentoMagistrale(data);
	}

	@Override
	public ArrayList<OrdinamentoMagistrale> caricaOrdinamentoMagistraleAnnoPrecedente(
			String data) {
		// TODO Auto-generated method stub
		return dbordinamentomagistrale.caricaOrdinamentoMagistraleAnnoPrecedente(data);
	}

	@Override
	public void insertRegolamentoMagistrale(RegolamentoMagistrale reg) {
		// TODO Auto-generated method stub
		dbregolamentomagistrale.insertRegolamentoMagistrale(reg);
	}

	@Override
	public ArrayList<RegolamentoMagistrale> visualizzaRegolamentoCurriculumMagistrale(
			String data) {
		// TODO Auto-generated method stub
		return dbregolamentomagistrale.visualizzaRegolamentoCurriculumMagistrale(data);
	}

	@Override
	public ArrayList<RegolamentoMagistrale> caricaRegolamentoMagistraleAnnoPrecedente(
			String data) {
		// TODO Auto-generated method stub
		return dbregolamentomagistrale.caricaRegolamentoMagistraleAnnoPrecedente(data);
	}

	@Override
	public ArrayList<RegolamentoMagistrale> visualizzaListaCurriculumDelRegolamentoMagistrale(
			String idRegolamento) {
		// TODO Auto-generated method stub
		return dbregolamentomagistrale.visualizzaListaCurriculumDelRegolamentoMagistrale(idRegolamento);
	}
	
	
	

	
}
