package app;

import java.time.LocalDate;

import dao.MezzoDAO;
import dao.TesseraDAO;
import dao.TicketingDAO;
import dao.TitoloDiViaggioDAO;
import dao.UtenteDAO;
import entities.Abbonamento;
import entities.Autobus;
import entities.Biglietto;
import entities.Distributore;
import entities.Rivenditore;
import entities.Tessera;
import entities.Tram;
import entities.Utente;
import enums.Periodicita;
import enums.TappeAutobus;
import enums.TappeTram;
import enums.TipoMezzo;

public class App {

	public static void main(String[] args) {
		saveAutobus();
		saveTram();
		saveBiglietto();
		saveAbbonamento();
		saveDistributore();
		saveRivenditore();
		saveUtente();
	}
	
	
	public static Autobus saveAutobus() {
		Autobus aut = new Autobus(50, TipoMezzo.AUTOBUS, true, TappeAutobus.E, TappeAutobus.H);
		
		MezzoDAO mezzoDAO = new MezzoDAO();
		mezzoDAO.save(aut);
	        return aut;
	}
	
	public static Tram saveTram() {
		Tram t = new Tram(50, TipoMezzo.TRAM, true, TappeTram.A, TappeTram.D);
		
		MezzoDAO mezzoDAO = new MezzoDAO();
		mezzoDAO.save(t);
	        return t;
	}
	
	public static Biglietto saveBiglietto() {
		Biglietto b = new Biglietto(LocalDate.parse("2023-02-08"), LocalDate.parse("2023-02-10"), LocalDate.parse("2023-02-09"), true);
		
		TitoloDiViaggioDAO titoloDiViaggioDAO = new TitoloDiViaggioDAO();
		titoloDiViaggioDAO.save(b);
	        return b;
	}
	
	public static Abbonamento saveAbbonamento() {
		Abbonamento a = new Abbonamento(LocalDate.parse("2023-02-08"), LocalDate.parse("2023-02-10"), true, Periodicita.MENSILE);
				
		TitoloDiViaggioDAO titoloDiViaggioDAO = new TitoloDiViaggioDAO();
		titoloDiViaggioDAO.save(a);
	        return a;
	}
	
	public static Distributore saveDistributore() {
		Distributore d = new Distributore(100, "Roma", true);
				
		TicketingDAO ticketingDAO = new TicketingDAO();
		ticketingDAO.save(d);
	        return d;
	}
	
	public static Rivenditore saveRivenditore() {
		Rivenditore r = new Rivenditore(100, "Bologna");
				
		TicketingDAO ticketingDAO = new TicketingDAO();
		ticketingDAO.save(r);
	        return r;
	}
	
	public static Utente saveUtente() {
		Utente u = new Utente("Padre", "Figlio", "spirito@santo.amen");
				
		UtenteDAO utenteDAO = new UtenteDAO();
		utenteDAO.save(u);
	        return u;
	}
	
	public static Tessera saveTessera() {
		Tessera u = new Tessera("Padre", "Figlio", "spirito@santo.amen", LocalDate.parse("2023-02-08"));
				
		TesseraDAO tesseraDAO = new TesseraDAO();
		tesseraDAO.save(u);
	        return u;
	}
}
