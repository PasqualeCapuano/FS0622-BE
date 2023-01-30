package dao;

import entities.Utente;
import utils.JpaUtils;

public class UtenteDAO extends JpaUtils{
	public void save(Utente u) {

		try {

			t.begin();
			em.persist(u);
			t.commit();

			System.out.println("Elemento inserito correttamente!");
		} catch (Exception e) {
			System.out.println("Errore nell'inserimento dell'Elemento");
		}

	}
}