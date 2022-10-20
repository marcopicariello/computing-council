package it.unisa.cc.data.gestioneOffertaTriennale;

import it.unisa.cc.data.gestioneSistema.Insegnamento;

public class InsegnamentoRegolamento {

	private Insegnamento ins;
	private boolean facoltativo;
	private String cfu;
	private String anno;
	private String modulo;

	
	public InsegnamentoRegolamento(Insegnamento ins, boolean facoltativo,
			String cfu, String anno, String modulo) {
		super();
		this.ins = ins;
		this.facoltativo = facoltativo;
		this.cfu = cfu;
		this.anno = anno;
		this.modulo = modulo;
	}
	public Insegnamento getIns() {
		return ins;
	}
	public void setIns(Insegnamento ins) {
		this.ins = ins;
	}
	public boolean isFacoltativo() {
		return facoltativo;
	}
	public void setFacoltativo(boolean facoltativo) {
		this.facoltativo = facoltativo;
	}
	public String getCfu() {
		return cfu;
	}
	public void setCfu(String cfu) {
		this.cfu = cfu;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	
}
