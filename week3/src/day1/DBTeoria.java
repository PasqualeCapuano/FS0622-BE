package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTeoria {
	private final String url = "jdbc:postgresql://localhost:5432/postgres?useSSL=false";
	private final String username = "postgres";
	private final String password = "postgres";
	//connection
	Connection conn = null;
 
 	public void connect(){
 		try {
 	          System.out.println("Connecting to database " + url);
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
 	
 	public void insertStudent(String fullname, int address_id) {
 		try {
 			String sql = "INSERT INTO students (fullname, address_id) VALUES (?,?)";
 			PreparedStatement stmt = conn.prepareStatement(sql);
 			stmt.setString(1, "Daisy Princes");
 			stmt.setInt(2, 1);
 			stmt.execute();
 			System.out.println("Insert successfull");
 		} catch(SQLException e) {
 			System.out.println("There was an error");
 			e.printStackTrace();
 		}
 	}
 	
 	public void updateStudent(String fullname, int id) {
 		try {
 			String sql = "UPDATE students SET fullname = ? WHERE id = ?";
 			PreparedStatement stmt = conn.prepareStatement(sql);
 			stmt.setString(1, fullname);
 			stmt.setInt(2, id);
 			stmt.execute();
 			
 			System.out.println("Insert successfull");

 		} catch(SQLException e) {
 			System.out.println("There was an error");

 			e.printStackTrace();
 		}
 	}
}
