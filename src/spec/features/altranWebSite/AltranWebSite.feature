@altran
Feature: Site Web - Altran
  En tant que utilisateur je veux acceder au site web altran

  @ouvrirlesite
  Scenario: Site Web - Altran
    Given J ouvre le site web
    When Je clique sur postulez maintenant
    When Je clique sur l offre ingenieur en automatisation de test
    When Je clique sur postuler maintenant
    When Je clique sur le lien remplissez manuellement votre profil
    Then Redirection vers la page de profil pour la remplir

  @postuler
  Scenario Outline: Postuler - Altran
    When Je clique sur la case a cocher je ne suis pas un robot
    When Je selectionne le titre "<titre>"
    When Je saisie le nom "<nom>"
    When Je saisie le prenom "<prenom>"
    When Je saisie l email "<email>"
    When Je saisie l adresse "<adresse>"
    When Je saisie le complement d adresse "<compladresse>"
    When Je saisie le code postal "<cdpostal>"
    When Je saisie la ville "<ville>"
    When Je selectionne le pays "<pays>"
    When Je saisie la region "<region>"
    When Je saisie le numero de telephone fixe "<telfixe>"
    When Je saisie le numero de telephone portable "<telmobile>"
    When Je clique sur parcourir pour joindre un CV
    When Je saisie la date de naissance "<dtnaissance>"
    When Je selectionne le nombre d annee d experience
    When Je selectionne la nationalite
    When Je clique sur le bouton ajouter un secteur
    When Je selectionne le secteur
    When Je clique sur le bouton ajouter experience
    When Je saisie le nom d entreprise "<nomentreprise>"
    When Je saisie le poste "<poste>"
    When Je saisie la date de debut d experience "<dtdebexp>"
    When Je selectionne le pays
    When Je saisie la date de fin d experience "<dtfinexp>"
    When Je clique sur le bouton radio encore en poste ou non
    When je saisis la description de poste "<descposte>"
    When Je saisie le type de poste souhaite "<typeposte>"
    When Je selectionne le type de contrat souhaite "<typecontrat>"
    When Je saisie la date de disponibilite "<dtdispo>"
    When Je selectionne le preavis "<preavis>"
    When Je clique sur ajouter formation
    When Je selectionne le pays d etude
    When Je selectionne le niveau de diplome
    When Je saisie l annee de diplome "<anneediplome>"
    When Je selectionne la langue maternelle
    When Je selectionne autres langues
    When Je clique sur selectionner
    When Je clique sur ajouter remuneration
    When je saisis le salaire fixe actuel "<salfixeactuel>"
    When je saisis le salaire fixe souhaite "<salfixesouhaite>"
    When Je clique sur parcourir pour joindre une lettre de motivation
    When Je clique sur le bouton envoyer
    Then Redirection vers une autre page

    Examples: 
      | titre | nom       | prenom | email                    | adresse                   | compladresse       | cdpostal | ville                 | pays   | region        | telfixe    | telmobile    | dtnaissance | nomentreprise | poste                           | dtdebexp   | dtfinexp   | descposte                                                | typeposte    | typecontrat       | dtdispo    | preavis | anneediplome | salfixeactuel | salfixesouhaite |
      | M.    | BOUGUERRA | Ridha  | bouguerraridha@gmail.com | 1 rue de la vieille butte | Residence Eldorado |    78100 | Saint-Germain-En-Laye | France | Ile de France | 0151525354 | +33665458439 | 07/04/1983  | Altran        | Ingenieur de test et validation | 27/01/2020 | 22/10/2020 | Verification et validation des flux entrants et sortants | Automaticien | CDI [Temps plein] | 01/12/2020 | 1 mois  |         2009 |         36000 |           41000 |
