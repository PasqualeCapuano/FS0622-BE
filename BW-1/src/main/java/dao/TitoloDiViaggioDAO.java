package dao;

import entities.Tessera;
import entities.abstracts.TitoloDiViaggio;
import utils.JpaUtils;

public class TitoloDiViaggioDAO extends JpaUtils {

	public void save(TitoloDiViaggio tit) {
		
		try {
			
			t.begin();
			em.persist(tit);
			t.commit();
			
			System.out.println( "Ticket inserito correttamente" );
		} catch(Exception e) {
			System.out.println( "ERRORE durante l'inserimento del ticket!!" + e );
		}
		
	}
	
	public static void checkTessera(long id) {
		Tessera t = em.find(Tessera.class, id);
		
		if( t == null ) {
			System.out.println( "La tessera numero " + id + " non è stata trovata!" );
			System.exit(0);
		}
		
		boolean validita = t.isValidita();
		
		if(validita == false) {
			System.out.println("ERROR! La tessera è scaduta, impossibile creare l'abbonamento!");
			System.exit(0);
		} 
	}
	
}