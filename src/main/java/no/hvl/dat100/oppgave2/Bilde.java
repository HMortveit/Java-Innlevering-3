package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		 super(id, bruker, dato, tekst);
	        this.url = url;
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
        this.url = url;
	}
	
	public String getUrl() {
		return url; 

	}

	public void setUrl(String nyUrl) {
		this.url = nyUrl;
	}

	@Override
	public String toString() {
		return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
