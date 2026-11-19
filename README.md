# Spring MVC & Thymeleaf — Ateliers

Ce dépôt regroupe mes travaux pratiques réalisés dans le cadre du cours **Atelier Développement Avancé d'application de gestion** à l'ISET Sfax. L'objectif est de prendre en main le développement web côté serveur avec **Spring Boot**, **Spring MVC** et le moteur de templates **Thymeleaf**.

## Ce qui a été développé

### Atelier 1 : Découverte de Thymeleaf
Mise en place d'une première application Spring MVC pour afficher une liste de produits et en ajouter de nouveaux via un formulaire HTML, en utilisant les principales expressions Thymeleaf (`th:object`, `th:field`, `th:each`, `@{...}`, `${...}`).

### Atelier 2 : Gestion d'étudiants
Développement d'une mini-application permettant d'enregistrer et de consulter des étudiants :
- **Modèle `Etudiant`** : numéro d'inscription, nom, prénom, date de naissance, moyenne de l'année précédente et niveau d'étude.
- **Service `EtudiantService`** : gestion du stockage en mémoire à l'aide d'une collection (`List`) avec les méthodes `ajouter(Etudiant e)` et `lister()`.
- **Vues Thymeleaf** :
  - `formulaire.html` pour la saisie d'un nouvel étudiant.
  - `liste.html` pour l'affichage dynamique des étudiants ajoutés.

## Stack technique

- Java & Spring Boot (Spring MVC)
- Thymeleaf
- Maven

## Lancer le projet en local

1. Cloner le dépôt :
   git clone https://github.com/iiimen-hub/SpringMVC-Thymeleaf-Ateliers.git
   cd SpringMVC-Thymeleaf-Ateliers

2. Démarrer l'application :
   .\mvnw.cmd spring-boot:run

3. Ouvrir le navigateur :
   - Ajouter un étudiant : http://localhost:8080/etudiants/formulaire
   - Voir la liste : http://localhost:8080/etudiants/liste
