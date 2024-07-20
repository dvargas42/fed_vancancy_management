package br.com.vargas.fed_vacancy_management.modules.candidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.vargas.fed_vacancy_management.modules.candidate.service.CandidateService;

@Controller
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;
    
    @GetMapping("/login")
    public String login() {
        return "/candidate/login";
    }

    @PostMapping("/signIn")
    public String signIn(RedirectAttributes redirectAttributes,String username, String password) {
        try {
            var token = candidateService.login(username, password);

            return "/candidate/profile";

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error_message", "Usuario/Senha incorretos");
            return "redirect:/candidate/login";
        }
    }   
}
    