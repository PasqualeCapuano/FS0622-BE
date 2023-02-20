package it.pasqualecapuano.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.pasqualecapuano.app.entities.Utente;
import it.pasqualecapuano.app.repositories.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository ur;
	
	public Utente save(Utente u) {
		return ur.save(u);
	}
	public List<Utente> getAll() {
		return ur.findAll();
	}
	
	public Optional<Utente> getById(int id) {
		return ur.findById(id);
	}
	
	public Page<Utente> getPage(Pageable p) {
		return ur.findAll(p);
	}
	
	public void delete(Utente u) {
		ur.delete(u);
	}

}
