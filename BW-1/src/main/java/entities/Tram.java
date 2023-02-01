package entities;

import javax.persistence.DiscriminatorValue;
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
@DiscriminatorValue("Tram")
@Getter
@Setter
@NoArgsConstructor
public class Tram extends Mezzo {

	@Enumerated(EnumType.STRING)
	private TappeTram partenza;
	@Enumerated(EnumType.STRING)
	private TappeTram capolinea;
	
	private String numero;
	
	public Tram(int capienza, boolean inServizio, String numero, TappeTram partenza, TappeTram capolinea) {
		super(capienza, inServizio);
		this.numero = numero;
		this.partenza = partenza;
		this.capolinea = capolinea;
	}	
	
}