package day1;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Cliente extends DBEs1 {

	String nome;
	String cognome;
	
	String regione_residenza;
	int dob;
	
	public Cliente( String nome, String cognome, String regione_residenza, int dob) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dob = dob;
		this.regione_residenza = regione_residenza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getRegione_residenza() {
		return regione_residenza;
	}

	public void setRegione_residenza(String regione_residenza) {
		this.regione_residenza = regione_residenza;
	}
	
	public void insertCustomer() {
 		try {
 			String sql = "INSERT INTO clienti (nome, cognome, regione_residenza, dob) VALUES (?, ?, ?, ?)";
 			PreparedStatement stmt = conn.prepareStatement(sql);
 			stmt.setString(1, nome);
 			stmt.setString(2, cognome);
 			stmt.setString(3, regione_residenza);
 			stmt.setInt(4, dob); 			
 			stmt.execute();
 			System.out.println("------------------------------------");
 			System.out.println("Insert successfull");
 			System.out.println("------------------------------------");

 		} catch(SQLException e) {
 			System.out.println("------------------------------------");
 			System.out.println("There was an error");
 			System.out.println("------------------------------------");
 			e.printStackTrace();
 		}
 	}
}
