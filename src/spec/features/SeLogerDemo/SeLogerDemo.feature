@seloger
Feature: Autentification - SeLoger
  En tant que utilisateur je souhaite m autentifier

  @cnx
  Scenario: Autentification - SeLoger
    Given J ouvre l application SeLoger
    When Je clique sur se connecter
    And Je saisie l email
    And Je saisie mot de passe
    And Je clique sur le bouton se connecter
    Then Redirection vers la page home

  @location
  Scenario Outline: Recherche par location - SeLoger
    When Je clique sur debuter une recherche
    When je clique sur le bouton nouvelle recherche
    When je clique sur recherche avancee
    When je clique sur louer
    When je clique sur parking/box
    When je saisie un budget minimun "<budgetMin>"
    When je saisie un budget maximum "<budgetMax>"
    When je saisie la surface minimun "<SurfaceMin>"
    When je saisie la surface maximum "<SurfaceMax>"
    When je clique sur trois pieces
    When je clique sur quatre pieces
    When je clique sur deux chambres
    When je clique sur balcon
    When je clique sur cave
    When je clique sur annonce avec photo
    Then je clique sur le bouton rechercher

    Examples: 
      | budgetMin | budgetMax | SurfaceMin | SurfaceMax |
      |       800 |      1050 |         60 |         85 |
      |      1000 |      1100 |         69 |         92 |

  @achat
  Scenario Outline: Recherche par achat - SeLoger
    When Je clique sur debuter une recherche
    When je clique sur le bouton nouvelle recherche
    When je clique sur recherche avancee
    When je clique sur acheter
    When je clique sur appartement
    When je saisie un budget minimun "<budgetMin>"
    When je saisie un budget maximum "<budgetMax>"
    When je saisie la surface minimale "<SurfaceMin>"
    When je saisie la surface maximale "<SurfaceMax>"
    When je saisie la surface minimale du terrain "<SurfaceTerrainMin>"
    When je saisie la surface maximale du terrain "<SurfaceTerrainMax>"
    When je clique sur trois pieces
    When je clique sur quatre pieces
    When je clique sur deux chambres
    When je clique sur annonce avec photo
    Then je clique sur le bouton rechercher

    Examples: 
      | budgetMin | budgetMax | SurfaceMin | SurfaceMax |
      |    280000 |    320000 |         80 |        110 |
      |    330000 |    340000 |         85 |        125 |
