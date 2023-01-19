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
		
		Prodotto p1 = new Prodotto(1, "Libro 1", "Libri", 12.00);
		Prodotto p2 = new Prodotto(2, "Libro 2", "Libri", 15.00);
		Prodotto p3 = new Prodotto(3, "Libro 3", "Libri", 125.00);
		
		Prodotto p4 = new Prodotto(4, "Gioco 1", "Baby", 122.00);
		Prodotto p5 = new Prodotto(5, "Gioco 2", "Baby", 150.00);
		Prodotto p6 = new Prodotto(6, "Gioco 3", "Baby", 145.00);
		
		Prodotto p7 = new Prodotto(7, "Porno 1", "Boys", 222.00);
		Prodotto p8 = new Prodotto(8, "Porno 2", "Boys", 7.00);
		Prodotto p9 = new Prodotto(9, "Porno 3", "Boys", 47.00);

		
		ArrayList<Prodotto> prodotti = new ArrayList<>() {{
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			add(p5);
			add(p6);
			add(p7);
			add(p8);
			add(p9);
		}};

		Stream<Prodotto> bookStream = prodotti.stream()
				.filter((prodotto) -> prodotto.getCategoria() == "Libri" && prodotto.getPrezzo() > 100);
		
		bookStream.forEach(prodotto -> {
			System.out.println(prodotto);
		});
		
		ArrayList<Prodotto> ordine1 = new ArrayList<Prodotto>(Arrays.asList(p1, p3, p4));
        
        ArrayList<Prodotto> ordine2 = new ArrayList<Prodotto>(Arrays.asList(p2, p7, p8));
        
        ArrayList<Prodotto> ordine3 = new ArrayList<Prodotto>(Arrays.asList(p4, p7, p2));
		
		Cliente c1 = new Cliente(1, "Pasquale", 1);
		Cliente c2 = new Cliente(2, "Flavio", 2);
		Cliente c3 = new Cliente(3, "Luca", 2);
		
		Ordine o1 = new Ordine(1, "in consegna", LocalDate.now() , LocalDate.of(2023, 01, 23), ordine1, c1);
		Ordine o2 = new Ordine(2, "in consegna", LocalDate.now() , LocalDate.of(2023, 01, 25), ordine2, c2);
		Ordine o3 = new Ordine(3, "in consegna", LocalDate.now() , LocalDate.of(2023, 01, 28), ordine3, c3);
		
		ArrayList<Ordine> listaOrdini = new ArrayList<Ordine>(Arrays.asList(o1, o2, o3));
        System.out.println("------------------------------------------");

		
		ArrayList<Ordine> listaBaby = new ArrayList<>();
        listaOrdini.stream()
                    .filter((ordine) -> ordine.getProdotti().stream()
                                    .filter((categoriaProdotto) -> categoriaProdotto.getCategoria() == "Baby")
                                    .count() > 0)
                    .forEach((ordine) -> listaBaby.add(ordine));
        
        System.out.println("Lista degli ordini con la categoria BABY");
        System.out.println("------------------------------------------");

        listaBaby.forEach(ordine -> {
              System.out.println(ordine);
            });
        
        System.out.println("------------------------------------------");
          ArrayList<Ordine> listaBoys = new ArrayList<>();
          listaOrdini.stream()
                      .filter((ordine) -> ordine.getProdotti().stream()
                                      .filter((categoriaProdotto) -> categoriaProdotto.getCategoria() == "Boys")
                                      .count() > 0)
                      .forEach((ordine) -> listaBoys.add(ordine));
          
          System.out.println("------------------------------------------");

          listaBoys.forEach(ordine -> {
                System.out.println(ordine);
              });
		
	}
	
		


}

class Prodotto{
	
	long id;
	String nome;
	String categoria;
	double prezzo;
	
	public Prodotto(long id, String nome, String categoria, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public double getPrezzo() {
		return this.prezzo;
	}

	public String getCategoria() {
		return this.categoria;
	}
	
	@Override 
	public String toString() {
		return "Nome libro: " + this.nome + " | " + "Prezzo: €" + this.prezzo;
	}
	
}

class Ordine{
	
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
	
	public List<Prodotto> getProdotti() {
		return this.prodotti;
	}

	@Override
	public String toString() {
		return "ID - " + this.id + " stato ordine: " + this.stato + " data ordine: " + this.dataOrdine + " data consegna: " + this.dataConsegna + " prodotti: " + this.prodotti + " Cliente: " + this.cliente;
	}
	
}

class Cliente{
	
	long id;
	String nome;
	int livello;
	
	public Cliente(long id, String nome, int livello) {
		
		this.id = id;
		this.nome = nome;
		this.livello = livello;
	}
	
	@Override
	public String toString() {
		return this.nome + " Livello" + this.livello;
	}
	
	
}