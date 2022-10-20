package it.unisa.cc.gestioneAutenticazione;

import it.unisa.cc.data.gestioneAutenticazione.Account;

import javax.servlet.http.HttpServletRequest;

public interface FacadeGestioneAutenticazione {

	public Account login(String username, String password);
	
	public void logout(HttpServletRequest request);
}
