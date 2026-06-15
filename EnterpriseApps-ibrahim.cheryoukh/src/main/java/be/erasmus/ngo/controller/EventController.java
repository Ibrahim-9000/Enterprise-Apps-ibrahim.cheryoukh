package be.erasmus.ngo.controller;

import be.erasmus.ngo.model.Event;
import be.erasmus.ngo.repository.EventRepository;
import be.erasmus.ngo.repository.LocationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private LocationRepository locationRepository;

    // INDEX - toont de 10 laatste evenementen
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("events", eventRepository.findTop10ByOrderByTijdstipDesc());
        return "index";
    }

    // NEW - formulier tonen
    @GetMapping("/events/new")
    public String newEventForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locaties", locationRepository.findAll());
        return "new";
    }

    // NEW - formulier verwerken
    @PostMapping("/events/new")
    public String newEventSubmit(@Valid @ModelAttribute("event") Event event,
                                  BindingResult result,
                                  Model model) {
        if (result.hasErrors()) {
            model.addAttribute("locaties", locationRepository.findAll());
            return "new";
        }
        eventRepository.save(event);
        return "redirect:/";
    }

    // DETAILS - één evenement tonen
    @GetMapping("/events/{id}")
    public String details(@PathVariable Long id, Model model) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evenement niet gevonden: " + id));
        model.addAttribute("event", event);
        return "details";
    }
}
