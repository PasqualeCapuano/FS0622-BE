package entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import entities.abstracts.TitoloDiViaggio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Biglietto")
@Table(name="biglietti")
@Getter
@Setter
@NoArgsConstructor
public class Biglietto extends TitoloDiViaggio{
	
	private LocalDate vidimazione;
	
	public Biglietto(LocalDate dataEmissione, LocalDate dataScadenza, LocalDate vidimazione, boolean validita) {
		super(dataEmissione, dataScadenza, validita);
		this.vidimazione = vidimazione;
	}
	
	
}
