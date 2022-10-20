package it.unisa.cc.data.gestioneProgrDidattica;



import java.util.logging.Logger;

public class DBProgrammazioneDidattica {

	private static Logger logger = Logger.getLogger("global");
	private static DBProgrammazioneDidattica dbprogrammazionedidattica;
	private DBProgrammazioneDidattica(){
		
	}
	
	
	public static synchronized DBProgrammazioneDidattica getInstance() {//applico il singleton	
		if(dbprogrammazionedidattica==null){
			dbprogrammazionedidattica=new DBProgrammazioneDidattica();	
		}
		return dbprogrammazionedidattica;	
	}
	
	
	
	public void inserimentoProgrammazioneDidattica(ProgrammazioneDidattica pd){
		
		
		
	}
	
    public void visualizzaProgrammazioneDidattica(String anno){
		
		
		
	}
	
    public void modificaProgrammazioneDidattica(String anno){
		
		
		
  	}
	
	
}
