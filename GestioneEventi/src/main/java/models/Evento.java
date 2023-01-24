package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "eventi")
@Getter
@Setter
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id;
	String titolo;
	LocalDate dataEvento;
	String descrizione;
	@Enumerated(EnumType.STRING)
	TipoEvento tipoEvento;
	int numeroMassimoPartecipanti;

	
	
}
