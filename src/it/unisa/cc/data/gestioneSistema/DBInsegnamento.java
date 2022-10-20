package it.unisa.cc.data.gestioneSistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import it.unisa.cc.commons.DBNames;
import it.unisa.cc.storage.DBConnectionPool;

public class DBInsegnamento {

	private static DBInsegnamento insegnamento;
	Logger logger = Logger.getLogger("global");
	
	
	private DBInsegnamento(){
		
	}
	
	
	public static synchronized DBInsegnamento getInstance(){
		if(insegnamento == null){
			insegnamento = new DBInsegnamento();
		}
		return insegnamento;
	}
	
	
	public boolean inserisciInsegnamento(String nome, String tipologiaAttivita, String ssd){
		
			int risultato = 0;
			Connection con = null;
			try{
				logger.info("Mi sto per connettere(DBSQL)");
				con = DBConnectionPool.getConnection();
				logger.info("Connesso(DBSQL)");
				String query = "";
				logger.info("preparo la query(DBSQL)");
				query= "INSERT INTO "+DBNames.TABLE_INSEGNAMENTO+ " (`Nome`, `Tipologia_attivita`, `SSD`) VALUES "+
				" ('" + nome + "', '" + tipologiaAttivita + "', '" + ssd+ "')";
				Statement st = con.createStatement();
				risultato = st.executeUpdate(query);
				con.commit();
				st.close();
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
	 * Ricerca tutti gli insegnamenti all'interno del database
	 * @return ritorna la lista degli insegnamenti
	 */
	public ArrayList<Insegnamento> getListaInsegnamenti(){
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rsRisultato = null;
		ArrayList<Insegnamento> listaInsegnamenti = new ArrayList<Insegnamento>();
		
		try{
			logger.info("Sto per restituire la lista degli anni accademici");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso(DBSQL)");
			String query = "";
			logger.info("preparo la query(DBSQL)");
			query= "SELECT * FROM "+DBNames.TABLE_INSEGNAMENTO;
			
			st = con.prepareStatement(query);
			rsRisultato = st.executeQuery(query);
			
				while(rsRisultato.next()){
					String nome = rsRisultato.getString("Nome");
					
					Insegnamento insegnamento = new Insegnamento(nome);
					listaInsegnamenti.add(insegnamento);
				}
				st.close();
				logger.info("Query eseguita con successo!");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return listaInsegnamenti;
	}
	
	/**
	 * Ricerca all'interno del database l'insegnamento che è stato selezionato
	 * @param insegnamentoSelezionato
	 * @return il dettaglio dell'insegnamento che è stato selezionato
	 */
	public Insegnamento getDettaglioInsegnamento(int insegnamentoSelezionato){
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rsRisultato = null;
		//ArrayList<AnnoAccademico> listaAnniAccademici = new ArrayList<AnnoAccademico>();
		Insegnamento insegnamento = null;
		
		try{
			logger.info("Sto per restituire il dettaglio dell'insegnamento selezionato!");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso(DBSQL)");
			String query = "";
			logger.info("preparo la query(DBSQL)");
			query= "SELECT * FROM "+DBNames.TABLE_INSEGNAMENTO+" WHERE ID_insegnamento="+insegnamentoSelezionato;
			
			st = con.prepareStatement(query);
			rsRisultato = st.executeQuery(query);
			
			while(rsRisultato.next()){
				String nome = rsRisultato.getString("Nome");
				String tipologiaAttivita = rsRisultato.getString("Tipologia_attivita");
				String ssd = rsRisultato.getString("SSD");
				
				insegnamento = new Insegnamento(nome,tipologiaAttivita,ssd);
			}
			
	
			st.close();
			logger.info("Query eseguita con successo!");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return insegnamento;
	}
	
}
