package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "partita_di_calcio")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PartitaDiCalcio extends Evento {
	
	private String homeTeam;
	private String awayTeam;
	private String winner;
	private int goalNumberHome;
	private int goalNumberAway;
	
	public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMaxPartecipanti, Set<Partecipazione> setPartecipazione, Location location, String homeTeam,
			String awayTeam, String winner, int goalNumberHome, int goalNumberAway) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMaxPartecipanti, setPartecipazione, location);
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.winner = winner;
		this.goalNumberHome = goalNumberHome;
		this.goalNumberAway = goalNumberAway;
	}
	
	
	
	
}
