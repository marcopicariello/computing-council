package it.unisa.cc.gestioneSistema;

import java.util.ArrayList;


import it.unisa.cc.data.gestioneSistema.AnnoAccademico;
import it.unisa.cc.data.gestioneSistema.DBAnnoAccademico;
import it.unisa.cc.data.gestioneSistema.DBInsegnamento;
import it.unisa.cc.data.gestioneSistema.DBProfessore;
import it.unisa.cc.data.gestioneSistema.Insegnamento;
import it.unisa.cc.data.gestioneSistema.Professore;

public class GestioneSistema implements FacadeGestioneSistema {
	private DBAnnoAccademico dbAnnoAccademico;
	private DBInsegnamento dbInsegnamento;
	private DBProfessore dbProfessore;
	
	private static GestioneSistema gestSistema;
	
	public GestioneSistema(){
		dbAnnoAccademico=DBAnnoAccademico.getInstance();
		dbInsegnamento=DBInsegnamento.getInstance();
		dbProfessore=DBProfessore.getIstance();
	}
	public static synchronized GestioneSistema getIstance(){
		if(gestSistema==null){
			gestSistema = new GestioneSistema();
		}
		return gestSistema;
	}
	
	public boolean inserisciAnnoAccademico(String anno, String descrizione){
		return dbAnnoAccademico.inserisciAnnoAccademico(anno, descrizione);
	}
	
	public ArrayList<AnnoAccademico> getListaAnniAccademici(){
		return dbAnnoAccademico.getListaAnniAccademici();
	}

	public AnnoAccademico getDettaglioAnnoAccademico(String annoSelezionato){
		return dbAnnoAccademico.getDettaglioAnnoAccademico(annoSelezionato);
	}
	
	public boolean inserisciInsegnamento(String nome, String tipologiaAttivita, String ssd){
		return dbInsegnamento.inserisciInsegnamento(nome, tipologiaAttivita, ssd);
	}

	public ArrayList<Insegnamento> getListaInsegnamenti(){
		return dbInsegnamento.getListaInsegnamenti();
	}
	public Insegnamento getDettaglioInsegnamento(int insegnamentoSelezionato){
		return dbInsegnamento.getDettaglioInsegnamento(insegnamentoSelezionato);
	}
	
	public boolean inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email,String Ruolo, String Stato){
		return dbProfessore.inserisciProfessore(Nome, Cognome, Matricola, SSD, Telefono, Email, Ruolo, Stato);
	}

	public ArrayList<Professore> getListaProfessori(){
		 return dbProfessore.getListaProfessori();
	}

	public Professore getDettaglioProfessore(String matricolaSelezionata) {
		return dbProfessore.getDettaglioProfessore(matricolaSelezionata);
	}


	public boolean modificaStatoProfessore(boolean val){
		return dbProfessore.modificaStatoProfessore(val);
	}
	
	public int returnMonteOreProfessore(String idProf){
		return dbProfessore.returnMonteOreProfessore(idProf);
	}

}
