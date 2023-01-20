package day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EsercizioPomeriggio {

public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto(1, "Il gioco dell'assassino", "Books", 12.00);
		Prodotto p2 = new Prodotto(2, "Stephen King", "Books", 150.00);
		Prodotto p3 = new Prodotto(3, "Il nome della rosa", "Books", 22.00);
		Prodotto p4 = new Prodotto(4, "Il rinoceronte furioso", "Baby", 25.00);
		Prodotto p5 = new Prodotto(5, "Il piccolo principe", "Baby", 18.99);
		Prodotto p6 = new Prodotto(6, "Non smettere mai di sognare", "Baby", 29.50);
		Prodotto p7 = new Prodotto(7, "Il signore degli anelli", "Boys", 15.50);
		Prodotto p8 = new Prodotto(8, "Fight club", "Boys", 10.90);
		Prodotto p9 = new Prodotto(9, "Il lupo della steppa", "Boys", 39.99);
		
		ArrayList<Prodotto> prodotti = new ArrayList<>() {{
			add( p1 );
			add( p2 );
			add( p3 );
			add( p4 );
			add( p5 );
			add( p6 );
			add( p7 );
			add( p8 );
			add( p9 );
		}};
		
		Stream<Prodotto> bookStream = prodotti.stream()
				.filter( (prodotto) -> prodotto.getCategoria() == "Books" && prodotto.getPrezzo() > 100 );

		System.out.println( "---------------------------------------" );
		System.out.println( "Il libro che ha un prezzo superiore a 100€" );
		bookStream.forEach(prodotto -> {
			System.out.println( prodotto );
		});
		
		ArrayList<Prodotto> ordine1 = new ArrayList<Prodotto>(Arrays.asList(p1, p3, p4));
		
		ArrayList<Prodotto> ordine2 = new ArrayList<Prodotto>(Arrays.asList(p2, p8, p9));
		
		ArrayList<Prodotto> ordine3 = new ArrayList<Prodotto>(Arrays.asList(p9, p6, p5));
		
		ArrayList<Prodotto> ordine4 = new ArrayList<Prodotto>(Arrays.asList(p2, p8, p4));
		
		Cliente c1 = new Cliente(1, "Mario Rossi", 1);
		Cliente c2 = new Cliente(2, "Anna Bianchi", 2);
		Cliente c3 = new Cliente(3, "Gino Blue", 1);
		Cliente c4 = new Cliente(4, "Marco Neri", 2);
		Cliente c5 = new Cliente(4, "Nicola Verdi", 2);
		
		Ordine o1 = new Ordine(1, "In cosenga", LocalDate.now(), LocalDate.of(2023, 01, 23), ordine1, c1);
		Ordine o2 = new Ordine(2, "In cosenga", LocalDate.of(2021, 03, 01), LocalDate.of(2023, 01, 21), ordine2, c2);
		Ordine o3 = new Ordine(3, "In cosenga", LocalDate.now(), LocalDate.of(2023, 01, 22), ordine3, c3);
		Ordine o4 = new Ordine(3, "In cosenga", LocalDate.of(2021, 02, 12), LocalDate.of(2023, 01, 18), ordine3, c4);
		Ordine o5 = new Ordine(3, "In cosenga", LocalDate.of(2021, 01, 12), LocalDate.of(2023, 10, 03), ordine3, c5);
		
		//---------------------------------------------------------------------------------
		
		ArrayList<Ordine> listaOrdini = new ArrayList<Ordine>(Arrays.asList(o1, o2, o3, o4, o5));
		
		ArrayList<Ordine> listaFiltrata = new ArrayList<>();
        listaOrdini.stream()
                    .filter((ordine) -> ordine.getProdotti().stream()
                                    .filter((categoriaProdotto) -> categoriaProdotto.getCategoria() == "Baby")  
                                    .count() > 0)
                    .forEach((ordine) -> listaFiltrata.add(ordine));

		System.out.println( "---------------------------------------" );
		System.out.println( "Ordini con libri di catergoria BABY:" );
        listaFiltrata.forEach(ordine -> {
            System.out.println(ordine);
          });
        
        // -------------------------------------------------------------------------------------------

        System.out.println( "---------------------------------------" );
		System.out.println( "Ordini con libri di catergoria BOYS con il 10% di sconto:" );
        prodotti.stream()
        	.filter((prodotto) -> prodotto.getCategoria() == "Boys")
        	.peek(prezzo -> prezzo.setPrezzo(prezzo.getPrezzo() - (prezzo.getPrezzo() * 10) / 100))
        	.forEach((prodotto) -> System.out.println(prodotto));
        
        //----------------------------------------------------------------------
        
        System.out.println( "---------------------------------------" );
		System.out.println( "Ordini di clienti con livello 2, ordinati tra il 01-Feb-2021 e l'01-Apr-2021:" );
        listaOrdini.stream()
        	.filter( (o) -> o.getDataOrdine().isAfter(LocalDate.of(2021, 02, 01))
        	&& o.getDataOrdine().isBefore(LocalDate.of(2021, 04, 01))
        	&& o.getCliente().getLivello() == 2)
        	.forEach((o) -> System.out.println(o));
      
	}

}

class Prodotto {
	
	long id;
	String nome;
	String categoria;
	double prezzo;
	
	public Prodotto(long id, String nome, String categoria, double prezzo) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public Object setPrezzo(double prezzo) {
		return this.prezzo = prezzo;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	@Override
	public String toString() {
		return "- Nome libro: " + this.nome + ", Categoria: " + this.categoria + ", Prezzo: €" + this.prezzo;
	}
	
}

class Ordine {
	
	long id;
	String stato;
	LocalDate dataOrdine;
	LocalDate dataConsegna;
	List<Prodotto> prodotti;
	Cliente cliente;
	
	public Ordine(long id, String stato, LocalDate dataOrdine, LocalDate dataConsegna, List<Prodotto> prodotti,
			Cliente cliente) {
		this.id = id;
		this.stato = stato;
		this.dataOrdine = dataOrdine;
		this.dataConsegna = dataConsegna;
		this.prodotti = prodotti;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public LocalDate getDataOrdine() {
		return this.dataOrdine;
	}

	@Override
	public String toString() {
		return "- Stato dell'ordine: " + this.stato + ", Data di acquisto: " + this.dataOrdine + ", Data di cosegna: " + this.dataConsegna + ", Cliente: " + this.cliente + ", Prodotti: " + this.prodotti;
	}
	
	public List<Prodotto> getProdotti() {
		return this.prodotti;
	}
}

class Cliente {
	
	long id;
	String nome;
	int livello;
	
	public Cliente(long id, String nome, int livello) {
		this.id = id;
		this.nome = nome;
		this.livello = livello;
	}
	
	public int getLivello() {
		return this.livello;
	}
	
	@Override
	public String toString() {
		return this.nome + ", Livello: " + this.livello;
	}
	
}