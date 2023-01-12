package day4;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente d1 = new Dipendente(1, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente(2, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente d3 = new Dipendente(3, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente d4 = new Dipendente(4, Livello.DIRIGENTE, Dipartimento.VENDITE);

		d1.stampaDipendente();
		d2.stampaDipendente();
		d3.stampaDipendente();
		d4.stampaDipendente();
		d1.promuovi();
		d3.promuovi();
		d1.stampaDipendente();
		d3.stampaDipendente();
		
		
		
		
		System.out.println("calcolo stipendi totale da pagare: ");
		System.out.printf("€%.2f" , (d1.getStipendio() + d2.getStipendio() +d3.getStipendio() + d4.getStipendio()));
	}
	
}
