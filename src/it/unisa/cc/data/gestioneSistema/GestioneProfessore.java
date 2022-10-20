package it.unisa.cc.data.gestioneSistema;

import java.util.ArrayList;
import java.util.logging.Logger;

import it.unisa.cc.data.gestioneAutenticazione.DBAccount;

public class GestioneProfessore {
	private static GestioneProfessore gestioneProfessore;
	private DBProfessore dbProfessore;
	Logger logger=Logger.getLogger("global");

	private GestioneProfessore(){
		dbProfessore=DBProfessore.getIstance();
	}

	public static synchronized GestioneProfessore getIstance(){
		if(gestioneProfessore==null){
			gestioneProfessore=new GestioneProfessore();
		}
		return gestioneProfessore;
	}

	//public boolean  inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email,String Username,String Password,String Ruolo, String Stato){
	public boolean  inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email, String Ruolo, String Stato){

		boolean  f = dbProfessore.inserisciProfessore(Nome, Cognome,Matricola,SSD, Telefono, Email, Ruolo, Stato);
		//return dbProfessore.inserisciProfessore(Nome, Cognome, Matricola, SSD, Telefono, Email, Username,Password, Ruolo, Stato);

		if(!f){
			return false;
		}
		else
			return true;
	}


	public ArrayList<Professore> getListaProfessori(){
		return dbProfessore.getListaProfessori();
	}

	public Professore getDettaglioProfessore(String professoreSelezionato) {
		return dbProfessore.getDettaglioProfessore(professoreSelezionato);
	}


}
