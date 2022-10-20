package it.unisa.cc.data.gestioneProgrDidattica;

import it.unisa.cc.data.gestioneOffertaTriennale.InsegnamentoRegolamento;

import java.util.ArrayList;

public class Corso {

	private ArrayList<InsegnamentoProfessore> professori;
	private InsegnamentoRegolamento esame;
	
	public Corso(){}
	

	public Corso(ArrayList<InsegnamentoProfessore> professori,
			InsegnamentoRegolamento esame) {
		super();
		this.professori = professori;
		this.esame = esame;
	}
	public ArrayList<InsegnamentoProfessore> getProfessori() {
		return professori;
	}
	public void setProfessori(ArrayList<InsegnamentoProfessore> professori) {
		this.professori = professori;
	}
	public InsegnamentoRegolamento getEsame() {
		return esame;
	}
	public void setEsame(InsegnamentoRegolamento esame) {
		this.esame = esame;
	}
	

	
}
