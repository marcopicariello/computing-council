package it.unisa.cc.data.gestioneSistema;

public class AnnoAccademico {

	private String anno, descizione;
	
	public AnnoAccademico(String anno, String descrizione){
		this.anno=anno;
		this.descizione=descrizione;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getDescizione() {
		return descizione;
	}

	public void setDescizione(String descizione) {
		this.descizione = descizione;
	}
	
	
	
}
