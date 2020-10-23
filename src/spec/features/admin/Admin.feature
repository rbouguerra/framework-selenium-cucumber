@admin
Feature: Admin - OrangeHRM
  En tant que utilisateur je souhaite verifier le module Admin

  Background: 
    Given Je ouvre l application OrangeHRM
    When Je saisie le nom d utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton Login
    Then Redirection vers la page Home

  @admin
  Scenario Outline: Creation Admin - OrangeHRM
    When je clique sur le module Admin
    When je clique sur un nom d utilisateur affiché dans le tableau
    When je clique sur le bouton Edit
    When je copie le contenu nom employee
    When je clique sur le bouton Cancel
    When je clique sur le bouton Add
    When je colle nom employee
    When je saisie nom d utilisateur "<nomutilisateur>"
    When je saisie le mot de passe "<mdp>"
    When je saisie confirme mot de passe "<confMdp>"
    When je clique sur le bouton Save
    Then je verifie le nom Admin ajoute

    Examples: 
      | nomutilisateur | mdp      | confMdp  |
      | userSalma      | salma123 | salma123 |
      | userRidha      | ridha123 | ridha123 |
