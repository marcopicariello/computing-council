package it.unisa.cc.gestioneProgrDidattica;

import it.unisa.cc.data.gestioneProgrDidattica.ProgrammazioneDidattica;

public interface FacadeGestioneProgrammazioneDidattica {

    public void inserimentoProgrammazioneDidattica(ProgrammazioneDidattica pd);
	
    public void visualizzaProgrammazioneDidattica(String anno);
	
    public void modificaProgrammazioneDidattica(String anno);
		
}
