package it.unisa.cc.data.gestioneOffertaTriennale;

import it.unisa.cc.data.gestioneSistema.Insegnamento;

import java.util.ArrayList;

public class RegolamentoTriennale {

	private String nomeCurriculum;
	private String cfuFacoltativiPrimoAnno;
	private String cfuFacoltativiSecondoAnno;
	private String cfuFacoltativiTerzoAnno;
	private String cfuSceltaLibera;
	private String cfuTirocinio;
	private String cfuProvaFinale;
	private ArrayList<InsegnamentoRegolamento> insegnamentoPrimoAnno;
	private ArrayList<InsegnamentoRegolamento> insegnamentoSecondoAnno;
	private ArrayList<InsegnamentoRegolamento> insegnamentoTerzoAnno;
	
	

	public RegolamentoTriennale(String nomeCurriculum,
			String cfuFacoltativiPrimoAnno, String cfuFacoltativiSecondoAnno,
			String cfuFacoltativiTerzoAnno, String cfuSceltaLibera,
			String cfuTirocinio, String cfuProvaFinale,
			ArrayList<InsegnamentoRegolamento> insegnamentoPrimoAnno,
			ArrayList<InsegnamentoRegolamento> insegnamentoSecondoAnno,
			ArrayList<InsegnamentoRegolamento> insegnamentoTerzoAnno) {
		super();
		this.nomeCurriculum = nomeCurriculum;
		this.cfuFacoltativiPrimoAnno = cfuFacoltativiPrimoAnno;
		this.cfuFacoltativiSecondoAnno = cfuFacoltativiSecondoAnno;
		this.cfuFacoltativiTerzoAnno = cfuFacoltativiTerzoAnno;
		this.cfuSceltaLibera = cfuSceltaLibera;
		this.cfuTirocinio = cfuTirocinio;
		this.cfuProvaFinale = cfuProvaFinale;
		this.insegnamentoPrimoAnno = insegnamentoPrimoAnno;
		this.insegnamentoSecondoAnno = insegnamentoSecondoAnno;
		this.insegnamentoTerzoAnno = insegnamentoTerzoAnno;
	}
	
	
	public String getNomeCurriculum() {
		return nomeCurriculum;
	}
	public void setNomeCurriculum(String nomeCurriculum) {
		this.nomeCurriculum = nomeCurriculum;
	}
	public String getCfuFacoltativiPrimoAnno() {
		return cfuFacoltativiPrimoAnno;
	}
	public void setCfuFacoltativiPrimoAnno(String cfuFacoltativiPrimoAnno) {
		this.cfuFacoltativiPrimoAnno = cfuFacoltativiPrimoAnno;
	}
	public String getCfuFacoltativiSecondoAnno() {
		return cfuFacoltativiSecondoAnno;
	}
	public void setCfuFacoltativiSecondoAnno(String cfuFacoltativiSecondoAnno) {
		this.cfuFacoltativiSecondoAnno = cfuFacoltativiSecondoAnno;
	}
	public String getCfuFacoltativiTerzoAnno() {
		return cfuFacoltativiTerzoAnno;
	}
	public void setCfuFacoltativiTerzoAnno(String cfuFacoltativiTerzoAnno) {
		this.cfuFacoltativiTerzoAnno = cfuFacoltativiTerzoAnno;
	}
	public String getCfuSceltaLibera() {
		return cfuSceltaLibera;
	}
	public void setCfuSceltaLibera(String cfuSceltaLibera) {
		this.cfuSceltaLibera = cfuSceltaLibera;
	}
	public String getCfuTirocinio() {
		return cfuTirocinio;
	}
	public void setCfuTirocinio(String cfuTirocinio) {
		this.cfuTirocinio = cfuTirocinio;
	}
	public String getCfuProvaFinale() {
		return cfuProvaFinale;
	}
	public void setCfuProvaFinale(String cfuProvaFinale) {
		this.cfuProvaFinale = cfuProvaFinale;
	}
	public ArrayList<InsegnamentoRegolamento> getInsegnamentoPrimoAnno() {
		return insegnamentoPrimoAnno;
	}
	public void setInsegnamentoPrimoAnno(
			ArrayList<InsegnamentoRegolamento> insegnamentoPrimoAnno) {
		this.insegnamentoPrimoAnno = insegnamentoPrimoAnno;
	}
	public ArrayList<InsegnamentoRegolamento> getInsegnamentoSecondoAnno() {
		return insegnamentoSecondoAnno;
	}
	public void setInsegnamentoSecondoAnno(
			ArrayList<InsegnamentoRegolamento> insegnamentoSecondoAnno) {
		this.insegnamentoSecondoAnno = insegnamentoSecondoAnno;
	}
	public ArrayList<InsegnamentoRegolamento> getInsegnamentoTerzoAnno() {
		return insegnamentoTerzoAnno;
	}
	public void setInsegnamentoTerzoAnno(
			ArrayList<InsegnamentoRegolamento> insegnamentoTerzoAnno) {
		this.insegnamentoTerzoAnno = insegnamentoTerzoAnno;
	}

}
