package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggTabell;
	private int nesteLedige;

	

	public Blogg() {
		this.innleggTabell = new Innlegg[20];
		this.nesteLedige = 0;
	}

	public Blogg(int lengde) {
		this.innleggTabell = new Innlegg[lengde];
		this.nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false; 
		int pos = 0;
		while (pos<nesteLedige && !funnet) {
			if (innleggTabell[pos].erLik(innlegg)) {
				funnet = true;
			}else {
				pos++;
		}
		}
			if (funnet) {
				return pos;
			}else {
				return -1;
			}
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteLedige < innleggTabell.length;
		}
		
	public boolean leggTil(Innlegg innlegg) {
		 if (!finnes(innlegg) && ledigPlass()) {
	            innleggTabell[nesteLedige] = innlegg;
	            nesteLedige++;
	            return true;
	        }
	        return false;
	}
	
	public String toString() {
		 StringBuilder sb = new StringBuilder();
	        sb.append(nesteLedige).append("\n"); // Første linje viser antall innlegg

	        for (int i = 0; i < nesteLedige; i++) {
	            sb.append(innleggTabell[i].toString());
	        }
	        return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}