package com.iset.demo.controller;

import com.iset.demo.model.Etudiant;
import com.iset.demo.service.EtudiantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/etudiants")
public class EtudiantController {

    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "formulaire";
    }

    @PostMapping("/ajouter")
    public String ajouterEtudiant(@ModelAttribute("etudiant") Etudiant etudiant) {
        etudiantService.ajouter(etudiant);
        return "redirect:/etudiants/liste";
    }

    @GetMapping("/liste")
    public String afficherListe(Model model) {
        model.addAttribute("etudiants", etudiantService.lister());
        return "liste";
    }
}