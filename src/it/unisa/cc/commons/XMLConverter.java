package it.unisa.cc.commons;


import java.util.ArrayList;

import org.jdom.Document;
import org.jdom.Element;

import it.unisa.cc.data.gestioneSistema.AnnoAccademico;
import it.unisa.cc.data.gestioneSistema.DBAnnoAccademico;
import it.unisa.cc.data.gestioneSistema.Professore;
import it.unisa.cc.data.gestioneSistema.DBProfessore;
import it.unisa.cc.data.gestioneSistema.Insegnamento;
import it.unisa.cc.data.gestioneSistema.DBInsegnamento;

public class XMLConverter {

	/**
	 * Converte una lista di anni accademici in un documento xml
	 * Formato XML:
	 * 
	 * <response>
	 * <anniaccademici>
	 * <anno />
	 * <descrizione />
	 * </anniaccademici>
	 * </response>
	 * 
	 * @param listaAreeScientifiche lista delle aree scientifiche da inserire nel documento
	 * @return Il documento XML risultante
	 */
	public static Document caricaListaAnniAccademici(ArrayList<AnnoAccademico> listaAnniAccademici) {
		Element xml_root = new Element("response");
		Element xml_annoaccademico;
		Element xml_anno;
		Element xml_descrizione;

		for (AnnoAccademico a : listaAnniAccademici) {
			xml_annoaccademico = new Element("anniaccademici");

			xml_anno = new Element("anno");
			xml_anno.setText(a.getAnno());

			xml_descrizione = new Element("descrizione");
			xml_descrizione.setText(a.getDescizione());

			xml_annoaccademico.addContent(xml_anno);
			xml_annoaccademico.addContent(xml_descrizione);

			xml_root.addContent(xml_annoaccademico);
		}

		Document doc = new Document(xml_root);
		return doc;
	}
	/**
	 * Converte una lista di Professori in un documento xml
	 * Formato XML:
	 * 
	 * <response>
	 * <Professore>
	 * <nome />
	 * <cognome />
	 * </Professore>
	 * </response>
	 * 
	 * @param listaAreeScientifiche lista delle aree scientifiche da inserire nel documento
	 * @return Il documento XML risultante
	 */
	public static Document caricaListaProfessori(ArrayList<Professore> listaProfessori){
		Element xml_root = new Element("response");
		Element xml_professore;
		Element xml_nome;
		Element xml_cognome;
		
		for(Professore p: listaProfessori){
			xml_professore=new Element("professore");
			
			xml_nome = new Element("nome");
			xml_nome.setText(p.getNome());
			
			xml_cognome=new Element("cognome");
			xml_cognome.setText(p.getCognome());
			
			xml_professore.addContent(xml_nome);
			xml_professore.addContent(xml_cognome);
			
			xml_root.addContent(xml_professore);
			
			
		}
		Document doc = new Document(xml_root);
		return doc;
	}
	/**
	 * Converte una lista di Insegnamenti in un documento xml
	 * Formato XML:
	 * 
	 * <response>
	 * <insegnamento>
	 * <nome />
	 * </insegnamento>
	 * </response>
	 * 
	 * @return Il documento XML risultante
	 */
	public static Document caricaListaInsegnamenti(ArrayList<Insegnamento> listaInsegnamenti){
		Element xml_root = new Element("response");
		Element xml_insegnamento;
		Element xml_nome;
		
		for(Insegnamento i: listaInsegnamenti){
			xml_insegnamento=new Element("insegnamento");
			
			xml_nome = new Element("nome");
			xml_nome.setText(i.getNome());
			
			xml_insegnamento.addContent(xml_nome);
			
			xml_root.addContent(xml_insegnamento);
			
			
		}
		Document doc = new Document(xml_root);
		return doc;
	}
	

	/** Converte il dettaglio di un anno accademico in documento xml
	 * @param annoAccademicol'anno accademico che è stato selezionato
	 * @return Il documento XML risultante
	 * 
	 * <response>
	 * <info_triennale>
	 * <info_ordinamento>
	 * <stato_inserimento/>
	 * <button_visualizza_hidden/>
	 * <button_inserisci_hidden/>
	 * </info_ordinamento>
	 * <info_regolamenti>
	 * <num_curr/>
	 * </info_regolamenti>
	 * </info_triennale>
	 * 
	 * <info_magistrale>
	 * <info_ordinamento>
	 * </info_ordinamento>
	 * </info_magistrale>
	 * 
	 * <info_programmazione_didattica>
	 * <stato_inserimento/>
	 * <button_visualizza_hidden/>
	 * <button_inserisci_hidden/>
	 * </info_programmazione_didattica>
	 * </response>
	 * 
	 */
	@SuppressWarnings("null")
	public static Document caricaDettaglioAnnoAccademico(AnnoAccademico annoAccademico){
		Element xml_root = new Element("response");
		Element xml_info_annoaccademico;
		Element xml_info_trieannale;
		Element xml_info_ordinamento;
		Element xml_stato_inserimento;
		Element xml_info_regolamenti;
		Element xml_num_curriculum;
		Element xml_info_magistrale;
		Element xml_info_programmazione_didattica;
		Element xml_anno;
		Element xml_descrizione;
		Element xml_buttonVisualizza;
		Element xml_buttonInserisci;
		
		DBAnnoAccademico dettaglioAnnoAccademico = new DBAnnoAccademico();
		
		xml_info_annoaccademico = new Element("info_anno_accademico");
			xml_anno = new Element("anno");
			xml_anno.setText(annoAccademico.getAnno());
			xml_info_annoaccademico.addContent(xml_anno);
			xml_descrizione = new Element("descrizione");
			xml_descrizione.setText(annoAccademico.getDescizione());
			xml_info_annoaccademico.addContent(xml_descrizione);
		xml_root.addContent(xml_info_annoaccademico);
		
		xml_info_trieannale = new Element("info_triennale");
			xml_info_ordinamento = new Element("info_ordinamento");
			xml_stato_inserimento = new Element("stato_inserimento");
			xml_stato_inserimento.setText("true");
			xml_buttonVisualizza = new Element("button_visualizza_hidden");
			xml_buttonVisualizza.setText("false");
			xml_buttonInserisci = new Element("button_inserisci_hidden");
			xml_buttonInserisci.setText("false");
			xml_info_ordinamento.addContent(xml_stato_inserimento);
			xml_info_ordinamento.addContent(xml_buttonVisualizza);
			xml_info_ordinamento.addContent(xml_buttonInserisci);
			
			
			xml_info_trieannale.addContent(xml_info_ordinamento);
			
			xml_info_regolamenti = new Element("info_regolamenti");
				xml_num_curriculum = new Element("numero_curriculum");
				xml_num_curriculum.setText(Integer.toString(dettaglioAnnoAccademico.getNumeroRegolamentiCurriculumTriennale()));
				xml_info_regolamenti.addContent(xml_num_curriculum);
			xml_info_trieannale.addContent(xml_info_regolamenti);
		xml_root.addContent(xml_info_trieannale);
			
		
		
		xml_info_magistrale = new Element("info_magistrale");
			xml_info_ordinamento = new Element("info_ordinamento");
			xml_stato_inserimento = new Element("stato_inserimento");
			xml_stato_inserimento.setText("true");
			xml_buttonVisualizza = new Element("button_visualizza_hidden");
			xml_buttonVisualizza.setText("false");
			xml_buttonInserisci = new Element("button_inserisci_hidden");
			xml_buttonInserisci.setText("false");
			xml_info_ordinamento.addContent(xml_stato_inserimento);
			xml_info_ordinamento.addContent(xml_buttonVisualizza);
			xml_info_ordinamento.addContent(xml_buttonInserisci);
			
			
			xml_info_magistrale.addContent(xml_info_ordinamento);
			
			xml_info_regolamenti = new Element("info_regolamenti");
				xml_num_curriculum = new Element("numero_curriculum");
				xml_num_curriculum.setText(Integer.toString(dettaglioAnnoAccademico.getNumeroRegolamentiCurriculumMagistrale()));
				xml_info_regolamenti.addContent(xml_num_curriculum);
			xml_info_magistrale.addContent(xml_info_regolamenti);
		xml_root.addContent(xml_info_magistrale);
		
		
		
		
		xml_info_programmazione_didattica = new Element("info_programmazione_didattica");
			xml_stato_inserimento = new Element("stato_inserimento");
			xml_stato_inserimento.setText("true");
			xml_info_programmazione_didattica.addContent(xml_stato_inserimento);
		xml_root.addContent(xml_info_programmazione_didattica);
		
	
		
		Document doc = new Document(xml_root);
		return doc;
	}
	
	/** Converte il dettaglio di un professore in documento xml
	 * @param professore con professore selezionato che è stato selezionato
	 * @return Il documento XML risultante
	 */
	
	public static Document caricaDettaglioProfessore(Professore professore){
		Element xml_root = new Element("response");
		Element xml_dettaglioProfessore;
		Element xml_professore;
		Element xml_nome;
		Element xml_cognome;
		Element xml_matricola;
		Element xml_ssd;
		Element xml_ruolo;
		Element xml_telefono;
		Element xml_stato;
		Element xml_email;
		
		DBProfessore dettaglioProfessore=null;
		
		xml_dettaglioProfessore= new Element("dettaglio_professore");
		
		xml_nome = new Element("nome");
		xml_cognome=new Element("cognome");
		xml_matricola=new Element("matricola");
		xml_ssd=new Element("ssd");
		xml_ruolo=new Element("ruolo");
		xml_telefono=new Element("telefono");
		xml_stato=new Element("stato");
		xml_email= new Element("email");
		
		xml_dettaglioProfessore.addContent(xml_nome);
		xml_nome.setText(professore.getNome());
		xml_dettaglioProfessore.addContent(xml_cognome);
		xml_cognome.setText(professore.getCognome());
		xml_dettaglioProfessore.addContent(xml_matricola);
		xml_matricola.setText(professore.getMatricola());
		xml_dettaglioProfessore.addContent(xml_ssd);
		xml_ssd.setText(professore.getSSD());
		xml_dettaglioProfessore.addContent(xml_ruolo);
		xml_ruolo.setText(professore.getRuolo());
		xml_dettaglioProfessore.addContent(xml_telefono);
		xml_telefono.setText(professore.getTelefono());
		xml_dettaglioProfessore.addContent(xml_stato);
		xml_stato.setText(professore.getStato());
		xml_dettaglioProfessore.addContent(xml_email);
		xml_email.setText(professore.getStato());
		
		
		xml_root.addContent(xml_dettaglioProfessore);
		
		
		Document doc = new Document(xml_root);
		return doc;
	}
	
	/** Converte il dettaglio di un insegnamento in un documento xml
	 * @param insegnamento Rappresenta l'insegnamento selezionato
	 * @return Il documento XML risultante
	 * 
	 * 
	 * <response>
	 * <dettaglio_insegnamento>
	 * <nome/>
	 * <ssd />
	 * <tipologia />
	 * </dettaglio_insegnamento>
	 * </response>
	 */
	
	/*
	 *  NOTA: BISNOGNA ANCORA IMPLEMENTARE LA VISUALIZZAZIONE DEL CORSO
	 *  L'implementazione sarebbe molto semplice se nella tabella "Insegnamento"
	 *  vi fosse un campo "Corso".
	 */
	
	public static Document caricaDettaglioInsegnamento(Insegnamento insegnamento){
		Element xml_root = new Element("response");
		Element xml_dettaglioInsegnamento;
		Element xml_nome;
		Element xml_ssd;
		Element xml_tipologia;
		//Element xml_corso;
		
		xml_dettaglioInsegnamento= new Element("dettaglio_insegnamento");
		
		xml_nome=new Element("nome");
		xml_ssd=new Element("ssd");
		xml_tipologia=new Element("tipologia");
		//xml_corso=new Element("corso");
		
		
		xml_dettaglioInsegnamento.addContent(xml_nome);
		xml_nome.setText(insegnamento.getNome());
		xml_dettaglioInsegnamento.addContent(xml_ssd);
		xml_ssd.setText(insegnamento.getSsd());
		xml_dettaglioInsegnamento.addContent(xml_tipologia);
		xml_tipologia.setText(insegnamento.getTipologiaAttivita());
		//xml_dettaglioInsegnamento.addContent(xml_corso);
		//xml_ssd.setText(insegnamento.getCorso());
		
		xml_root.addContent(xml_dettaglioInsegnamento);
		
		
		Document doc = new Document(xml_root);
		return doc;
	}
}


