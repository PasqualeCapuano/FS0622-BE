package app;

import java.time.LocalDate;
import java.util.HashSet;

import javax.persistence.Embeddable;

import dao.EventoDAO;
import dao.LocationDAO;
import dao.PartecipazioneDAO;
import dao.PersonaDAO;
import entities.Concerto;
import entities.Evento;
import entities.Genere;
import entities.Location;
import entities.Partecipazione;
import entities.PartitaDiCalcio;
import entities.Persona;
import entities.Sesso;
import entities.Stato;
import entities.TipoEvento;
import utils.JpaUtil;

public class App extends JpaUtil {
	
	public static void main(String[] args) {
		
		Location location = saveLocation();
		Evento evento = saveEvento(location);
		Persona persona = savePersona();
		Evento concerto = makeConcerto();
		
		Partecipazione partecipazione = savePartecipazione(evento, persona);

	}
	
	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(Stato.CONFERMATA);
		
		PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
		partecipazioneDAO.save(part);
		return part;
	}
	
	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("Mario");
		per.setCognome("Rossi");
		per.setEmail("mario.rossi@gmail.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDatadinascita(LocalDate.parse("1999-07-11"));
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}
	
	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Roma");
		loc.setNome("Spazio 900");
		
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}
	
	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setTitolo("Discoteca");
		ev.setDataEvento(LocalDate.parse("2023-07-09"));
		ev.setDescrizione("Venite a scatenarvi con noi tra musica ed ospiti speciali");
		ev.setNumeroMaxPartecipanti(150);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);
		
		EventoDAO eventoDAO = new EventoDAO();
		eventoDAO.save(ev);
		return ev;
	}
	
	private static PartitaDiCalcio partitaDicalcio () {
		PartitaDiCalcio p = new PartitaDiCalcio();
		p.setDataEvento(LocalDate.parse("2023-08-09"));
		p.setHomeTeam("Arsenal");
		p.setAwayTeam("Chelsea");
		p.setWinner("Arsenal");
		p.setGoalNumberHome(4);
		p.setGoalNumberAway(2);
		return p;
	}
	
	private static Concerto makeConcerto() {
		Concerto c = new Concerto();
		c.setTitolo("Concerto Blink182");
		c.setDescrizione("Concerto Blink182");
		c.setNumeroMaxPartecipanti(1000);
		c.setTipoEvento(TipoEvento.PUBBLICO);
		c.setDataEvento(LocalDate.parse("2023-05-10"));
		c.setGenere(Genere.ROCK);
		c.setInStreaming(true);
		
		EventoDAO EventoDAO = new EventoDAO();
		EventoDAO.save(c);
		return c;
	}

}