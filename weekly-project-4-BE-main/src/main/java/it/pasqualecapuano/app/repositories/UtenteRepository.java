package it.pasqualecapuano.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.pasqualecapuano.app.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	

}
