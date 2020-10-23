@connexion
Feature: Autentification - OrangeHRM
  En tant que utilisateur je souhaite m autentifier

  @cnx
  Scenario: Autentification - OrangeHRM
    Given Je ouvre l application OrangeHRM
    When Je saisie userName
    And Je saisie le mot de passe
    And Je clique sur le boutton Login
    Then Redirection vers la page Home