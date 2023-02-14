package it.pasqualecapuano.app.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pasqualecapuano.app.entity.Postazione;
import it.pasqualecapuano.app.entity.Prenotazione;

@Service
public class PrenotazioneService {
	
	@Autowired
    private PrenotazioneRepository prenotazioneRepo;

    public void insertPrenotazione(Prenotazione pre) {
        prenotazioneRepo.save(pre);
        System.out.println("Prenotazione inserita correttamente!");
    }
    public long getCountPrenotazioni(LocalDate data, int id) {
    	return prenotazioneRepo.getCountPrenotazioni(data,id);
    }
    public long getCountPrenotazioniUtente(LocalDate data, int id) {
    	return prenotazioneRepo.getCountPrenotazioniUtente(data,id);
    }
    


}
