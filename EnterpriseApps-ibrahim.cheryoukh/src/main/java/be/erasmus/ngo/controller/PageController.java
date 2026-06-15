package be.erasmus.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String contactSubmit(@RequestParam String naam,
                                 @RequestParam String email,
                                 @RequestParam String bericht,
                                 Model model) {
        if (naam.isBlank() || email.isBlank() || bericht.isBlank()) {
            model.addAttribute("fout", "Alle velden zijn verplicht.");
            return "contact";
        }

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(email);
        mail.setTo("admin@ngo-anderlecht.be");
        mail.setSubject("Nieuw contactbericht van " + naam);
        mail.setText("Van: " + naam + " <" + email + ">\n\n" + bericht);
        mailSender.send(mail);

        model.addAttribute("succes", "Je bericht is verzonden!");
        return "contact";
    }
}
