package it.unisa.cc.data.gestioneAutenticazione;

/**
 * La classe è una rappresentazione di un Account del sistema
 *
 */
public class Account {
	
	private int id;
	private String username, password;
	
	/**
	 * se permessi vale 0 indica un professore se vale 1 indica il presidente
	 */
	private boolean permessi;
	
	public Account(){};
	
	public Account(int id, String username, String password, boolean permessi) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.permessi = permessi;
	}
	
	public Account getAccount(String username, String password){
		return null;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean getPermessi() {
		return permessi;
	}


	public void setPermessi(boolean permessi) {
		this.permessi = permessi;
	}
	

}
