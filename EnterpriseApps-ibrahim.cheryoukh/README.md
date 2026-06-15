# Enterprise Apps ibrahim.cheryoukh

Werkstuk voor het vak **Enterprise Applications** — Graduaat Programmeren, Erasmushogeschool Brussel.

## Beschrijving

Werkend prototype van een vernieuwde website voor een Anderlechtse NGO die zich inzet voor gemeenschapsbouwen en hulp aan mensen die het minder breed hebben. De webapp laat toe evenementen te beheren en bezoekers te laten contact opnemen.

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

## Pagina's

- **/** — Index: tabel met de 10 laatste evenementen
- **/events/new** — Formulier om een nieuw evenement toe te voegen
- **/events/{id}** — Detailpagina van één evenement
- **/about** — Informatie over de NGO
- **/contact** — Contactformulier met e-mail via Mailtrap

## Gebruikte tutorials & documentatie

- [Spring Boot officiële documentatie](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Thymeleaf documentatie](https://www.thymeleaf.org/documentation.html)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Bean Validation (Jakarta)](https://beanvalidation.org/2.0/spec/)
- [Mailtrap SMTP setup](https://mailtrap.io/blog/spring-send-email/)
- [Tailwind CSS documentatie](https://tailwindcss.com/docs)

## Geschiedenis AI-chats

Voor dit project heb ik gebruik gemaakt van Claude (Anthropic) als hulpmiddel bij enkele onderdelen.

Link naar de chatgeschiedenis: [← HIER JE LINK PLAKKEN](https://claude.ai/)

AI werd gebruikt voor:
- Hulp bij WSL en MySQL installatie en configuratie
- Uitleg over bepaalde concepten zoals Spring Boot structuur

Zelf uitgewerkt (met hulp van een familielid):
- Het volledige coderen van het project (entities, controllers, templates)
- Testen en debuggen van het project
- GitHub repository aanmaken en indienen

## Manual: project uitvoeren

### Vereisten
- Java 17+
- Maven
- MySQL via WSL
- IntelliJ IDEA

### Stap 1: WSL en MySQL starten

```bash
sudo service mysql start
```

### Stap 2: Database aanmaken (enkel eerste keer)

```bash
sudo mysql
```

```sql
CREATE USER 'springuser'@'localhost' IDENTIFIED BY '040600';
GRANT ALL PRIVILEGES ON ngo_events.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;
CREATE DATABASE ngo_events;
EXIT;
```

### Stap 3: Project openen in IntelliJ

**File → Open → navigeer naar de projectmap → klik OK**

### Stap 4: Project starten

Open `NgoEventsApplication.java` en klik op de groene ▶️ play-knop.

### Stap 5: Website openen

Ga naar [http://localhost:8080](http://localhost:8080) in je browser.

### Stap 6: E-mails testen

Ga naar [mailtrap.io](https://mailtrap.io) → Sandboxes → My Sandbox.

## Projectnaam GitHub repository

`Enterprise Apps ibrahim.cheryoukh`
