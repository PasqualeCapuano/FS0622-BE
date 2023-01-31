package utils;

import dao.MezzoDAO;
import entities.Autobus;
import entities.Tram;
import enums.TappeAutobus;
import enums.TappeTram;
import enums.TipoMezzo;

public class Gestionale {

	public static void addMezzi() {
		
		Autobus a1 = new Autobus(80, TipoMezzo.AUTOBUS, true, "780", TappeAutobus.TERMINI, TappeAutobus.CASTEL_SANT_ANGELO);
		Autobus a2 = new Autobus(80, TipoMezzo.AUTOBUS, true, "8", TappeAutobus.CASTEL_SANT_ANGELO, TappeAutobus.CHIESA_NUOVA);
		Autobus a3 = new Autobus(80, TipoMezzo.AUTOBUS, false, "071", TappeAutobus.PIAZZA_VENEZIA, TappeAutobus.TRANSPONTINA);
		Autobus a4 = new Autobus(80, TipoMezzo.AUTOBUS, true, "720", TappeAutobus.TRANSPONTINA, TappeAutobus.QUIRINALE);
		saveAutobus(a1);
		saveAutobus(a2);
		saveAutobus(a3);
		saveAutobus(a4);
		
		Tram t1 = new Tram(100, TipoMezzo.TRAM, false, "2", TappeTram.CASALETTO, TappeTram.MINISTERO_PUBBLICA_ISTRUZIONE);
		Tram t2 = new Tram(100, TipoMezzo.TRAM, true, "5", TappeTram.COLLI_PORTUENSI, TappeTram.PONTE_BIANCO);
		Tram t3 = new Tram(100, TipoMezzo.TRAM, true, "14", TappeTram.SAN_GIOVANNI, TappeTram.STAZIONE_TRASTEVERE);
		Tram t4 = new Tram(100, TipoMezzo.TRAM, true, "19", TappeTram.MINISTERO_PUBBLICA_ISTRUZIONE, TappeTram.GIANICOLENSE);
		saveTram(t1);
		saveTram(t2);
		saveTram(t3);
		saveTram(t4);
		
	}
	
	public static Autobus saveAutobus(Autobus a) {
		MezzoDAO aut = new MezzoDAO();
		aut.save(a);
		return a;
	}
	
	public static Tram saveTram(Tram t) {
		MezzoDAO tram = new MezzoDAO();
		tram.save(t);
		return t;
	}
	
	public static void counter() {
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_BACKGROUND = "\u001B[41m";
		long endTime = System.currentTimeMillis() + (3 * 1000);
	    int count = 0;
	    System.out.println("Caricamento dati" );
	    while (System.currentTimeMillis() < endTime) {
	      try {
	        Thread.sleep(250);
	        count++;
	        System.out.print(ANSI_RED + ANSI_BACKGROUND + "." + ANSI_RESET + " ");
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	    System.out.println();
	    System.out.println("Dati caricati con successo!");
	    System.out.println(ANSI_RED + "-------------------------------------------" + ANSI_RESET);
	}
	
}