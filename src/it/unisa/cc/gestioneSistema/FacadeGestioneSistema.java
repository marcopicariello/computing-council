package it.unisa.cc.gestioneSistema;

import it.unisa.cc.data.gestioneSistema.AnnoAccademico;
import it.unisa.cc.data.gestioneSistema.Insegnamento;
import it.unisa.cc.data.gestioneSistema.Professore;

import java.util.ArrayList;

public interface FacadeGestioneSistema {
	public boolean inserisciAnnoAccademico(String anno, String descrizione);
	
	public ArrayList<AnnoAccademico> getListaAnniAccademici();


	public AnnoAccademico getDettaglioAnnoAccademico(String annoSelezionato);

	
	public boolean inserisciInsegnamento(String nome, String tipologiaAttivita, String ssd);


	public ArrayList<Insegnamento> getListaInsegnamenti();

	public Insegnamento getDettaglioInsegnamento(int insegnamentoSelezionato);

	
	public boolean inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email,String Ruolo, String Stato);


	public ArrayList<Professore> getListaProfessori();


	public Professore getDettaglioProfessore(String matricolaSelezionata);

	public boolean modificaStatoProfessore(boolean val);

	
	public int returnMonteOreProfessore(String idProf);
}
