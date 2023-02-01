package dao;

import entities.Utente;
import entities.abstracts.Ticketing;
import utils.JpaUtils;

public class TicketingDAO extends JpaUtils {

	public void save(Ticketing tick) {
		
		try {
			
			t.begin();
			em.persist(tick);
			t.commit();
			
			System.out.println( "Elemento inserito correttamente" );
		} catch(Exception e) {
			System.out.println( "ERRORE durante l'inserimento dell'elemento!!" );
		}
		
	}
	
	public static void getTicketingById(int id) {
		Ticketing ti = em.find(Ticketing.class, id);
		
		int counter = ti.getCounterBiglietti() - 1;
		int counter2 = ti.getBigliettiEmessi() + 1;
		
		try {
			ti.setCounterBiglietti(counter);
			ti.setBigliettiEmessi(counter2);
			
			t.begin();
			em.persist(ti);
			t.commit();
			
			
		} catch(Exception e1) {
			System.out.println("Errore!");
		}
	}
	
	public static int getTicketNumber(int id) {
		Ticketing ti = em.find(Ticketing.class, id);
		
		return ti.getCounterBiglietti();
	}
	
}