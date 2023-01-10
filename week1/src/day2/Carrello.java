package day2;

public class Carrello {
	
	String clienteAssociato;
	private Lista[] elencoArticoli;
	
	
	public Carrello(String clienteAssociato, int elencoArticoli) {
		
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = new Lista[10];
	}


	public String getClienteAssociato() {
		return clienteAssociato;
	}


	public void setClienteAssociato(String clienteAssociato) {
		this.clienteAssociato = clienteAssociato;
	}


	public Lista[] getElencoArticoli() {
		return elencoArticoli;
	}


	public void setElencoArticoli(Lista[] elencoArticoli) {
		this.elencoArticoli = elencoArticoli;
	}

	
	public void stampaCarrello() {
		
		System.out.println("Carrello di: " + this.clienteAssociato);
		for(int i=0; i < elencoArticoli.length; i++) {
			System.out.println("- " +elencoArticoli[i].getNomeProdotto() + " " + elencoArticoli[i].getPrezzoProdotto() + " €");
		}
	}
	
	public void totaleCarrello() {
		System.out.println(elencoArticoli[0].getPrezzoProdotto() + elencoArticoli[1].getPrezzoProdotto() + " €");
	}
}
