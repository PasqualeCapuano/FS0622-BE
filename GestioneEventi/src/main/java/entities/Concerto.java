package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "concerti")
@DiscriminatorValue("concerto")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Concerto extends Evento {

	@Enumerated(EnumType.STRING)
	private Genere genere;
	private boolean inStreaming;
	
	public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMaxPartecipanti, Set<Partecipazione> setPartecipazione, Location location, Genere genere,
			boolean inStreaming) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMaxPartecipanti, setPartecipazione, location);
		this.genere = genere;
		this.inStreaming = inStreaming;
	}
	
	
	
	
}
