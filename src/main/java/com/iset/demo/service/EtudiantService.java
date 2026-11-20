package com.iset.demo.service;

import com.iset.demo.model.Etudiant;
import com.iset.demo.repository.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    // Create & Update
    public Etudiant enregistrer(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    // Read all
    public List<Etudiant> lister() {
        return etudiantRepository.findAll();
    }

    // Read one
    public Etudiant trouverParId(Long id) {
        return etudiantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Étudiant introuvable : " + id));
    }

    // Delete
    public void supprimer(Long id) {
        etudiantRepository.deleteById(id);
    }

    public Etudiant ajouter(Etudiant etudiant) {
    return etudiantRepository.save(etudiant);
}
}