package week1.day2;

public class Product {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object p) {
		Product _p = (Product)p;
		
		return this.price == _p.price;
	}
	
}


//creare una classe Product che ha come proprietà prezzo e nome. 
//Implementare una logica di comparazione tra due prodotti del tipo: due prodotti sono uguali se hanno lo stesso prezzo