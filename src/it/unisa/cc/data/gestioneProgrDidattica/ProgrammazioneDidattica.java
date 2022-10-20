package it.unisa.cc.data.gestioneProgrDidattica;

import java.util.ArrayList;

public class ProgrammazioneDidattica {

	private ArrayList<Corso> primoAnnoTriennale;
	private ArrayList<Corso> secondoAnnoTriennale;
	private ArrayList<Corso> terzoAnnoTriennale;
	private ArrayList<Corso> primoAnnoMagistrale;
	private ArrayList<Corso> secondoAnnoMagistrale;
	
	
	public ProgrammazioneDidattica(){}
	
	
	public ProgrammazioneDidattica(ArrayList<Corso> primoAnnoTriennale,
			ArrayList<Corso> secondoAnnoTriennale,
			ArrayList<Corso> terzoAnnoTriennale,
			ArrayList<Corso> primoAnnoMagistrale,
			ArrayList<Corso> secondoAnnoMagistrale) {
		super();
		this.primoAnnoTriennale = primoAnnoTriennale;
		this.secondoAnnoTriennale = secondoAnnoTriennale;
		this.terzoAnnoTriennale = terzoAnnoTriennale;
		this.primoAnnoMagistrale = primoAnnoMagistrale;
		this.secondoAnnoMagistrale = secondoAnnoMagistrale;
	}
	public ArrayList<Corso> getPrimoAnnoTriennale() {
		return primoAnnoTriennale;
	}
	public void setPrimoAnnoTriennale(ArrayList<Corso> primoAnnoTriennale) {
		this.primoAnnoTriennale = primoAnnoTriennale;
	}
	public ArrayList<Corso> getSecondoAnnoTriennale() {
		return secondoAnnoTriennale;
	}
	public void setSecondoAnnoTriennale(ArrayList<Corso> secondoAnnoTriennale) {
		this.secondoAnnoTriennale = secondoAnnoTriennale;
	}
	public ArrayList<Corso> getTerzoAnnoTriennale() {
		return terzoAnnoTriennale;
	}
	public void setTerzoAnnoTriennale(ArrayList<Corso> terzoAnnoTriennale) {
		this.terzoAnnoTriennale = terzoAnnoTriennale;
	}
	public ArrayList<Corso> getPrimoAnnoMagistrale() {
		return primoAnnoMagistrale;
	}
	public void setPrimoAnnoMagistrale(ArrayList<Corso> primoAnnoMagistrale) {
		this.primoAnnoMagistrale = primoAnnoMagistrale;
	}
	public ArrayList<Corso> getSecondoAnnoMagistrale() {
		return secondoAnnoMagistrale;
	}
	public void setSecondoAnnoMagistrale(ArrayList<Corso> secondoAnnoMagistrale) {
		this.secondoAnnoMagistrale = secondoAnnoMagistrale;
	}
	
	
	
	
	
}
