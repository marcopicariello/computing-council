package it.unisa.cc.data.gestioneOffertaMagistrale;

import it.unisa.cc.data.gestioneSistema.Insegnamento;

import java.util.ArrayList;

public class OrdinamentoMagistrale {

	
	

	private String cfuCaratterizzanti;
	private String cfuAffiniIntegrativi;

	private String cfuASceltaDelloStudente;
	private String cfuUlterioriAttivitaFormative;
	private String cfuProvaFinale;
	private String cfuTotali;
	
	private ArrayList<Insegnamento> arrayInsegnamentiCaratterizzanti;
	private ArrayList<Insegnamento> arrayInsegnamentiAffini;
	
	
	
	
	
	public OrdinamentoMagistrale(String cfuCaratterizzanti,
			String cfuAffiniIntegrativi, String cfuASceltaDelloStudente,
			String cfuUlterioriAttivitaFormative, String cfuProvaFinale,
			String cfuTotali,
			ArrayList<Insegnamento> arrayInsegnamentiCaratterizzanti,
			ArrayList<Insegnamento> arrayInsegnamentiAffini) {
		super();
		this.cfuCaratterizzanti = cfuCaratterizzanti;
		this.cfuAffiniIntegrativi = cfuAffiniIntegrativi;
		this.cfuASceltaDelloStudente = cfuASceltaDelloStudente;
		this.cfuUlterioriAttivitaFormative = cfuUlterioriAttivitaFormative;
		this.cfuProvaFinale = cfuProvaFinale;
		this.cfuTotali = cfuTotali;
		this.arrayInsegnamentiCaratterizzanti = arrayInsegnamentiCaratterizzanti;
		this.arrayInsegnamentiAffini = arrayInsegnamentiAffini;
	}
	public String getCfuCaratterizzanti() {
		return cfuCaratterizzanti;
	}
	public void setCfuCaratterizzanti(String cfuCaratterizzanti) {
		this.cfuCaratterizzanti = cfuCaratterizzanti;
	}
	public String getCfuAffiniIntegrativi() {
		return cfuAffiniIntegrativi;
	}
	public void setCfuAffiniIntegrativi(String cfuAffiniIntegrativi) {
		this.cfuAffiniIntegrativi = cfuAffiniIntegrativi;
	}
	public String getCfuASceltaDelloStudente() {
		return cfuASceltaDelloStudente;
	}
	public void setCfuASceltaDelloStudente(String cfuASceltaDelloStudente) {
		this.cfuASceltaDelloStudente = cfuASceltaDelloStudente;
	}
	public String getCfuUlterioriAttivitaFormative() {
		return cfuUlterioriAttivitaFormative;
	}
	public void setCfuUlterioriAttivitaFormative(
			String cfuUlterioriAttivitaFormative) {
		this.cfuUlterioriAttivitaFormative = cfuUlterioriAttivitaFormative;
	}
	public String getCfuProvaFinale() {
		return cfuProvaFinale;
	}
	public void setCfuProvaFinale(String cfuProvaFinale) {
		this.cfuProvaFinale = cfuProvaFinale;
	}
	public String getCfuTotali() {
		return cfuTotali;
	}
	public void setCfuTotali(String cfuTotali) {
		this.cfuTotali = cfuTotali;
	}
	public ArrayList<Insegnamento> getArrayInsegnamentiCaratterizzanti() {
		return arrayInsegnamentiCaratterizzanti;
	}
	public void setArrayInsegnamentiCaratterizzanti(
			ArrayList<Insegnamento> arrayInsegnamentiCaratterizzanti) {
		this.arrayInsegnamentiCaratterizzanti = arrayInsegnamentiCaratterizzanti;
	}
	public ArrayList<Insegnamento> getArrayInsegnamentiAffini() {
		return arrayInsegnamentiAffini;
	}
	public void setArrayInsegnamentiAffini(
			ArrayList<Insegnamento> arrayInsegnamentiAffini) {
		this.arrayInsegnamentiAffini = arrayInsegnamentiAffini;
	}

	
	
	
	
	
	
	
	
}
