package it.unisa.cc.data.gestioneSistema;

public class Insegnamento {

	private String nome, ssd, tipologiaAttivita;
	
	public Insegnamento(String nome){
		this.nome=nome;
		this.tipologiaAttivita=null;
		this.ssd=null;
	}
	
	public Insegnamento(String nome, String tipologiaAttivita, String ssd){
		this.nome=nome;
		this.tipologiaAttivita=tipologiaAttivita;
		this.ssd=ssd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getTipologiaAttivita() {
		return tipologiaAttivita;
	}

	public void setTipologiaAttivita(String tipologiaAttivita) {
		this.tipologiaAttivita = tipologiaAttivita;
	}
}
