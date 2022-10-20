package it.unisa.cc.gestioneAutenticazione;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import it.unisa.cc.data.gestioneAutenticazione.Account;
import it.unisa.cc.data.gestioneAutenticazione.DBAccount;

public class GestioneAutenticazione implements FacadeGestioneAutenticazione{

	private static GestioneAutenticazione gestore;
	private DBAccount accountGenerico;
	
	public GestioneAutenticazione(){
		accountGenerico=DBAccount.getInstance();
	}
	public static synchronized GestioneAutenticazione getIstance(){
		if(gestore==null){
			gestore = new GestioneAutenticazione();
		}
		return gestore;
	}
	
	public Account login(String username, String password){
		Account account = accountGenerico.getAccount(username, password);
		if(account == null){
			return null;
		}
		else{
			return account;
		}
	}
	
	public void logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
	}
}
