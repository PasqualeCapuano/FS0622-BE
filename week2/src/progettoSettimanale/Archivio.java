package progettoSettimanale;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import java.util.Random;

public class Archivio {
	
	private static final String ENCODING = "utf-8";
	
	static String fileName = "archivio.txt";
	static File fileInfo = new File(fileName);
	
	static Scanner in = new Scanner(System.in);
	static ArrayList<Libro> libri = new ArrayList<>();
	static ArrayList<Rivista> riviste = new ArrayList<>();

	public static void main(String[] args) {
		
		boolean continuazioneProgramma = true;
		
		do {
			System.out.println( "--- Benvenuto nell'archivio della biblioteca ---" );  
			  System.out.println( "1 - Aggiungi un elemento" );
			  System.out.println( "2 - Rimuovi elemento tramite codice ISBN" );
			  System.out.println( "3 - Ricerca elemento tramite codice ISBN" );
			  System.out.println( "4 - Ricerca elemento per anno" );
			  System.out.println( "5 - Ricerca elemento per autore" );
			  System.out.println( "5 - Mostra archivio" );
			  System.out.println( "--------------------------------------------------" );
			  System.out.println( "- Seleziona una funzione: " );
			  int selezione = Integer.parseInt(in.nextLine());
			  System.out.println( "--------------------------------------------------" );
			  switch(selezione) {
			  	case (1):
			  		System.out.println( "1 - Aggiungi libro" );
			  		System.out.println( "2 - Aggiungi rivista" );
			  		System.out.println( "- Inserisci tipo: " );  
			  		int selezioneTipo = Integer.parseInt(in.nextLine());
			  		if( selezioneTipo == 1 ) {
			  			aggiungiLibro();
			  		} else if (selezioneTipo == 2) {
			  			aggiungiRivista();
			  		} else {
			  			System.out.println( "- Il tipo selezionato non esiste!" );
			  		}
			  		break;
			  	case (2):
			  		System.out.println( "- Digita il codice ISBN del libro da rimuovere:" );
			  	 	long codiceIsbn = Long.parseLong(in.nextLine());
			  		libri.removeIf(o -> o.getCodiceIsbn() == codiceIsbn);
			  		riviste.removeIf(o -> o.getCodiceIsbn() == codiceIsbn);
			  		
			  		try {
			  			ArrayList<String> lines = new ArrayList<>(FileUtils.readLines(fileInfo, ENCODING));
			  			lines.removeIf(line -> line.contains(Long.toString(codiceIsbn)));
			  			FileUtils.writeLines(fileInfo, lines);
			  		}catch(IOException e) {
			  			e.printStackTrace();
			  		}
			  		System.out.println("Elemento rimosso con successo!");
			  		break;
			  	case (3):
			  		break;
			  	case (4):
			  		break;
			  	case (5):
			  		break;
			  	case (6):
			  		break;
			  }
			  
			  System.out.println("Vuoi continuare? (S/N)");
			  String input = in.nextLine();
			  continuazioneProgramma = input.equalsIgnoreCase("S");
			    
		} while(continuazioneProgramma);
		  

	}
	
	public static void aggiungiLibro() {
		System.out.println( "- Inserisci titolo: " );
		String titolo = in.nextLine();
  		System.out.println( "- Inserisci anno di pubblicazione: " );
  		int anno = Integer.parseInt(in.nextLine());
  		System.out.println( "- Inserisci numero pagine: " );
  		int nPagine = Integer.parseInt(in.nextLine());
  		System.out.println( "- Inserisci autore: " );
  		String autore = in.nextLine();
  		System.out.println( "- Inserisci genere: " );
  		String genere = in.nextLine();
  		
  		Libro libro = new Libro(generatoreIsbn(), titolo, anno, nPagine, autore, genere);
  		
  		libri.add(libro);
  		
  		String libroAgg = libro.toString();
  		try {
  			scriviInArchivio(fileInfo, libroAgg + System.lineSeparator(), true);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
  		
  		System.out.println( "Libro aggiunto correttamente!" );
  		
	}
	
	public static void aggiungiRivista() {
		System.out.println( "Inserisci titolo: " );
		String titolo = in.nextLine();
		System.out.println( "Inserisci anno di pubblicazione: " );
		int anno = Integer.parseInt(in.nextLine());
		System.out.println( "Inserisci numero pagine: " );
		int nPagine = Integer.parseInt(in.nextLine());
		System.out.println( "1 - settimanale" );
		System.out.println( "2 - mensile" );
		System.out.println( "3 - semestrale" );
		System.out.println( "Inserisci periodicitÃ : " );
		int selezione = Integer.parseInt(in.nextLine());
		Periodicita periodicita = null;
		switch(selezione) {
			case (1):
				periodicita =  Periodicita.SETTIMANALE;
				break;
			case (2):
				periodicita =  Periodicita.MENSILE;
				break;
			case (3):
				periodicita =  Periodicita.SEMESTRALE;
				break;
		}
				
		Rivista rivista = new Rivista(generatoreIsbn(), titolo, anno, nPagine, periodicita);
		
		riviste.add(rivista);
		String rivistaAgg = rivista.toString();
		try {
			scriviInArchivio(fileInfo, rivistaAgg + System.lineSeparator(), true);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println( "Rivista aggiunto correttamente!" );
	}
	
	public static long generatoreIsbn() {
		HashSet<Long> setIsbn = new HashSet<>();
		Random numR = new Random();
		long inizioCodice = 9000000000000L;
		long fineCodice = 9999999999999L;
		
        long nuovoIsbn = 0;
        
        do {
            nuovoIsbn = inizioCodice + (long)(numR.nextDouble()*(fineCodice - inizioCodice));
        } while (setIsbn.contains(nuovoIsbn));
        
        setIsbn.add(nuovoIsbn);
        return nuovoIsbn;
	}
	
	public static void scriviInArchivio(File f, String s, boolean append) throws IOException {
		FileUtils.writeStringToFile(f, s, ENCODING, append);
	}
	
	public static void eliminaDaArchivio(File f) throws IOException {
		FileUtils.readFileToString(f, ENCODING);
	}

}
