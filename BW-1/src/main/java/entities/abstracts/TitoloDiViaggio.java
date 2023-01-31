package entities.abstracts;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="titoli_di_viaggio")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "titoli_di_viaggio_type", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
public abstract class TitoloDiViaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codTitoloViaggio;
	private LocalDate dataEmissione;
	private LocalDate dataScadenza;
	private boolean validita;
	
	public TitoloDiViaggio(LocalDate dataEmissione, LocalDate dataScadenza, boolean validita) {
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza;
		this.validita = validita;
	}
	
	
}
