package it.unisa.cc.gestioneProgrDidattica;

import it.unisa.cc.data.gestioneProgrDidattica.DBProgrammazioneDidattica;
import it.unisa.cc.data.gestioneProgrDidattica.ProgrammazioneDidattica;



public class GestioneProgrammazioneDidattica  implements FacadeGestioneProgrammazioneDidattica{

	private static GestioneProgrammazioneDidattica gestore;
	private DBProgrammazioneDidattica dbprogrammazionedidattica;
	
	private GestioneProgrammazioneDidattica (){
		dbprogrammazionedidattica = DBProgrammazioneDidattica.getInstance();
	}
	
	public static synchronized GestioneProgrammazioneDidattica getIstance(){
		if(gestore==null){
			gestore = new GestioneProgrammazioneDidattica ();
		}
		return gestore;
	}

	@Override
	public void inserimentoProgrammazioneDidattica(ProgrammazioneDidattica pd) {
		// TODO Auto-generated method stub
		dbprogrammazionedidattica.inserimentoProgrammazioneDidattica(pd);
	}

	@Override
	public void visualizzaProgrammazioneDidattica(String anno) {
		// TODO Auto-generated method stub
		dbprogrammazionedidattica.visualizzaProgrammazioneDidattica(anno);
	}

	@Override
	public void modificaProgrammazioneDidattica(String anno) {
		// TODO Auto-generated method stub
		dbprogrammazionedidattica.modificaProgrammazioneDidattica(anno);
	}

}
