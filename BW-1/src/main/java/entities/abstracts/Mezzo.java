package entities.abstracts;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import enums.TipoMezzo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mezzi")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "mezzi_type", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
abstract public class Mezzo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int capienza;
	@Enumerated(EnumType.STRING)
	private TipoMezzo tipoMezzo;
	private boolean inServizio;
	
	public Mezzo(int capienza, TipoMezzo tipoMezzo, boolean inServizio) {
		this.capienza = capienza;
		this.tipoMezzo = tipoMezzo;
		this.inServizio = inServizio;
	}
	
}