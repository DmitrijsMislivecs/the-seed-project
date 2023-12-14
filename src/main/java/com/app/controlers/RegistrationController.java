package com.app.controlers;

import com.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("newUser", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String saveNewUser(@ModelAttribute User user, Model model) {
        model.addAttribute("Name", user.getName());
        model.addAttribute("Surname", user.getSurname());

        return "successRegistration.html";
    }
}
