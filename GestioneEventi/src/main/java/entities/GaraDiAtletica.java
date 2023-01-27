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
@Table(name = "gara_di_atletica")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class GaraDiAtletica extends Evento {
	
	private Set<Persona> setAtleti;
	private Persona vincitore;
	
	public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMaxPartecipanti, Set<Partecipazione> setPartecipazione, Location location, Set<Persona> setAtleti,
			Persona vincitore) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMaxPartecipanti, setPartecipazione, location);
		this.setAtleti = setAtleti;
		this.vincitore = vincitore;
	}
	
	
}
