package com.e2eTest.automation.seLogerDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeLogerDemoPage {

	WebDriver driver;

	public SeLogerDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String FIRST_CNX_XPATH = "//*[@id=\"espacePerso\"]/div[1]/div/button[2]";
	final static String EMAIL_ID = "input_1";
	final static String PASSWORD_XPATH = "//*[@id=\"input_2\"]";
	final static String SECOND_CNX_XPATH = "//*[@id=\"ep-modal-container\"]/div/div/div/div[2]/div[2]/form/button[2]";
	final static String START_SEARCH_XPATH = "//a[contains(text(),'Débuter une recherche')]";
	final static String NEW_SEARCH_XPATH = "final static String STARTSEARCH_XPATH = \"//a[contains(text(),'Débuter une recherche')]\";\r\n"
			+ "";
	final static String ADVANCED_SEARCH_XPATH = "//a[contains(text(),'Recherche avancée')]";
	final static String LABEL_TORENT_XPATH = "//*[@id=\"agatha_projects1603278636350_advancedSearch\"]/div/div[2]/label";
	final static String LABEL_PARKING_XPATH = "//*[@id=\"agatha_types1603278636350_advancedSearch\"]/div/div[8]/label";
	final static String MIN_BUDGET_XPATH = "//*[@id=\"agatha_price1603278636350_advancedSearch\"]/div[1]/input";
	final static String MAX_BUDGET_XPATH = "//*[@id=\"agatha_price1603278636350_advancedSearch\"]/div[2]/input";
	final static String MIN_AREA_XPATH = "//*[@id=\"agatha_surface1603278636350_advancedSearch\"]/div[1]/input";
	final static String MAX_AREA_XPATH = "//*[@id=\"agatha_surface1603278636350_advancedSearch\"]/div[2]/input";
	final static String THREE_PIECES_XPATH = "//*[@id=\"agatha_rooms1603278636350_advancedSearch\"]/div/div[3]/label";
	final static String FOUR_PIECES_XPATH = "//*[@id=\"agatha_rooms1603278636350_advancedSearch\"]/div/div[4]/label";
	final static String TWO_ROOMS_XPATH = "//*[@id=\"agatha_bedrooms1603278636350_advancedSearch\"]/div/div[2]/label";
	final static String BALCONY_XPATH = "//*[@id=\"agatha_shortcuts1603278636350_advancedSearch\"]/div/div[6]/label";
	final static String CELLAR_XPATH = "//*[@id=\"agatha_shortcuts1603278636350_advancedSearch\"]/div/div[11]/label";
	final static String AD_WITH_PHOTO_XPATH = "//*[@id=\"agatha_filters1603279958361_advancedSearch\"]/div/div[1]/label/i";
	final static String BUTTON_SEARCH_XPATH = "//*[@id=\"agatha-kgjbqy4q\"]/div[1]/div[3]/div[2]/div[2]/button";
	final static String LABEL_BUY_XPATH = "//*[@id=\"agatha_projects1603280389913_advancedSearch\"]/div/div[1]/label";
	final static String APPART_XPATH = "//*[@id=\"agatha_types1603280389913_advancedSearch\"]/div/div[1]/label";
	final static String MIN_LANDSURFACE_XPATH = "//*[@id=\"agatha_groundSurface1603280389913_advancedSearch\"]/div[1]/input";
	final static String MAX_LANDSURFACE_XPATH = "//*[@id=\"agatha_groundSurface1603280389913_advancedSearch\"]/div[2]/input";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = FIRST_CNX_XPATH)
	public static WebElement firstCnx;
	@FindBy(how = How.ID, using = EMAIL_ID)
	public static WebElement email;
	@FindBy(how = How.XPATH, using = PASSWORD_XPATH)
	public static WebElement password;
	@FindBy(how = How.XPATH, using = SECOND_CNX_XPATH)
	public static WebElement secondCnx;
	@FindBy(how = How.XPATH, using = START_SEARCH_XPATH)
	public static WebElement startSearch;
	@FindBy(how = How.XPATH, using = NEW_SEARCH_XPATH)
	public static WebElement newSearch;
	@FindBy(how = How.XPATH, using = ADVANCED_SEARCH_XPATH)
	public static WebElement advancedSearch;
	@FindBy(how = How.XPATH, using = LABEL_TORENT_XPATH)
	public static WebElement torent;
	@FindBy(how = How.XPATH, using = LABEL_PARKING_XPATH)
	public static WebElement parking;
	@FindBy(how = How.XPATH, using = MIN_BUDGET_XPATH)
	public static WebElement minBudget;
	@FindBy(how = How.XPATH, using = MAX_BUDGET_XPATH)
	public static WebElement maxBudget;
	@FindBy(how = How.XPATH, using = MIN_AREA_XPATH)
	public static WebElement minArea;
	@FindBy(how = How.XPATH, using = MAX_AREA_XPATH)
	public static WebElement maxArea;
	@FindBy(how = How.XPATH, using = THREE_PIECES_XPATH)
	public static WebElement threePieces;
	@FindBy(how = How.XPATH, using = FOUR_PIECES_XPATH)
	public static WebElement fourPieces;
	@FindBy(how = How.XPATH, using = TWO_ROOMS_XPATH)
	public static WebElement twoRooms;
	@FindBy(how = How.XPATH, using = BALCONY_XPATH)
	public static WebElement balcony;
	@FindBy(how = How.XPATH, using = CELLAR_XPATH)
	public static WebElement cellar;
	@FindBy(how = How.XPATH, using = AD_WITH_PHOTO_XPATH)
	public static WebElement adWithPhoto;
	@FindBy(how = How.XPATH, using = BUTTON_SEARCH_XPATH)
	public static WebElement buttonSearch;
	@FindBy(how = How.XPATH, using = LABEL_BUY_XPATH)
	public static WebElement buy;
	@FindBy(how = How.XPATH, using = APPART_XPATH)
	public static WebElement appart;
	@FindBy(how = How.XPATH, using = MIN_LANDSURFACE_XPATH)
	public static WebElement minLandSurface;
	@FindBy(how = How.XPATH, using = MAX_LANDSURFACE_XPATH)
	public static WebElement maxLandSurface;

	/* Methods */
	public void clickFirstConnexion() {
		firstCnx.click();
	}

	public void sendEmail() {
		email.sendKeys("bouguerraridha@gmail.com");
	}

	public void sendPassword() {
		password.sendKeys("test1234A+");
	}

	public void clickSecondConnexion() {
		secondCnx.click();
	}

	public void clickStartSearch() {
		startSearch.click();
	}

	public void clickNewSearch() {
		newSearch.click();
	}

	public void clickAdvancedSearch() {
		advancedSearch.click();
	}

	public void clickToRent() {
		torent.click();
	}

	public void clickParking() {
		parking.click();
	}

	public void sendMinBudget(String minbudget) {
		minBudget.sendKeys(minbudget);
	}

	public void sendMaxBudget(String maxbudget) {
		maxBudget.sendKeys(maxbudget);
	}

	public void sendMinArea(String minarea) {
		minArea.sendKeys(minarea);
	}

	public void sendMaxArea(String maxarea) {
		maxArea.sendKeys(maxarea);
	}

	public void clicThreePieces() {
		threePieces.click();
	}

	public void clickFourPieces() {
		fourPieces.click();
	}

	public void clickTwoRooms() {
		twoRooms.click();
	}

	public void clickBalcony() {
		balcony.click();
	}

	public void clickCellars() {
		cellar.click();
	}

	public void clickAdWithPhoto() {
		adWithPhoto.click();
	}

	public void clickButtonSearch() {
		buttonSearch.click();
	}

	public void clickBuy() {
		buy.click();
	}

	public void clickApartment() {
		appart.click();
	}
	
	public void sendMinLandSurface(String minlandsurf) {
		minLandSurface.sendKeys(minlandsurf);
	}

	public void sendMaxLandSurface(String maxlandsurf) {
		maxLandSurface.sendKeys(maxlandsurf);
	}
}
