package dao;

import entities.Distributore;
import entities.Utente;
import entities.abstracts.Ticketing;
import utils.JpaUtils;

public class TicketingDAO extends JpaUtils {
	
	//metodo per salvare i dati nel DB
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
	
	//metodo per settare il numero dei biglietti emessi	
	public static void countBiglietti(int id) {
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
	
	//metodo per settare il numero degli abbonamenti emessi
	public static void countAbbonamenti(int id) {
		Ticketing ti = em.find(Ticketing.class, id);
		
		int counter = ti.getAbbonamentiEmessi() + 1;
		
		try {
			ti.setAbbonamentiEmessi(counter);
			
			t.begin();
			em.persist(ti);
			t.commit();
			
			
		} catch(Exception e1) {
			System.out.println("Errore!");
		}
	}
	
	
	//metodo che ritorna il numero di biglietti emessi
	public static int getTicketNumber(int id) {
		Ticketing ti = em.find(Ticketing.class, id);
		
		return ti.getCounterBiglietti();
	}
	
	//ritorna quanti biglietti e abbonamenti sono stati emessi in una determinata stazione	
	public static void getTitoliEmessi(int id) {
		Ticketing ti = em.find(Ticketing.class, id);
		
		int bigliettiEmessi = ti.getBigliettiEmessi();
		int abbonamentiEmessi = ti.getAbbonamentiEmessi();
		String stazione = ti.getLuogo();
		
		System.out.println("Sono stati emessi " + bigliettiEmessi + " biglietti e " + abbonamentiEmessi +  " abbonamenti nella " + stazione);
	}
	
	//controlla lo stato del distributore (in servizio o fuori servizio)
	public static void checkDistributore(int id) {
		Distributore d = em.find(Distributore.class, id);
		int counter = d.getCounterBiglietti();
		boolean inServizio = d.isInServizio();
		if(counter == 0) {
			d.setInServizio(false);
			t.begin();
			em.persist(d);
			t.commit();
			System.out.println("Il distributore di " + d.getLuogo() + " è fuori servizio.");
			System.exit(0);
		} else {
			if(inServizio == false) {
				d.setInServizio(true);
				t.begin();
				em.persist(d);
				t.commit();
			}
			System.out.println("Hai scelto Stazione Tiburtina");
			System.out.println("Benvenuto nel distributore");
		}
	} 
	
}