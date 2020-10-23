package com.e2eTest.automation.altranWebSite.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.altranWebSite.PageObjects.AltranWebSitePage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AltranWebSiteStepDefinition {

	public WebDriver driver;
	
	private AltranWebSitePage altranWebSitePage = new AltranWebSitePage(driver);
	
	public AltranWebSiteStepDefinition() {
		
		driver = Setup.driver;
	}

	@Given("^J ouvre le site web$")
	public void j_ouvre_le_site_web() throws Throwable {
		driver.get("https://www.altran.com/fr/fr/");
	}

	@When("^Je clique sur postulez maintenant$")
	public void je_clique_sur_postulez_maintenant() throws Throwable {
		PageFactory.initElements(driver, AltranWebSitePage.class);
		altranWebSitePage.clickFirstApplyNow();
	}

	@When("^Je clique sur l offre ingenieur en automatisation de test$")
	public void je_clique_sur_l_offre_ingenieur_en_automatisation_de_test() throws Throwable {
		altranWebSitePage.clickNameOfPost();
	}

	@When("^Je clique sur postuler maintenant$")
	public void je_clique_sur_postuler_maintenant() throws Throwable {
		altranWebSitePage.clickSecondApplyNow();
	}

	@When("^Je clique sur le lien remplissez manuellement votre profil$")
	public void je_clique_sur_le_lien_remplissez_manuellement_votre_profil() throws Throwable {
		altranWebSitePage.clickManuallyFill();
	}

	@Then("^Redirection vers la page de profil pour la remplir$")
	public void redirection_vers_la_page_de_profil_pour_la_remplir() throws Throwable {

	}

	@When("^Je clique sur la case a cocher je ne suis pas un robot$")
	public void je_clique_sur_la_case_a_cocher_je_ne_suis_pas_un_robot() throws Throwable {
		altranWebSitePage.clickRobot();
	}

	@When("^Je selectionne le titre \"([^\"]*)\"$")
	public void je_selectionne_le_titre(String head) throws Throwable {
		altranWebSitePage.selectTitre(head);
	}

	@When("^Je saisie le nom \"([^\"]*)\"$")
	public void je_saisie_le_nom(String arg1) throws Throwable {

	}

	@When("^Je saisie le prenom \"([^\"]*)\"$")
	public void je_saisie_le_prenom(String arg1) throws Throwable {

	}

	@When("^Je saisie l email \"([^\"]*)\"$")
	public void je_saisie_l_email(String arg1) throws Throwable {

	}

	@When("^Je saisie l adresse \"([^\"]*)\"$")
	public void je_saisie_l_adresse(String arg1) throws Throwable {

	}

	@When("^Je saisie le complement d adresse \"([^\"]*)\"$")
	public void je_saisie_le_complement_d_adresse(String arg1) throws Throwable {

	}

	@When("^Je saisie le code postal \"([^\"]*)\"$")
	public void je_saisie_le_code_postal(String arg1) throws Throwable {

	}

	@When("^Je saisie la ville \"([^\"]*)\"$")
	public void je_saisie_la_ville(String arg1) throws Throwable {

	}

	@When("^Je selectionne le pays \"([^\"]*)\"$")
	public void je_selectionne_le_pays(String arg1) throws Throwable {

	}

	@When("^Je saisie la region \"([^\"]*)\"$")
	public void je_saisie_la_region(String arg1) throws Throwable {

	}

	@When("^Je saisie le numero de telephone fixe \"([^\"]*)\"$")
	public void je_saisie_le_numero_de_telephone_fixe(String arg1) throws Throwable {

	}

	@When("^Je saisie le numero de telephone portable \"([^\"]*)\"$")
	public void je_saisie_le_numero_de_telephone_portable(String arg1) throws Throwable {

	}

	@When("^Je clique sur parcourir pour joindre un CV$")
	public void je_clique_sur_parcourir_pour_joindre_un_CV() throws Throwable {

	}

	@When("^Je saisie la date de naissance \"([^\"]*)\"$")
	public void je_saisie_la_date_de_naissance(String arg1) throws Throwable {

	}

	@When("^Je selectionne le nombre d annee d experience$")
	public void je_selectionne_le_nombre_d_annee_d_experience() throws Throwable {

	}

	@When("^Je selectionne la nationalite$")
	public void je_selectionne_la_nationalite() throws Throwable {

	}

	@When("^Je clique sur le bouton ajouter un secteur$")
	public void je_clique_sur_le_bouton_ajouter_un_secteur() throws Throwable {

	}

	@When("^Je selectionne le secteur$")
	public void je_selectionne_le_secteur() throws Throwable {

	}

	@When("^Je clique sur le bouton ajouter experience$")
	public void je_clique_sur_le_bouton_ajouter_experience() throws Throwable {

	}

	@When("^Je saisie le nom d entreprise \"([^\"]*)\"$")
	public void je_saisie_le_nom_d_entreprise(String arg1) throws Throwable {

	}

	@When("^Je saisie le poste \"([^\"]*)\"$")
	public void je_saisie_le_poste(String arg1) throws Throwable {

	}

	@When("^Je saisie la date de debut d experience \"([^\"]*)\"$")
	public void je_saisie_la_date_de_debut_d_experience(String arg1) throws Throwable {

	}

	@When("^Je selectionne le pays$")
	public void je_selectionne_le_pays() throws Throwable {

	}

	@When("^Je saisie la date de fin d experience \"([^\"]*)\"$")
	public void je_saisie_la_date_de_fin_d_experience(String arg1) throws Throwable {

	}

	@When("^Je clique sur le bouton radio encore en poste ou non$")
	public void je_clique_sur_le_bouton_radio_encore_en_poste_ou_non() throws Throwable {

	}

	@When("^je saisis la description de poste \"([^\"]*)\"$")
	public void je_saisis_la_description_de_poste(String arg1) throws Throwable {

	}

	@When("^Je saisie le type de poste souhaite \"([^\"]*)\"$")
	public void je_saisie_le_type_de_poste_souhaite(String arg1) throws Throwable {

	}

	@When("^Je selectionne le type de contrat souhaite \"([^\"]*)\"$")
	public void je_selectionne_le_type_de_contrat_souhaite(String typeContrat) throws Throwable {
		altranWebSitePage.selectTypeOfContrat(typeContrat);
	}

	@When("^Je saisie la date de disponibilite \"([^\"]*)\"$")
	public void je_saisie_la_date_de_disponibilite(String arg1) throws Throwable {

	}

	@When("^Je selectionne le preavis \"([^\"]*)\"$")
	public void je_selectionne_le_preavis(String priornotice) throws Throwable {
		altranWebSitePage.selectPriorNotice(priornotice);
	}

	@When("^Je clique sur ajouter formation$")
	public void je_clique_sur_ajouter_formation() throws Throwable {

	}

	@When("^Je selectionne le pays d etude$")
	public void je_selectionne_le_pays_d_etude() throws Throwable {

	}

	@When("^Je selectionne le niveau de diplome$")
	public void je_selectionne_le_niveau_de_diplome() throws Throwable {

	}

	@When("^Je saisie l annee de diplome \"([^\"]*)\"$")
	public void je_saisie_l_annee_de_diplome(String arg1) throws Throwable {

	}

	@When("^Je selectionne la langue maternelle$")
	public void je_selectionne_la_langue_maternelle() throws Throwable {

	}

	@When("^Je selectionne autres langues$")
	public void je_selectionne_autres_langues() throws Throwable {

	}

	@When("^Je clique sur selectionner$")
	public void je_clique_sur_selectionner() throws Throwable {

	}

	@When("^Je clique sur ajouter remuneration$")
	public void je_clique_sur_ajouter_remuneration() throws Throwable {

	}

	@When("^je saisis le salaire fixe actuel \"([^\"]*)\"$")
	public void je_saisis_le_salaire_fixe_actuel(String arg1) throws Throwable {

	}

	@When("^je saisis le salaire fixe souhaite \"([^\"]*)\"$")
	public void je_saisis_le_salaire_fixe_souhaite(String arg1) throws Throwable {

	}

	@When("^Je clique sur parcourir pour joindre une lettre de motivation$")
	public void je_clique_sur_parcourir_pour_joindre_une_lettre_de_motivation() throws Throwable {

	}

	@When("^Je clique sur le bouton envoyer$")
	public void je_clique_sur_le_bouton_envoyer() throws Throwable {

	}

	@Then("^Redirection vers une autre page$")
	public void redirection_vers_une_autre_page() throws Throwable {

	}

}
