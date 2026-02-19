package pl.pezet.user_form_app.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pezet.user_form_app.model.User;
import pl.pezet.user_form_app.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form"; // formularz z błędami
        }

        userService.saveUser(user);
        model.addAttribute("message", "Użytkownik zapisany!");
        model.addAttribute("user", new User()); // czyścimy formularz
        return "form";
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }
}
