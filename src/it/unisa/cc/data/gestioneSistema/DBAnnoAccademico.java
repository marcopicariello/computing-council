package it.unisa.cc.data.gestioneSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;

import it.unisa.cc.commons.DBNames;
import it.unisa.cc.storage.DBConnectionPool;


/**
 * La classe si occupa di tutte le operazioni relative agli anni accademici all'interno del database
 * 
 */
public class DBAnnoAccademico {

	private static DBAnnoAccademico annoAccademico;
	Logger logger = Logger.getLogger("global");
	
	public DBAnnoAccademico(){
		
	}
	
	public static synchronized DBAnnoAccademico getInstance(){
		if(annoAccademico == null){
			annoAccademico = new DBAnnoAccademico();
		}
		return annoAccademico;
	}
	
	
	/**
	 * Inserisce un nuovo anno accademico all'interno del database
	 * @param anno accademico
	 * @param descrizione una breve descrizione riguardo l'anno accademico
	 * @return
	 */
	public boolean inserisciAnnoAccademico(String anno, String descrizione){
		
		int risultato = 0;
		Connection con = null;
		try{
			logger.info("Mi sto per connettere(DBSQL)");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso(DBSQL)");
			String query = "";
			logger.info("preparo la query(DBSQL)");
			query= "INSERT INTO "+DBNames.TABLE_ANNO_ACCADEMICO+ " (`Anno`, `Descrizione`) VALUES "+
			" ('" + anno + "', '" + descrizione + "')";
			Statement st = con.createStatement();
			risultato = st.executeUpdate(query); 
			con.commit();
			st.close();
			logger.info("Query eseguita con successo!");
		}
		catch(SQLException e){
			logger.warning(e+"Sql exception");
			return false;
		}
		catch (Exception e) {
			logger.warning(e+"Sql exception");
			return false;
		}
		finally{
			DBConnectionPool.releaseConnection(con);
		}
		return (risultato > 0);
	
	}
	
	
	/**
	 * Ricerca tutti gli anni accademici all'interno del database
	 * @return ritorna la lista degli anni accademici
	 */
	public ArrayList<AnnoAccademico> getListaAnniAccademici(){
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rsRisultato = null;
		ArrayList<AnnoAccademico> listaAnniAccademici = new ArrayList<AnnoAccademico>();
		
		try{
			logger.info("Sto per ritornare la lista degli anni accademici");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso(DBSQL)");
			String query = "";
			logger.info("preparo la query(DBSQL)");
			query= "SELECT * FROM "+DBNames.TABLE_ANNO_ACCADEMICO;
			
			st = con.prepareStatement(query);
			rsRisultato = st.executeQuery(query);
			
				while(rsRisultato.next()){
					String anno = rsRisultato.getString("Anno");
					String descrizione = rsRisultato.getString("Descrizione");
					
					AnnoAccademico annoAccademico = new AnnoAccademico(anno, descrizione);
					listaAnniAccademici.add(annoAccademico);
				}
				st.close();
				logger.info("Query eseguita con successo!");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return listaAnniAccademici;
	}



	/**
	 * Ricerca all'interno del database l'anno accademico che è stato selezionato
	 * @param annoAccademicoSelezionato
	 * @return il dettaglio dell'anno accademico che è stato selezionato
	 */
	public AnnoAccademico getDettaglioAnnoAccademico(String annoSelezionato){
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rsRisultato = null;
		//ArrayList<AnnoAccademico> listaAnniAccademici = new ArrayList<AnnoAccademico>();
		AnnoAccademico annoAccademico = null;
		
		try{
			logger.info("Sto per ritornare il dettaglio dell'anno accademico selezionato!");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso(DBSQL)");
			String query = "";
			logger.info("preparo la query(DBSQL)");
			query= "SELECT * FROM "+DBNames.TABLE_ANNO_ACCADEMICO+" WHERE Anno="+annoSelezionato;
			
			st = con.prepareStatement(query);
			rsRisultato = st.executeQuery(query);
			
			while(rsRisultato.next()){
				String anno = rsRisultato.getString("Anno");
				String descrizione = rsRisultato.getString("Descrizione");
				annoAccademico = new AnnoAccademico(anno, descrizione);
			}
			
	
			st.close();
			logger.info("Query eseguita con successo!");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return annoAccademico;
	}
	
}
