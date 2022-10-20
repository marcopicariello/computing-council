package it.unisa.cc.data.gestioneOffertaTriennale;

import it.unisa.cc.data.gestioneSistema.Insegnamento;

import java.util.ArrayList;

public class OrdinamentoTriennale {

	
	
	private String cfuDiBase;
	private String cfuDiBaseInformatico;
	private String cfuMatematicoFisico;
	private String cfuCaratterizzanti;
	private String cfuCaratterizzantiInformatico;
	private String cfuAffiniIntegrativi;
	private String cfuASceltaDelloStudente;
	private String cfuTirocinio;
	private String cfuUlterioriAttivitaFormative;
	private String cfuLinguaInglese;
	private String cfuProvaFinale;
	private String cfuTotali;
	
	private ArrayList<Insegnamento> arrayDiBaeMatematicoFisico;
	private ArrayList<Insegnamento> arrayDiBaseInformatico;
	private ArrayList<Insegnamento> arrayCaratterizzantiInformatico;
	private ArrayList<Insegnamento> arrayAffiniIntegrativi;
	
	
	
	
	
	
	
	public OrdinamentoTriennale(String cfuDiBase, String cfuDiBaseInformatico,
			String cfuMatematicoFisico, String cfuCaratterizzanti,
			String cfuCaratterizzantiInformatico, String cfuAffiniIntegrativi,
			String cfuASceltaDelloStudente, String cfuTirocinio,
			String cfuUlterioriAttivitaFormative, String cfuLinguaInglese,
			String cfuProvaFinale, String cfuTotali,
			ArrayList<Insegnamento> arrayDiBaeMatematicoFisico,
			ArrayList<Insegnamento> arrayDiBaseInformatico,
			ArrayList<Insegnamento> arrayCaratterizzantiInformatico,
			ArrayList<Insegnamento> arrayAffiniIntegrativi) {
		super();
		this.cfuDiBase = cfuDiBase;
		this.cfuDiBaseInformatico = cfuDiBaseInformatico;
		this.cfuMatematicoFisico = cfuMatematicoFisico;
		this.cfuCaratterizzanti = cfuCaratterizzanti;
		this.cfuCaratterizzantiInformatico = cfuCaratterizzantiInformatico;
		this.cfuAffiniIntegrativi = cfuAffiniIntegrativi;
		this.cfuASceltaDelloStudente = cfuASceltaDelloStudente;
		this.cfuTirocinio = cfuTirocinio;
		this.cfuUlterioriAttivitaFormative = cfuUlterioriAttivitaFormative;
		this.cfuLinguaInglese = cfuLinguaInglese;
		this.cfuProvaFinale = cfuProvaFinale;
		this.cfuTotali = cfuTotali;
		this.arrayDiBaeMatematicoFisico = arrayDiBaeMatematicoFisico;
		this.arrayDiBaseInformatico = arrayDiBaseInformatico;
		this.arrayCaratterizzantiInformatico = arrayCaratterizzantiInformatico;
		this.arrayAffiniIntegrativi = arrayAffiniIntegrativi;
	}
	public String getCfuDiBase() {
		return cfuDiBase;
	}
	public void setCfuDiBase(String cfuDiBase) {
		this.cfuDiBase = cfuDiBase;
	}
	public String getCfuDiBaseInformatico() {
		return cfuDiBaseInformatico;
	}
	public void setCfuDiBaseInformatico(String cfuDiBaseInformatico) {
		this.cfuDiBaseInformatico = cfuDiBaseInformatico;
	}
	public String getCfuMatematicoFisico() {
		return cfuMatematicoFisico;
	}
	public void setCfuMatematicoFisico(String cfuMatematicoFisico) {
		this.cfuMatematicoFisico = cfuMatematicoFisico;
	}
	public String getCfuCaratterizzanti() {
		return cfuCaratterizzanti;
	}
	public void setCfuCaratterizzanti(String cfuCaratterizzanti) {
		this.cfuCaratterizzanti = cfuCaratterizzanti;
	}
	public String getCfuCaratterizzantiInformatico() {
		return cfuCaratterizzantiInformatico;
	}
	public void setCfuCaratterizzantiInformatico(
			String cfuCaratterizzantiInformatico) {
		this.cfuCaratterizzantiInformatico = cfuCaratterizzantiInformatico;
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
	public String getCfuTirocinio() {
		return cfuTirocinio;
	}
	public void setCfuTirocinio(String cfuTirocinio) {
		this.cfuTirocinio = cfuTirocinio;
	}
	public String getCfuUlterioriAttivitaFormative() {
		return cfuUlterioriAttivitaFormative;
	}
	public void setCfuUlterioriAttivitaFormative(
			String cfuUlterioriAttivitaFormative) {
		this.cfuUlterioriAttivitaFormative = cfuUlterioriAttivitaFormative;
	}
	public String getCfuLinguaInglese() {
		return cfuLinguaInglese;
	}
	public void setCfuLinguaInglese(String cfuLinguaInglese) {
		this.cfuLinguaInglese = cfuLinguaInglese;
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
	public ArrayList<Insegnamento> getArrayDiBaeMatematicoFisico() {
		return arrayDiBaeMatematicoFisico;
	}
	public void setArrayDiBaeMatematicoFisico(
			ArrayList<Insegnamento> arrayDiBaeMatematicoFisico) {
		this.arrayDiBaeMatematicoFisico = arrayDiBaeMatematicoFisico;
	}
	public ArrayList<Insegnamento> getArrayDiBaseInformatico() {
		return arrayDiBaseInformatico;
	}
	public void setArrayDiBaseInformatico(
			ArrayList<Insegnamento> arrayDiBaseInformatico) {
		this.arrayDiBaseInformatico = arrayDiBaseInformatico;
	}
	public ArrayList<Insegnamento> getArrayCaratterizzantiInformatico() {
		return arrayCaratterizzantiInformatico;
	}
	public void setArrayCaratterizzantiInformatico(
			ArrayList<Insegnamento> arrayCaratterizzantiInformatico) {
		this.arrayCaratterizzantiInformatico = arrayCaratterizzantiInformatico;
	}
	public ArrayList<Insegnamento> getArrayAffiniIntegrativi() {
		return arrayAffiniIntegrativi;
	}
	public void setArrayAffiniIntegrativi(
			ArrayList<Insegnamento> arrayAffiniIntegrativi) {
		this.arrayAffiniIntegrativi = arrayAffiniIntegrativi;
	}
	
	
	
	
	
	
}
