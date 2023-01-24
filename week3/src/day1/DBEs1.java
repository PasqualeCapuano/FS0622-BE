package day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import org.postgresql.util.PSQLException;

public class DBEs1 {
	private final String url = "jdbc:postgresql://localhost:5432/negozio?useSSL=false";
	private final String username = "postgres";
	private final String password = "postgres";

	static Connection conn = null;
 
 	public void connect(){
 		try {
 	          System.out.println("Connecting to database: " + url);
 	          conn = DriverManager.getConnection(url, username, password);
 	          System.out.println("Connection is successful!");
 	        }
 	        catch(Exception e) {
 	            e.printStackTrace();
 	        }
 }
 	
 	public void disconnect(){
 		if( conn != null ) {
 	          try {
 	              conn.close();
 	              System.out.println("Disonnection is successful!");
 	          } catch (SQLException e) {
 	              e.printStackTrace();
 	          }

 	        }
 }
 	
 	
}

//SELECT nome, cognome FROM clienti WHERE dob = 1982

//SELECT COUNT (*) AS numero_fatture FROM fatture WHERE iva = 20

/*SELECT EXTRACT(year FROM data_fattura) AS ANNO, 
COUNT (*) AS numero_fatture, SUM (importo) AS totale
FROM fatture 
GROUP BY EXTRACT (year FROM data_fattura)*/

//INSERT INTO fatture (numero_fattura, tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES (4, 'b', 345, 21, 4, '2020-02-04', 5)
