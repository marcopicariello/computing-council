package it.unisa.cc.data.gestioneSistema;

import it.unisa.cc.data.gestioneAutenticazione.Account;

public class Professore extends Account {

	private String  nome,cognome,matricola,SSD,telefono,email,ruolo,stato;
	
	public Professore(String nome,String cognome){
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=null;
		this.SSD=null;
		this.telefono=null;
		this.email=null;
		this.ruolo=null;
	}
	
	public Professore(String nome,String cognome,String matricola, String SSD,String telefono,String email,String ruolo, String stato){
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
		this.SSD=SSD;
		this.telefono=telefono;
		this.email=email;
		this.ruolo=ruolo;
		this.stato=stato;
	}
	
	
	
	

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getMatricola() {
		return matricola;
	}


	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSSD() {
		return SSD;
	}
	public void setSSD(String SSD) {
		this.SSD = SSD;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}


	
	
	
}
