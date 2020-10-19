package com.e2eTest.automation.authentificationParam.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.authentificationParam.pageObjects.AuthentificationParamPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.When;

public class AuthentificationParamStepDefinition {

	public WebDriver driver;

	private AuthentificationParamPage authentificationParamPage = new AuthentificationParamPage(driver);

	public AuthentificationParamStepDefinition() {
		driver = Setup.driver;
	}

	@When("^Je saisie le nom d utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeNomDUtilisateur(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationParamPage.class);
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationParamPage.sendUserName(name);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pwd) throws Throwable {
		authentificationParamPage.sendPassword(pwd);
	}

	@When("^Je clique sur le module Buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		authentificationParamPage.clickModuleBuzz();
	}

	@When("^Je clique sur le module Temps$")
	public void jeCliqueSurLeModuleTemps() throws Throwable {
		authentificationParamPage.clickModuleTime();
	}

}
