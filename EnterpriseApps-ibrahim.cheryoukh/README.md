# Enterprise Apps ibrahim.cheryoukh

Werkstuk voor het vak **Enterprise Applications** — Graduaat Programmeren, Erasmushogeschool Brussel.

## Beschrijving

Werkend prototype van een vernieuwde website voor een Anderlechtse NGO die zich inzet voor gemeenschapsbouwen en hulp aan mensen die het minder breed hebben. De webapp laat toe evenementen te beheren en bezoekers te laten contact opnemen.

---

## Gebruikte technologieën & libraries

| Technologie | Versie | Doel |
|---|---|---|
| Java | 17 | Programmeertaal |
| Spring Boot | 3.2.5 | Backend framework |
| Spring Web | — | REST & MVC controller |
| Spring Data JPA | — | Database communicatie |
| Thymeleaf | — | Server-side HTML templates |
| Spring Validation | — | Formuliervalidatie |
| Spring Mail | — | E-mail verzenden |
| MySQL | 8.x | Relationele database |
| Tailwind CSS (CDN) | 3.x | Styling & layout |
| Mailtrap.io | — | Fictief e-mail testen |

---

## Pagina's

- **/** — Index: tabel met de 10 laatste evenementen
- **/events/new** — Formulier om een nieuw evenement toe te voegen
- **/events/{id}** — Detailpagina van één evenement
- **/about** — Informatie over de NGO
- **/contact** — Contactformulier met e-mail via Mailtrap

---

## Gebruikte tutorials & documentatie

- [Spring Boot officiële documentatie](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Thymeleaf documentatie](https://www.thymeleaf.org/documentation.html)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Bean Validation (Jakarta)](https://beanvalidation.org/2.0/spec/)
- [Mailtrap SMTP setup](https://mailtrap.io/blog/spring-send-email/)
- [Tailwind CSS documentatie](https://tailwindcss.com/docs)

---

## Geschiedenis AI-chats

Dit project werd begeleid via Claude (Anthropic) op claude.ai. De volledige chatgeschiedenis is beschikbaar als bijlage of op aanvraag. In de chats werd gevraagd om:
- Uitleg over Spring Boot projectstructuur
- Hulp bij het opzetten van entities, repositories en controllers
- Hulp bij Thymeleaf templates en formuliervalidatie
- Hulp bij Mailtrap SMTP configuratie

---

## Manual: project uitvoeren

### Vereisten
- Java 17+
- Maven
- MySQL (via WSL of lokaal)
- IntelliJ IDEA (aanbevolen)

### Stap 1: Database aanmaken

Start WSL en log in op MySQL:
```bash
sudo service mysql start
sudo mysql -u root -p
```

Maak de database aan:
```sql
CREATE DATABASE ngo_events;
EXIT;
```

### Stap 2: application.properties aanpassen

Controleer `src/main/resources/application.properties` en pas indien nodig je MySQL wachtwoord aan:
```properties
spring.datasource.password=test1234
```

### Stap 3: Project starten

Open het project in IntelliJ en start `NgoEventsApplication.java`, of via terminal:
```bash
./mvnw spring-boot:run
```

### Stap 4: Website openen

Ga naar [http://localhost:8080](http://localhost:8080) in je browser.

### Stap 5: E-mails testen

Ga naar [mailtrap.io](https://mailtrap.io) → Sandboxes → My Sandbox om ontvangen testmails te bekijken.

---

## Projectnaam GitHub repository

`Enterprise Apps ibrahim.cheryoukh`
