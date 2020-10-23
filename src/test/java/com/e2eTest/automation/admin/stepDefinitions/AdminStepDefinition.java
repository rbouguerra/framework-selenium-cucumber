package com.e2eTest.automation.admin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.admin.pageObjects.AdminPage;
import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition {

	public WebDriver driver;

	private AdminPage adminPage = new AdminPage(driver);

	public AdminStepDefinition() {
		driver = Setup.driver;
	}

	@When("^je clique sur le module Admin$")
	public void je_clique_sur_le_module_Admin() throws Throwable {
		PageFactory.initElements(driver, AdminPage.class);
		PageFactory.initElements(driver, AuthentificationPage.class);
		adminPage.clickModuleAdmin();
	}

	@When("^je clique sur un nom d utilisateur affiché dans le tableau$")
	public void je_clique_sur_un_nom_d_utilisateur_affiché_dans_le_tableau() throws Throwable {
		adminPage.clickLienTextUserName();
	}

	@When("^je clique sur le bouton Edit$")
	public void je_clique_sur_le_bouton_Edit() throws Throwable {
		adminPage.clickButtonEdit();
	}

	@When("^je copie le contenu nom employee$")
	public void je_copie_le_contenu_nom_employee() throws Throwable {
		adminPage.copyNameEmpl();
	}

	@When("^je clique sur le bouton Cancel$")
	public void je_clique_sur_le_bouton_Cancel() throws Throwable {
		adminPage.clickButtonCancel();
	}

	@When("^je clique sur le bouton Add$")
	public void je_clique_sur_le_bouton_Add() throws Throwable {
		adminPage.clickButtonAdd();
	}

	@When("^je colle nom employee$")
	public void je_colle_nom_employee() throws Throwable {
		adminPage.pasteEmplName();
	}

	@When("^je saisie nom d utilisateur \"([^\"]*)\"$")
	public void je_saisie_nom_d_utilisateur(String user) throws Throwable {
		adminPage.sendUserName(user);
	}

	@When("^je saisie le mot de passe \"([^\"]*)\"$")
	public void je_saisie_le_mot_de_passe(String pwd) throws Throwable {
		adminPage.sendPassword(pwd);
	}

	@When("^je saisie confirme mot de passe \"([^\"]*)\"$")
	public void je_saisie_confirme_mot_de_passe(String confirmpwd) throws Throwable {
		adminPage.sendConfirmPassword(confirmpwd);
	}

	@When("^je clique sur le bouton Save$")
	public void je_clique_sur_le_bouton_Save() throws Throwable {
		adminPage.clickButtonSave();
	}

	@Then("^je verifie le nom Admin ajoute$")
	public void je_verifie_le_nom_Admin_ajoute() throws Throwable {

	}
}
