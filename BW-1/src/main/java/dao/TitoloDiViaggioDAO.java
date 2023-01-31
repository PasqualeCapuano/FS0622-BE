package dao;

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
	
}