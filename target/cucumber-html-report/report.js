$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Autentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m autentifier",
  "id": "autentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 10058963300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Autentification - OrangeHRM",
  "description": "",
  "id": "autentification---orangehrm;autentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie userName",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le boutton Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2096237500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieUserName()"
});
formatter.result({
  "duration": 173835900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieLeMotDePasse()"
});
formatter.result({
  "duration": 144278400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 2714108200,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 40987200,
  "status": "passed"
});
formatter.after({
  "duration": 1762999700,
  "status": "passed"
});
});