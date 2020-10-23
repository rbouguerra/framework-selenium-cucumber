package com.e2eTest.automation.seLogerDemo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.seLogerDemo.pageObjects.SeLogerDemoPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeLogerDemoStepDefinition {

	public WebDriver driver;

	private SeLogerDemoPage seLogerDemoPage = new SeLogerDemoPage(driver);

	public SeLogerDemoStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J ouvre l application SeLoger$")
	public void j_ouvre_l_application_SeLoger() throws Throwable {
		driver.get("https://www.seloger.com/");
	}

	@When("^Je clique sur se connecter$")
	public void je_clique_sur_se_connecter() throws Throwable {
		PageFactory.initElements(driver, SeLogerDemoPage.class);
		seLogerDemoPage.clickFirstConnexion();
	}

	@When("^Je saisie l email$")
	public void je_saisie_l_email() throws Throwable {
		seLogerDemoPage.sendEmail();
	}

	@When("^Je saisie mot de passe")
	public void je_saisie_mot_de_passe() throws Throwable {
		seLogerDemoPage.sendPassword();
	}
	
	@When("^Je clique sur le bouton se connecter$")
	public void je_clique_sur_le_bouton_se_connecter() throws Throwable {
		seLogerDemoPage.clickSecondConnexion();
	}

	@Then("^Redirection vers la page home$")
	public void redirection_vers_la_page_home() throws Throwable {

	}

	@When("^Je clique sur debuter une recherche$")
	public void je_clique_sur_debuter_une_recherche() throws Throwable {
		seLogerDemoPage.clickStartSearch();
	}

	@When("^je clique sur le bouton nouvelle recherche$")
	public void je_clique_sur_le_bouton_nouvelle_recherche() throws Throwable {
		seLogerDemoPage.clickNewSearch();
	}

	@When("^je clique sur recherche avancee$")
	public void je_clique_sur_recherche_avancee() throws Throwable {
		seLogerDemoPage.clickAdvancedSearch();
	}

	@When("^je clique sur louer$")
	public void je_clique_sur_louer() throws Throwable {
		seLogerDemoPage.clickToRent();
	}

	@When("^je clique sur parking/box$")
	public void je_clique_sur_parking_box() throws Throwable {
		seLogerDemoPage.clickParking();
	}

	@When("^je saisie un budget minimun \"([^\"]*)\"$")
	public void je_saisie_un_budget_minimun(String minbudget) throws Throwable {
		seLogerDemoPage.sendMinBudget(minbudget);
	}

	@When("^je saisie un budget maximum \"([^\"]*)\"$")
	public void je_saisie_un_budget_maximum(String maxbudget) throws Throwable {
		seLogerDemoPage.sendMaxBudget(maxbudget);
	}

	@When("^je saisie la surface minimun \"([^\"]*)\"$")
	public void je_saisie_la_surface_minimun(String minarea) throws Throwable {
		seLogerDemoPage.sendMinArea(minarea);
	}

	@When("^je saisie la surface maximum \"([^\"]*)\"$")
	public void je_saisie_la_surface_maximum(String maxarea) throws Throwable {
		seLogerDemoPage.sendMaxArea(maxarea);
	}

	@When("^je clique sur trois pieces$")
	public void je_clique_sur_trois_pieces() throws Throwable {
		seLogerDemoPage.clicThreePieces();
	}

	@When("^je clique sur quatre pieces$")
	public void je_clique_sur_quatre_pieces() throws Throwable {
		seLogerDemoPage.clickFourPieces();
	}

	@When("^je clique sur deux chambres$")
	public void je_clique_sur_deux_chambres() throws Throwable {
		seLogerDemoPage.clickTwoRooms();
	}

	@When("^je clique sur balcon$")
	public void je_clique_sur_balcon() throws Throwable {
		seLogerDemoPage.clickBalcony();
	}

	@When("^je clique sur cave$")
	public void je_clique_sur_cave() throws Throwable {
		seLogerDemoPage.clickCellars();
	}

	@When("^je clique sur annonce avec photo$")
	public void je_clique_sur_annonce_avec_photo() throws Throwable {
		seLogerDemoPage.clickAdWithPhoto();
	}

	@Then("^je clique sur le bouton rechercher$")
	public void je_clique_sur_le_bouton_rechercher() throws Throwable {
		seLogerDemoPage.clickButtonSearch();
	}

	@When("^je clique sur acheter$")
	public void je_clique_sur_acheter() throws Throwable {
		seLogerDemoPage.clickBuy();
	}

	@When("^je clique sur appartement$")
	public void je_clique_sur_appartement() throws Throwable {
		seLogerDemoPage.clickApartment();
	}

	@When("^je saisie la surface minimale \"([^\"]*)\"$")
	public void je_saisie_la_surface_minimale(String minarea) throws Throwable {
		seLogerDemoPage.sendMinArea(minarea);
	}

	@When("^je saisie la surface maximale \"([^\"]*)\"$")
	public void je_saisie_la_surface_maximale(String maxarea) throws Throwable {
		seLogerDemoPage.sendMaxArea(maxarea);
	}

	@When("^je saisie la surface minimale du terrain \"([^\"]*)\"$")
	public void je_saisie_la_surface_minimale_du_terrain(String minlandsurf) throws Throwable {
		seLogerDemoPage.sendMinLandSurface(minlandsurf);
	}

	@When("^je saisie la surface maximale du terrain \"([^\"]*)\"$")
	public void je_saisie_la_surface_maximale_du_terrain(String maxlandsurf) throws Throwable {
		seLogerDemoPage.sendMaxLandSurface(maxlandsurf);
	}

}
