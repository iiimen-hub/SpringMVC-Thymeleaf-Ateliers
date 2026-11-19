package com.iset.demo.model;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class Etudiant {
    private String numeroInscription;
    private String nom;
    private String prenom;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateNaissance;

    private double moyenneAnneePrecedente;
    private int niveauEtude;

    public Etudiant() {}

    public Etudiant(String numeroInscription, String nom, String prenom,
                    LocalDate dateNaissance, double moyenneAnneePrecedente, int niveauEtude) {
        this.numeroInscription = numeroInscription;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.moyenneAnneePrecedente = moyenneAnneePrecedente;
        this.niveauEtude = niveauEtude;
    }

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