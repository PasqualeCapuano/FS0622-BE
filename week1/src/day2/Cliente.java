package day2;

public class Cliente {
	int codiceCliente;
	String nomeECognome;
	String email;
	String dataIscrizione;
	
	public Cliente(int codiceCliente, String nomeECognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeECognome = nomeECognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	
	
	public int getCodiceCliente() {
		return codiceCliente;
	}



	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	}



	public String getNomeECognome() {
		return nomeECognome;
	}



	public void setNomeECognome(String nomeECognome) {
		this.nomeECognome = nomeECognome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDataIscrizione() {
		return dataIscrizione;
	}



	public void setDataIscrizione(String dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}



	public void stampaCliente() {
		System.out.println( "Codice cliente: " + this.codiceCliente );
		System.out.println( "Nome e cognome: " + this.nomeECognome );
		System.out.println( "Email: " + this.email);
		System.out.println( "Data d'iscrizione: " + this.dataIscrizione );
	}
}
