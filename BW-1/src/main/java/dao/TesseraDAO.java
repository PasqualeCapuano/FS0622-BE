package dao;

import entities.Tessera;
import utils.JpaUtils;

public class TesseraDAO extends JpaUtils {

	public void save(Tessera tes) {
		
		try {
			
			t.begin();
			em.persist(tes);
			t.commit();
			
			System.out.println( "Tessera inserita correttamente" );
		} catch(Exception e) {
			System.out.println( "ERRORE durante l'inserimento della tessera!!" );
		}
		
	}
	
}