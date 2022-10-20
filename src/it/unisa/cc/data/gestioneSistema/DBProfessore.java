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
import jdk.net.NetworkPermission;

/**
 * La classe si occupa di tutte le operazioni relative al professore all'interno del database
 * 
 */

public class DBProfessore {
	
	private static DBProfessore professore;
	Logger logger = Logger.getLogger("global");
	
	private DBProfessore() {
	}
		public static synchronized DBProfessore getIstance(){
			if(professore==null){
				professore=new DBProfessore();
			}
			return professore;
		}
	
		/**
		 * Inserisce un nuovo professore all'interno del database
		 * @param professore
		 * @param descrizione una breve descrizione riguardo il professore
		 * @return boolean 
		 */
		
		//public boolean inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email,String Ruolo, String Stato){
		public boolean inserisciProfessore(String Nome,String Cognome,String Matricola,String SSD,String Telefono,String Email,String Ruolo, String Stato){
			int risultato=0;	
			Connection con=null;
			try{
				logger.info("MI connetto al database(DBSQL");
				con=DBConnectionPool.getConnection();
				logger.info("Connesso");
				String query = "";
				logger.info("preparo la query(DBSQL)");
			
				
				System.out.println("nome: "+Nome);
				
				/*
				 query="INSERT INTO "+DBNames.TABLE_ACCOUNT+ " (`ID_account`, `ID_professore`,`Username`,`Password`,`Permessi`) VALUES ('" +
						" " + "', '" + Matricola + "','" + Username + "','" + Password + "','0')";
				 */
				
				query="INSERT INTO "+DBNames.TABLE_PROFESSORE+ " (`Nome`, `Cognome`,`Matricola`,`SSD`,`Telefono`,`Email`,`Ruolo`,`Stato`) VALUES " +
						"('" + Nome + "', '" + Cognome + "','" + Matricola + "','" + SSD + "', '"+Telefono +"', '" +Email +"', '" + Ruolo +"','" + Stato +"')";
				
				Statement st = con.createStatement();
				risultato=st.executeUpdate(query);
				con.commit();
				st.close();
			}
			catch(SQLException e){
				logger.warning(e+"Sql exception");
				return false;
			}
			catch(Exception e){
				logger.warning(e+"Sql exception");
				return false;
			}
			finally{
				DBConnectionPool.releaseConnection(con);
			}
			return(risultato>0);
		}
		
		/**
		 * Ricerca tutti i professori all'interno del database
		 * @return ritorna la lista dei professori
		 * 
		 */
		
		public ArrayList<Professore> getListaProfessori(){
			
			Connection con = null;
			PreparedStatement st = null;
			ResultSet rsRisultato = null;
			ArrayList<Professore> listaProfessori = new ArrayList<Professore>();
			
			try{	
				logger.info("Sto per ritornare la lista dei professori");
				con = DBConnectionPool.getConnection();
				logger.info("Connesso(DBSQL)");
				String query = "";
				logger.info("preparo la query(DBSQL)");
				query= "SELECT * FROM "+DBNames.TABLE_PROFESSORE;
				
				st = con.prepareStatement(query);
				rsRisultato = st.executeQuery(query);
				
					while(rsRisultato.next()){
						String Nome = rsRisultato.getString("Nome");
						String Cognome = rsRisultato.getString("Cognome");
						
						Professore professore = new Professore(Nome, Cognome);
						listaProfessori.add(professore);
					}
					st.close();
					logger.info("Query eseguita con successo!");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return listaProfessori;
		}
		
		/**
		 * Conta i professsori che ci sono all'interno del database
		 * @return il numero dei professori all'interno del database
		 */
		public Professore getDettaglioProfessore(String matricolaSelezionata) {
			return null;
		}


		public boolean modificaStatoProfessore(boolean val){
			return true;
		}
		
		public int returnMonteOreProfessore(String idProf){
			return 0;
		}

}
	
