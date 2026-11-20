package com.iset.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "etudiants")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroInscription;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    private LocalDate dateNaissance;

    private double moyenneAnneePrecedente;

    private int niveauEtude;

    public Etudiant() {
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumeroInscription() { return numeroInscription; }
    public void setNumeroInscription(String numeroInscription) { this.numeroInscription = numeroInscription; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public double getMoyenneAnneePrecedente() { return moyenneAnneePrecedente; }
    public void setMoyenneAnneePrecedente(double moyenneAnneePrecedente) { this.moyenneAnneePrecedente = moyenneAnneePrecedente; }

    public int getNiveauEtude() { return niveauEtude; }
    public void setNiveauEtude(int niveauEtude) { this.niveauEtude = niveauEtude; }
}