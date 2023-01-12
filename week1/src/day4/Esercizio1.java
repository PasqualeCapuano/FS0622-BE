package day4;

public class Esercizio1 {

	public static void main(String[] args) {

		Dipendente d1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente(2, Dipartimento.AMMINISTRAZIONE);
		
		d1.stampaDipendente();
		d2.stampaDipendente();
		
		d1.promuovi();
		d1.stampaDipendente();
		
		d1.calcolaPaga();
		d2.calcolaPaga();
		
		d1.calcolaPaga(5);
		
		d1.stampaDipendente();
	}


}
