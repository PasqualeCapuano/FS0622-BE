package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import entities.abstracts.Mezzo;
import enums.TappeAutobus;
import enums.TipoMezzo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autobus")
@DiscriminatorValue("Autobus")
@Getter
@Setter
@NoArgsConstructor
public class Autobus extends Mezzo {

	@Enumerated(EnumType.STRING)
	private TappeAutobus partenza;
	@Enumerated(EnumType.STRING)
	private TappeAutobus capolinea;
	
	private String numero;
	
	public Autobus(int capienza, TipoMezzo tipoMezzo, boolean inServizio, String numero, TappeAutobus partenza, TappeAutobus capolinea) {
		super(capienza, tipoMezzo, inServizio);
		this.numero = numero;
		this.partenza = partenza;
		this.capolinea = capolinea;
	}
	
}