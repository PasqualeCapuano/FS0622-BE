package it.pasqualecapuano.app.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.pasqualecapuano.app.entity.Edificio;
import it.pasqualecapuano.app.entity.Postazione;
import it.pasqualecapuano.app.entity.Prenotazione;
import it.pasqualecapuano.app.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class EdificioConfig {
	
	
	@Bean
    public Edificio e() {
        Edificio e = new Edificio();
        return e;
    }

}
