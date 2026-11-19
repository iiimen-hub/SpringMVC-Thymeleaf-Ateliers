package com.iset.demo.service;

import com.iset.demo.model.Etudiant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EtudiantService {
    private final List<Etudiant> etudiants = new ArrayList<>();

    public void ajouter(Etudiant e) {
        etudiants.add(e);
    }

    public Collection<Etudiant> lister() {
        return etudiants;
    }
}