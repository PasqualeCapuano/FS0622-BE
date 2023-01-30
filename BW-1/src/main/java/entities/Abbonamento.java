package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import entities.abstracts.TitoloDiViaggio;
import enums.Periodicita;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="abbonamenti")
@Getter
@Setter
@NoArgsConstructor
public class Abbonamento extends TitoloDiViaggio{
	
	private boolean validita = true;
	@Enumerated(EnumType.STRING)
	private Periodicita durata;
	
	public Abbonamento(LocalDate dataEmissione, LocalDate dataScadenza, boolean validita, Periodicita durata) {
		super(dataEmissione, dataScadenza);
		this.validita = validita;
		this.durata = durata;
	}
	
	
}
