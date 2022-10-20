package it.unisa.cc.storage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/* Gestisce la connessione al database */

public class DBConnectionPool {

	/*
	 * This code prepare the db connection pool. In particular, it creates the
	 * free connections queue and defines the db properties.
	 */
	static {// crea una lista per le connessioni
		freeDbConnections = new ArrayList<Connection>();
		try {
			DBConnectionPool.loadDbProperties();// carica le proprieta e il driver per connettermi al db
			DBConnectionPool.loadDbDriver();
		}
		catch (ClassNotFoundException e) {
			System.err.println("DB DRIVER NOT FOUND!");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("DB CONNECTION POOL ERROR!");
			System.exit(2);
		}
	}
	/**
	 * The db properties (driver, url, login, and password)
	 */
	private static Properties dbProperties;
	/**
	 * The free connection queue
	 */
	private static List<Connection> freeDbConnections;

	/**
	 * Returns a free db connection accessing to the free db connection queue.
	 * If the queue is empty a new db connection will be created.
	 * 
	 * @return A db connection
	 * @throws SQLException
	 */
	public static synchronized Connection getConnection() throws SQLException {// metodo per istaurare una connessione al db
		Connection connection;

		if (!freeDbConnections.isEmpty()) {// controlliamo se ce gia una connessione se ce prendo la prima e la rimuovo dalla lista
			// Extract a connection from the free db connection queue
			connection = (Connection) freeDbConnections.get(0);
			DBConnectionPool.freeDbConnections.remove(0);

			try {
				// If the connection is not valid, a new connection will be
				// analyzed
				if (connection.isClosed()) {
					connection = DBConnectionPool.getConnection();
				}
			}
			catch (SQLException e) {
				connection = DBConnectionPool.getConnection();
			}
		}
		else // se non c'� creo la connessione
		{
			connection = DBConnectionPool.createDBConnection();
		}

		return connection;
	}

	/**
	 * Releases the connection represented by <code>pReleasedConnection</code>
	 * parameter
	 * 
	 * @param pReleasedConnection The db connection to release
	 */
	public static synchronized void releaseConnection(
			Connection pReleasedConnection) {
		try {
			// Add the connection to the free db connection queue
			DBConnectionPool.freeDbConnections.add(pReleasedConnection);
			pReleasedConnection.close();
		}
		catch (SQLException ex) {
			Logger.getLogger(DBConnectionPool.class.getName()).log(Level.SEVERE,
					null,
					ex);
		}
	}

	/**
	 * Creates a new db connection
	 * 
	 * @return A db connection
	 * @throws SQLException
	 */
	private static Connection createDBConnection() throws SQLException {// creo la connessione prendendomi le proprieta prese all'inizio
		Connection newConnection = null;

		// Create a new db connection using the db properties
		newConnection = DriverManager.getConnection(DBConnectionPool.dbProperties.getProperty("url"),
				DBConnectionPool.dbProperties.getProperty("username"),
				DBConnectionPool.dbProperties.getProperty("password"));

		newConnection.setAutoCommit(false);

		return newConnection;
	}

	private static void loadDbDriver() throws ClassNotFoundException {
		//Class.forName(dbProperties.getProperty("driver"));
		Class.forName("com.mysql.jdbc.Driver");

	}

	/**
	 * Loads the db properties
	 * 
	 * @throws IOException
	 */
	private static void loadDbProperties() throws IOException {
		/*InputStream fileProperties = DBConnectionPool.class.getClassLoader().getResourceAsStream("/database.properties");
		dbProperties = new Properties();
		dbProperties.load(fileProperties);*/
		
		dbProperties = new Properties();
		dbProperties.setProperty("driver", "com.mysql.jdbc.Driver");
		dbProperties.setProperty("url", "jdbc:mysql://localhost/computingcouncil");
		dbProperties.setProperty("username", "root");
		   dbProperties.setProperty("password", "root");
	}
}

