package be.erasmus.ngo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Tijdstip is verplicht")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime tijdstip;

    @NotBlank(message = "Titel is verplicht")
    private String titel;

    @NotBlank(message = "Omschrijving is verplicht")
    private String omschrijving;

    @NotBlank(message = "Organisatie is verplicht")
    private String organisatie;

    @Email(message = "Ongeldig e-mailadres")
    @NotBlank(message = "E-mail contactpersoon is verplicht")
    private String mailContactpersoon;

    @ManyToOne
    @JoinColumn(name = "location_id")
    @NotNull(message = "Locatie is verplicht")
    private Location locatie;

    public Event() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getTijdstip() { return tijdstip; }
    public void setTijdstip(LocalDateTime tijdstip) { this.tijdstip = tijdstip; }

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    public String getOmschrijving() { return omschrijving; }
    public void setOmschrijving(String omschrijving) { this.omschrijving = omschrijving; }

    public String getOrganisatie() { return organisatie; }
    public void setOrganisatie(String organisatie) { this.organisatie = organisatie; }

    public String getMailContactpersoon() { return mailContactpersoon; }
    public void setMailContactpersoon(String mailContactpersoon) { this.mailContactpersoon = mailContactpersoon; }

    public Location getLocatie() { return locatie; }
    public void setLocatie(Location locatie) { this.locatie = locatie; }
}
