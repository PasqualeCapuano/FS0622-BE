package entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import entities.abstracts.Mezzo;
import enums.TappeTram;
import enums.TipoMezzo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tram")
@Getter
@Setter
@NoArgsConstructor
public class Tram extends Mezzo {
	
	@Enumerated(EnumType.STRING)
	private TappeTram capolinea;
	@Enumerated(EnumType.STRING)
	private TappeTram partenza;
	
	public Tram(int capienza, TipoMezzo tipoMezzo, boolean inServizio, TappeTram capolinea, TappeTram partenza) {
		super(capienza, tipoMezzo, inServizio);
		this.capolinea = capolinea;
		this.partenza = partenza;
	}

	

}
