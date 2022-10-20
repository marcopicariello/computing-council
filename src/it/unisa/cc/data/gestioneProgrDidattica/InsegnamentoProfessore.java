package it.unisa.cc.data.gestioneProgrDidattica;

import it.unisa.cc.data.gestioneSistema.Professore;

public class InsegnamentoProfessore {

	private String semestre;
    private String oreLab;
    private String teoria;
    private Professore professore;
    

	public InsegnamentoProfessore(String semestre, String oreLab,
			String teoria, Professore professore) {
		super();
		this.semestre = semestre;
		this.oreLab = oreLab;
		this.teoria = teoria;
		this.professore = professore;
	}
	
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getOreLab() {
		return oreLab;
	}
	public void setOreLab(String oreLab) {
		this.oreLab = oreLab;
	}
	public String getTeoria() {
		return teoria;
	}
	public void setTeoria(String teoria) {
		this.teoria = teoria;
	}
	public Professore getProfessore() {
		return professore;
	}
	public void setProfessore(Professore professore) {
		this.professore = professore;
	}
    
    
    
    
	
}
