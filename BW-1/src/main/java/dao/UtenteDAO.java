package dao;

import entities.Abbonamento;
import entities.Utente;
import utils.JpaUtils;

public class UtenteDAO extends JpaUtils {
	
	//metodo per salvare i dati nel DB
	public void save(Utente u) {
		
		try {
			
			t.begin();
			em.persist(u);
			t.commit();
			
			System.out.println( "Utente inserito correttamente" );
		} catch(Exception e) {
			System.out.println( "ERRORE durante l'inserimento dell'Utente!!" );
		}
		
	}
	
	//recupera l'utente dall'id
	public Utente getUtenteById(long id) {
		Utente e = em.find(Utente.class, id);
		
		if( e == null ) {
			System.out.println( "Il numero di tessera " + id + " non esiste!" );
		}
		
		return e;
	}
	
	//modifica la validità di un abbonamento a TRUE
	public static void updateUtenteById(long id, Abbonamento abbonamento) {
		Utente u = em.find(Utente.class, id);
		
		if(u == null) {
			System.out.println("Errore, questo utente non esiste!");
			return;
		}
		
		try {
			u.setAbbonamento(abbonamento);
			
			t.begin();
			em.persist(u);
			t.commit();
			
			
		} catch(Exception e1) {
			System.out.println("Errore, abbonamento già attivo!");
		}
		
	}
	
}