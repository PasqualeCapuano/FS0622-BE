package app;

import java.time.LocalDate;

import dao.EventoDAO;
import models.TipoEvento;

public class App extends EventoDAO {

	public static void main(String[] args) {
		
		boolean insertEvento = true;
		boolean deleteEvento = false;
		boolean getEvento = false;
		boolean updateEvento = false;
		
		if( insertEvento ) {
			inserisciEvento("Oktoberfest", LocalDate.parse("2023-09-16"), "Venite a festeggiare con noi tra musica e tanta birra!", TipoEvento.PUBBLICO, 900);
			inserisciEvento("Matrimonio", LocalDate.parse("2024-07-22"), "Vi aspettiamo nel nostro giorno piÃ¹ speciale.", TipoEvento.PRIVATO, 150);
			inserisciEvento("Festa di compleanno", LocalDate.parse("2023-12-15"), "Vi aspetto alla mia festa!", TipoEvento.PUBBLICO, 30);
		}
		
		if( deleteEvento ) {
			deleteEventoById(2);
		}
		
		if( updateEvento ) {
			updateEventoById(4, "Festa di compleanno Gaetano", LocalDate.parse("2023-12-08"), "Vi aspetto alla mia festa!", TipoEvento.PRIVATO, 25);
		}
		if( getEvento ) {
			getEventoById(4);
		}
		
	}
}