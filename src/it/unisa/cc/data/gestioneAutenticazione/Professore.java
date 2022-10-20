package it.unisa.cc.data.gestioneAutenticazione;

/* La classe è una rappresentazione di un professore del sistema */

public class Professore extends Account{
	
	private int id_professore;
	private String nome, cognome, matricola, ssd, ruolo, telefono, email;
	private boolean stato;
	private Account account;
	
	public Professore(){
		
	}
	
	public Professore(int id_professore, String nome, String cognome, String matricola, String ssd, 
			String ruolo, boolean stato, String telefono, String email, Account account){
		
		this.id_professore=id_professore;
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
		this.ssd=ssd;
		this.ruolo=ruolo;
		this.stato=stato;
		this.telefono=telefono;
		this.email=email;
		
	}

	public int getId_professore() {
		return id_professore;
	}

	public void setId_professore(int id_professore) {
		this.id_professore = id_professore;
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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
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

	
	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
}
