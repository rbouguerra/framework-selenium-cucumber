@tag
Feature: Authentification - Param - OrangeHRM
  En tant que utilisateur je souhaite m autentifier

  Background: 
    Given Je ouvre l application OrangeHRM
    When Je saisie le nom d utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le boutton Login
    Then Redirection vers la page Home

  @buzz
  Scenario: Clique - Buzz
    When Je clique sur le module Buzz

  @temps
  Scenario: Clique - Temps
    When Je clique sur le module Temps
