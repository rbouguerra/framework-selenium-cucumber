$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin/Admin.feature");
formatter.feature({
  "line": 2,
  "name": "Admin - OrangeHRM",
  "description": "En tant que utilisateur je souhaite verifier le module Admin",
  "id": "admin---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@admin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Creation Admin - OrangeHRM",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "je clique sur le module Admin",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je clique sur le bouton Add",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je saisie nom employee \"\u003cnomEmpl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "je saisie nom d utilisateur \"\u003cnomutilisateur\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "je saisie le mot de passe \"\u003cmdp\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "je saisie confirme mot de passe \"\u003cconfMdp\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "je clique sur le bouton Save",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "je verifie le nom Admin ajoute",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm;",
  "rows": [
    {
      "cells": [
        "nomEmpl",
        "nomutilisateur",
        "mdp",
        "confMdp"
      ],
      "line": 24,
      "id": "admin---orangehrm;creation-admin---orangehrm;;1"
    },
    {
      "cells": [
        "Salma",
        "userSalma",
        "salmasalma",
        "salmasalma"
      ],
      "line": 25,
      "id": "admin---orangehrm;creation-admin---orangehrm;;2"
    },
    {
      "cells": [
        "Ridha",
        "userRidha",
        "salmasalma",
        "salmasalma"
      ],
      "line": 26,
      "id": "admin---orangehrm;creation-admin---orangehrm;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9855491000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom d utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le boutton Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2319040000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 32
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeNomDUtilisateur(String)"
});
formatter.result({
  "duration": 223363200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 201960000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 2281259900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 55553900,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Creation Admin - OrangeHRM",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "je clique sur le module Admin",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je clique sur le bouton Add",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je saisie nom employee \"Salma\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "je saisie nom d utilisateur \"userSalma\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "je saisie le mot de passe \"salmasalma\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "je saisie confirme mot de passe \"salmasalma\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "je clique sur le bouton Save",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "je verifie le nom Admin ajoute",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_module_Admin()"
});
formatter.result({
  "duration": 979672700,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_bouton_Add()"
});
formatter.result({
  "duration": 553443900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salma",
      "offset": 24
    }
  ],
  "location": "AdminStepDefinition.je_saisie_nom_employee(String)"
});
formatter.result({
  "duration": 126523200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userSalma",
      "offset": 29
    }
  ],
  "location": "AdminStepDefinition.je_saisie_nom_d_utilisateur(String)"
});
formatter.result({
  "duration": 125948800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salmasalma",
      "offset": 27
    }
  ],
  "location": "AdminStepDefinition.je_saisie_le_mot_de_passe(String)"
});
formatter.result({
  "duration": 136022000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salmasalma",
      "offset": 33
    }
  ],
  "location": "AdminStepDefinition.je_saisie_confirme_mot_de_passe(String)"
});
formatter.result({
  "duration": 116623900,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_bouton_Save()"
});
formatter.result({
  "duration": 81510600,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_verifie_le_nom_Admin_ajoute()"
});
formatter.result({
  "duration": 44400,
  "status": "passed"
});
formatter.after({
  "duration": 1705875700,
  "status": "passed"
});
formatter.before({
  "duration": 8290369900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom d utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le boutton Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 1529721600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 32
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeNomDUtilisateur(String)"
});
formatter.result({
  "duration": 235130100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 199922300,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 1589927100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 53001000,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Creation Admin - OrangeHRM",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "je clique sur le module Admin",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je clique sur le bouton Add",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je saisie nom employee \"Ridha\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "je saisie nom d utilisateur \"userRidha\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "je saisie le mot de passe \"salmasalma\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "je saisie confirme mot de passe \"salmasalma\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "je clique sur le bouton Save",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "je verifie le nom Admin ajoute",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_module_Admin()"
});
formatter.result({
  "duration": 1632538800,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_bouton_Add()"
});
formatter.result({
  "duration": 590527400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ridha",
      "offset": 24
    }
  ],
  "location": "AdminStepDefinition.je_saisie_nom_employee(String)"
});
formatter.result({
  "duration": 132124900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userRidha",
      "offset": 29
    }
  ],
  "location": "AdminStepDefinition.je_saisie_nom_d_utilisateur(String)"
});
formatter.result({
  "duration": 158327500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salmasalma",
      "offset": 27
    }
  ],
  "location": "AdminStepDefinition.je_saisie_le_mot_de_passe(String)"
});
formatter.result({
  "duration": 156889000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salmasalma",
      "offset": 33
    }
  ],
  "location": "AdminStepDefinition.je_saisie_confirme_mot_de_passe(String)"
});
formatter.result({
  "duration": 139726200,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_clique_sur_le_bouton_Save()"
});
formatter.result({
  "duration": 110149500,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.je_verifie_le_nom_Admin_ajoute()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
formatter.after({
  "duration": 1710093700,
  "status": "passed"
});
});