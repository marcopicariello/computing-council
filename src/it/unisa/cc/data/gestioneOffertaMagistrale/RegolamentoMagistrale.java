package it.unisa.cc.data.gestioneOffertaMagistrale;

import it.unisa.cc.data.gestioneSistema.Insegnamento;

import java.util.ArrayList;

public class RegolamentoMagistrale {

	private String nomeCurriculum;
	private String cfuFacoltativiPrimoAnno;
	private String cfuFacoltativiSecondoAnno;
	private String cfuSceltaLibera;
	private String cfuTirocinio;
	private String cfuProvaFinale;
	private ArrayList<InsegnamentoRegolamento> insegnamentoPrimoAnno;
	private ArrayList<InsegnamentoRegolamento> insegnamentoSecondoAnno;

	public RegolamentoMagistrale(){}
	

	public RegolamentoMagistrale(String nomeCurriculum,
			String cfuFacoltativiPrimoAnno, String cfuFacoltativiSecondoAnno,
			String cfuFacoltativiTerzoAnno, String cfuSceltaLibera,
			String cfuTirocinio, String cfuProvaFinale,
			ArrayList<InsegnamentoRegolamento> insegnamentoPrimoAnno,
			ArrayList<InsegnamentoRegolamento> insegnamentoSecondoAnno
			) {
		super();
		this.nomeCurriculum = nomeCurriculum;
		this.cfuFacoltativiPrimoAnno = cfuFacoltativiPrimoAnno;
		this.cfuFacoltativiSecondoAnno = cfuFacoltativiSecondoAnno;
		this.cfuSceltaLibera = cfuSceltaLibera;
		this.cfuTirocinio = cfuTirocinio;
		this.cfuProvaFinale = cfuProvaFinale;
		this.insegnamentoPrimoAnno = insegnamentoPrimoAnno;
		this.insegnamentoSecondoAnno = insegnamentoSecondoAnno;

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


}
