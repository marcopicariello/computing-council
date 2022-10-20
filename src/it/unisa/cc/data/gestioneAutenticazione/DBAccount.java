package it.unisa.cc.data.gestioneAutenticazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

import it.unisa.cc.storage.DBConnectionPool;
import it.unisa.cc.commons.DBNames;
import it.unisa.cc.data.gestioneAutenticazione.Account;

public class DBAccount{
	private static Logger logger = Logger.getLogger("global");
	private static DBAccount account;
	private DBAccount(){
		
	}
	
	
	public static synchronized DBAccount getInstance() {//applico il singleton	
		if(account==null){
			account=new DBAccount();	
		}
		return account;	
	}
	
	

public Account getAccount(String user, String pass) {
		
		ResultSet risultato=null;
		Connection con = null;
		java.sql.PreparedStatement statement=null;
		try {
			logger.info("Mi sto per connettere");
			con = DBConnectionPool.getConnection();
			logger.info("Connesso");
			String query = "";
			logger.info("preparo la query");
			query = "select * from account  where username='"+user+"' and password='"+pass+"'";
			
		    statement = con.prepareStatement(query);
			risultato =  statement.executeQuery(query); 
			con.commit();
			
			logger.info("Righe: "+risultato.getRow());
			
			risultato.next();
		  if(risultato.getRow()==0){
			  logger.warning("0 risultati");
			  return null;
			  
		  }
		  else{
			  
		int id = risultato.getInt("ID_account");  
		String username = risultato.getString("username");
	    String password = risultato.getString("password");
	    boolean permessi = risultato.getBoolean("permessi");
			  
			  Account admin = new Account(id,username,password,permessi);
			  
			  statement.close();
			  return admin;
			  
		  }
				
	}catch(SQLException e){
		logger.warning(e+"Sql exception (AGGIUNGI ACQUISTO AGENTE)");
		return null;
	}catch(Exception e){
		logger.warning(e+" exception (AGGIUNGI ACQUISTO AGENTE)");
		return null;
	}finally{
		DBConnectionPool.releaseConnection(con);
	}
	}
	
}	
	
	
	/*
	@Override
	
	public boolean verificaPermessi(String username, String password) throws SQLException {
		try {
			if (this.getAccount(username, password) != null)
				return true;

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore");
		}
		return false;
	}

	@Override
	public boolean stato(String username, String password) throws SQLException {

		return false;
	}

	@Override
	public Account getAccount(String user, String pass) throws SQLException {
		Connection connection = null;
		java.sql.PreparedStatement statement = null;
		Account account = null;
		String query;
		ResultSet rsRicerca = null;

		try {
			connection = DBConnectionPool.getConnection();
			query = "SELECT * FROM " + it.unisa.cc.commons.DBNames.TABLE_ACCOUNT + " WHERE Username=\"" + user + "\" AND Password=\"" + pass + "\"";
			System.out.println(query);
			statement = connection.prepareStatement(query);
			rsRicerca = statement.executeQuery(query);
			System.out.println("query fatta");
			rsRicerca.next();
			int id_Account = rsRicerca.getInt("ID_Account");
			String username = rsRicerca.getString("Username");
			String password = rsRicerca.getString("Password");
			String tmp = rsRicerca.getString("Permessi");
			boolean permessi;
			
			if(tmp.equals("true")){
				permessi = true;
			}
			else
				permessi = false; 
			

			account = new Account();
			account.setId(id_Account);
			account.setUsername(username);
			account.setPassword(password);
			account.setPermessi(permessi);

			return account;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore");
		}
		finally {
			statement.close();
			DBConnectionPool.releaseConnection(connection);
		}
		return account;
	}
	

	@Override
	public boolean inserisciAccount(Account account) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		String insert;
		try {
			connection = DBConnectionPool.getConnection();
			insert = "INSERT INTO  account (Username, Password, Tipologia ) " + "VALUES ('" + account.getUsername() + "','" + account.getPassword() + "','" + account.getPermessi() + "')";

			System.out.println(insert);
			statement = connection.createStatement();
			int result = statement.executeUpdate(insert);
			connection.commit();
			statement.close();

			DBConnectionPool.releaseConnection(connection);
			return result > 0;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public boolean modificaAccount(Account account) throws SQLException {
		Connection connection = null;
		java.sql.PreparedStatement statement = null;
		String query;
		
		try{
			connection = DBConnectionPool.getConnection();
			query = "UPDATE account SET Username='"+account.getUsername() + "', Password='" + account.getPassword() +
					"',Permessi='" + account.getPermessi() + "' WHERE ID_Account=" + account.getId();
			
			System.out.println(query);
			statement = connection.prepareStatement(query);
			int result = statement.executeUpdate(query);
			System.out.println("Query fatta");
			connection.commit();
			statement.close();
			DBConnectionPool.releaseConnection(connection);
			return result>0;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Errore");
			return false;
		}
		
	}

	@Override
	public Account visualizzaAccount(int Id_account) throws SQLException {
		Connection connection = null;
		java.sql.PreparedStatement statement = null;
		Account account = null;
		String query;
		ResultSet rsRicerca = null;

		try {
			connection = DBConnectionPool.getConnection();
			query = "SELECT * FROM " + DBNames.TABLE_ACCOUNT + " where ID_Account=" + Id_account;
			System.out.println(query);
			statement = connection.prepareStatement(query);
			rsRicerca = statement.executeQuery(query);
			System.out.println("query fatta");
			if (rsRicerca.next()) {
				int id_Account = rsRicerca.getInt("ID_Account");
				String username = rsRicerca.getString("Username");
				String password = rsRicerca.getString("Password");

				String tmp = rsRicerca.getString("Permessi");
				boolean permessi;
				
				if(tmp.equals("true")){
					permessi = true;
				}
				else
					permessi = false;
				
				account = new Account();
				account.setId(id_Account);
				account.setUsername(username);
				account.setPassword(password);
				account.setPermessi(permessi);

				return account;
			}
			else {
				return null;
			}

		}
		finally {
			statement.close();
			DBConnectionPool.releaseConnection(connection);
		}
	}

	@Override
	public boolean eliminaAccount(Account account) throws SQLException{
		Connection connection = null;
		Statement statement = null;
		String delete;

		try {
			connection = DBConnectionPool.getConnection();
			delete = "delete from account where ID_Account=" + account.getId();

			System.out.println(delete);
			statement = connection.prepareStatement(delete);
			int result = statement.executeUpdate(delete);
			connection.commit();
			statement.close();
			DBConnectionPool.releaseConnection(connection);

			return result > 0;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public int getUltimoIdAccount() throws SQLException{
		Connection connection = null;
		java.sql.PreparedStatement statement = null;
		String query;
		ResultSet rsRicerca = null;
		int id_Account = -1;
		try {
			connection = DBConnectionPool.getConnection();
			query = "SELECT max(ID_Account) FROM Account";
			System.out.println(query);
			statement = connection.prepareStatement(query);
			rsRicerca = statement.executeQuery(query);
			System.out.println("query fatta");
			rsRicerca.next();
			id_Account = rsRicerca.getInt("max(ID_Account)");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore");
		}
		finally {
			statement.close();
			DBConnectionPool.releaseConnection(connection);
		}
		return id_Account;
	}
	*/

