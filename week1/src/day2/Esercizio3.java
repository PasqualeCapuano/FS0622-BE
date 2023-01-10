package day2;

public class Esercizio3 {

	public static void main(String[] args) {

		Articolo a1 = new Articolo(1, "Maglietta bianca con stampa di un logo", 15, 5);
		a1.stampaArticolo();
		
		System.out.println("-------------------------------");
		
		Articolo a2 = new Articolo(2, "Pantalone verde", 20, 3);
		a2.stampaArticolo();
		
		System.out.println("-------------------------------");
		
		Cliente c1 = new Cliente(1, "Mario Rossi", "mario.rossi@gmail.com", "12/03/2018");
		c1.stampaCliente();
		
		System.out.println("-------------------------------");
		
		Cliente c2 = new Cliente(2, "Luca Verdi", "luca.verdi@gmail.com", "1/09/2020");
		c2.stampaCliente();
		
		System.out.println("-------------------------------");
		
		Carrello cart = new Carrello("Flavio", 0);
		
		Lista lista1 = new Lista("Maglietta", 20.50);
		cart.getElencoArticoli()[0] = lista1;
		
		lista1 = new Lista("Pantalone", 30.24);
		cart.getElencoArticoli()[1] = lista1;
		
		lista1 = new Lista("Mutande", 10.60);
		cart.getElencoArticoli()[2] = lista1;
		
		
		cart.stampaCarrello();
		
		System.out.println("-------------------------------");
		
		cart.totaleCarrello();
	}

}
