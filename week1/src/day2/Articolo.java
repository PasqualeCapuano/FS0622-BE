package day2;

public class Articolo {
	
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int numeroPrezziDisponibili;
	
	public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPrezziDisponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.numeroPrezziDisponibili = numeroPrezziDisponibili;
	}
	
	public int getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(int codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}

	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumeroPrezziDisponibili() {
		return numeroPrezziDisponibili;
	}

	public void setNumeroPrezziDisponibili(int numeroPrezziDisponibili) {
		this.numeroPrezziDisponibili = numeroPrezziDisponibili;
	}

	public void stampaArticolo() {
		System.out.println("Codice articolo: " + this.codiceArticolo);
		System.out.println("Descrizione articolo: " + this.descrizioneArticolo);
		System.out.println("Prezzo: " + this.prezzo + "€");
		System.out.println("Numero pezzi disponibili: " + this.numeroPrezziDisponibili);
	}
	
}
