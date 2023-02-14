package it.pasqualecapuano.app.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pasqualecapuano.app.entity.Edificio;
import it.pasqualecapuano.app.entity.Postazione;
import it.pasqualecapuano.app.entity.Utente;

@Service
public class UtenteService {
	@Autowired
    private UtenteRepository utenteRepo;

    public void insertUtente(Utente u) {
        utenteRepo.save(u);
        System.out.println("Utente inserito correttamente!");
    }
    
    public Optional<Utente> getById(int id) {
		return utenteRepo.findById(id);
	}

}
