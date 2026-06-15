package be.erasmus.ngo;

import be.erasmus.ngo.model.Event;
import be.erasmus.ngo.model.Location;
import be.erasmus.ngo.repository.EventRepository;
import be.erasmus.ngo.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataInitializer implements CommandLineRunner {

    private final LocationRepository locationRepository;
    private final EventRepository eventRepository;

    public DataInitializer(LocationRepository locationRepository, EventRepository eventRepository) {
        this.locationRepository = locationRepository;
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... args) {
        // Alleen data toevoegen als de database leeg is
        if (locationRepository.count() == 0) {
            Location loc1 = locationRepository.save(new Location("Campus Kaai", "Kaaiplein 1, 1000 Brussel", 200));
            Location loc2 = locationRepository.save(new Location("Gemeenschapscentrum Anderlecht", "Erasmusstraat 10, 1070 Anderlecht", 80));
            Location loc3 = locationRepository.save(new Location("Wijkhuis De Vaart", "Vaartstraat 5, 1070 Anderlecht", 50));

            Event e1 = new Event();
            e1.setTitel("Buurtbarbecue zomer 2025");
            e1.setOmschrijving("Een gezellige barbecue voor de hele buurt. Iedereen welkom!");
            e1.setOrganisatie("Eigen beheer");
            e1.setMailContactpersoon("info@ngo-anderlecht.be");
            e1.setTijdstip(LocalDateTime.of(2025, 7, 15, 17, 0));
            e1.setLocatie(loc2);
            eventRepository.save(e1);

            Event e2 = new Event();
            e2.setTitel("Taallessen Frans voor beginners");
            e2.setOmschrijving("Gratis taallessen Frans voor bewoners van Anderlecht. Inschrijving verplicht.");
            e2.setOrganisatie("Partenaire: Lire et Écrire");
            e2.setMailContactpersoon("contact@lire-ecrire.be");
            e2.setTijdstip(LocalDateTime.of(2025, 9, 10, 9, 0));
            e2.setLocatie(loc1);
            eventRepository.save(e2);

            Event e3 = new Event();
            e3.setTitel("Kledingbeurs voor het goede doel");
            e3.setOmschrijving("Tweedehands kleding aan democratische prijzen. Opbrengst gaat naar de voedselbank.");
            e3.setOrganisatie("Eigen beheer");
            e3.setMailContactpersoon("kledingbeurs@ngo-anderlecht.be");
            e3.setTijdstip(LocalDateTime.of(2025, 10, 5, 10, 0));
            e3.setLocatie(loc3);
            eventRepository.save(e3);
        }
    }
}
