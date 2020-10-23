package com.e2eTest.automation.altranWebSite.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AltranWebSitePage {

	WebDriver driver;

	public AltranWebSitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String First_APPLY_NOW_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/section[1]/ul[1]/li[3]/div[1]/a[1]";
	final static String NAME_OF_POST_XPATH = "//*[@id=\"UL_JOB_LIST\"]/li[6]/div/a";
	final static String SECOND_APPLY_NOW_ID = "btnApply_top";
	final static String MANUALLY_FILL_ID = "TM_LOGINFRAME_HAVE_CV_V1";
	final static String ROBOT_XPATH = "//*[@id=\"recaptcha-anchor\"]/div[1]";
	final static String TITRE_ID = "df_fldFieldEMPGENDER";
	final static String LAST_NAME_ID = "df_fldFieldEMPLASTNAME";
	final static String FIRST_NAME_ID = "df_fldFieldEMPFIRSTNAME";
	final static String EMAIL_ID = "df_fldFieldEMPEMAIL";
	final static String ADRESS_ID = "df_fldFieldEMPADDRESS";
	final static String ADDITIONAL_ADRESS_ID = "df_fldFieldEMPADDITIONINFO";
	final static String POSTAL_CODE_ID = "df_fldFieldEMPPOSTALCODE";
	final static String CITY_ID = "df_fldFieldEMPCITY";
	final static String COUNTRY_ID = "df_fldFieldEMPCOUNTRY";
	final static String REGION_ID = "df_fldFieldEMPPROVINCE";
	final static String PHONE_ID = "df_fldFieldEMPPHONE";
	final static String CELL_PHONE_ID = "df_fldFieldEMPCELLULAR";
	final static String BROWSE_BUTTON_CV_ID = "df_fldFieldINFOCVF";
	final static String DATE_OF_BIRTH_ID = "df_fldFieldINFOBIRTHDATE";
	final static String NUMBER_OF_YEARS_OF_EXPR_ID = "df_fldFieldDYNFIELDCOMBOBOX3";
	final static String NATIONALITY_ID = "divLabelEMPCITIZEN920";
	final static String BUTTON_ADD_SECTOR_ID = "DYN_ADD_EMPLOYEES_DYN_CAT_2";
	final static String SECTOR_ID = "df_fldFieldDYNFIELDCOMBOBOX1_1";
	final static String BUTTON_ADD_EXPR_ID = "DYN_ADD_WORKHIST_E";
	final static String NAME_COMPANY_ID = "df_fldFieldWORKEGROUP_1";
	final static String POST_ID = "df_fldFieldWORKELASTPOS_1";
	final static String START_DATE_ID = "df_fldFieldWORKESTARTDATE_1";
	final static String COUNTRY_EXPERIENCE_ID = "df_fldFieldWORKECOUNTRYID_1";
	final static String END_DATE_EXPERIENCE_ID = "df_fldFieldWORKEENDDATE_1";
	final static String STILL_IN_POSITION_ID = "lbl_df_fldFieldWORKEMANAGEMENTLVL_1_1";
	final static String JOB_SPECIFICATION_ID = "df_fldFieldWORKEOTHERFUNC_1";
	final static String DESIRED_POSITION_ID = "df_fldFieldDYNFIELDTEXTAREA4";
	final static String TYPE_OF_CONTRACT_ID = "df_fldFieldDYNFIELDCOMBOBOX_SYSTEM6";
	final static String AVAILABILITY_DATE_ID = "df_fldFieldDYNFIELDDATE1";
	final static String PRIOR_NOTICE_ID = "df_fldFieldDYNFIELDCOMBOBOX2";
	final static String ADD_BUTTON_TRAINING_ID = "DYN_ADD_FORMAL";
	final static String STUDY_COUNTRIES_ID = "df_fldFieldGRADUATEDISCIPLINE_1";
	final static String DIPLOMA_LEVEL_ID = "df_fldFieldGRADUATEDIPLOMALEVEL_1";
	final static String DIPLOMA_YEAR_ID = "df_fldFieldGRADUATECERTIFICATE_1";
	final static String MOTHER_TONGUE_ID = "fldNativeLanguage";
	final static String OTHER_LANGUAGE_ID = "fldLanguagesAdd";
	final static String SELECT_BUTTON_XPATH = "//*[@id=\"tdLanguages\"]/div[1]/div[2]/div[2]/div[2]/button";
	final static String ADD_REMUNERATION_ID = "DYN_ADD_REMUNERATIONS";
	final static String FIXED_SALARY_ID = "df_fldFieldMNREMREFCOUNTRYSALARY_1";
	final static String DESIRED_FIXED_SALARY_ID = "df_fldFieldMNREMMOBILITYPREMIUM_1";
	final static String ATTACH_A_LETTER_OF_MOTIVATION_ID = "df_fldFieldINFOCOMPLETTERFILE";
	final static String BUTTON_SAVE_ID = "btnsave";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = First_APPLY_NOW_XPATH)
	public static WebElement firstApplyNow;
	@FindBy(how = How.XPATH, using = NAME_OF_POST_XPATH)
	public static WebElement nameOfPost;
	@FindBy(how = How.ID, using = SECOND_APPLY_NOW_ID)
	public static WebElement secondApplyNow;
	@FindBy(how = How.ID, using = MANUALLY_FILL_ID)
	public static WebElement manuallyFill;
	@FindBy(how = How.XPATH, using = ROBOT_XPATH)
	public static WebElement robot;
	@FindBy(how = How.ID, using = TITRE_ID)
	public static WebElement titre;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = EMAIL_ID)
	public static WebElement email;
	@FindBy(how = How.ID, using = ADRESS_ID)
	public static WebElement adress;
	@FindBy(how = How.ID, using = ADDITIONAL_ADRESS_ID)
	public static WebElement additionalAdress;
	@FindBy(how = How.ID, using = POSTAL_CODE_ID)
	public static WebElement postalCode;
	@FindBy(how = How.ID, using = CITY_ID)
	public static WebElement city;
	@FindBy(how = How.ID, using = COUNTRY_ID)
	public static WebElement country;
	@FindBy(how = How.ID, using = REGION_ID)
	public static WebElement region;
	@FindBy(how = How.ID, using = PHONE_ID)
	public static WebElement phone;
	@FindBy(how = How.ID, using = CELL_PHONE_ID)
	public static WebElement cellPhone;
	@FindBy(how = How.ID, using = BROWSE_BUTTON_CV_ID)
	public static WebElement browseButtonCv;
	@FindBy(how = How.ID, using = DATE_OF_BIRTH_ID)
	public static WebElement dateOfBirth;
	@FindBy(how = How.ID, using = NUMBER_OF_YEARS_OF_EXPR_ID)
	public static WebElement numberOfYearsOfExpr;
	@FindBy(how = How.ID, using = NATIONALITY_ID)
	public static WebElement nationality;
	@FindBy(how = How.ID, using = BUTTON_ADD_SECTOR_ID)
	public static WebElement buttonAddSector;
	@FindBy(how = How.ID, using = SECTOR_ID)
	public static WebElement sector;
	@FindBy(how = How.ID, using = BUTTON_ADD_EXPR_ID)
	public static WebElement buttonAddExpr;
	@FindBy(how = How.ID, using = NAME_COMPANY_ID)
	public static WebElement nameCompany;
	@FindBy(how = How.ID, using = POST_ID)
	public static WebElement post;
	@FindBy(how = How.ID, using = START_DATE_ID)
	public static WebElement startDate;
	@FindBy(how = How.ID, using = COUNTRY_EXPERIENCE_ID)
	public static WebElement countryExpr;
	@FindBy(how = How.ID, using = END_DATE_EXPERIENCE_ID)
	public static WebElement endDateExpr;
	@FindBy(how = How.ID, using = STILL_IN_POSITION_ID)
	public static WebElement stillInPosition;
	@FindBy(how = How.ID, using = JOB_SPECIFICATION_ID)
	public static WebElement jobSpec;
	@FindBy(how = How.ID, using = DESIRED_POSITION_ID)
	public static WebElement desiredPosition;
	@FindBy(how = How.ID, using = TYPE_OF_CONTRACT_ID)
	public static WebElement typeOfContrat;
	@FindBy(how = How.ID, using = AVAILABILITY_DATE_ID)
	public static WebElement availabilityDt;
	@FindBy(how = How.ID, using = PRIOR_NOTICE_ID)
	public static WebElement priorNotice;
	@FindBy(how = How.ID, using = ADD_BUTTON_TRAINING_ID)
	public static WebElement addButtonTraining;
	@FindBy(how = How.ID, using = STUDY_COUNTRIES_ID)
	public static WebElement studyCountries;
	@FindBy(how = How.ID, using = DIPLOMA_LEVEL_ID)
	public static WebElement diplomaLevel;
	@FindBy(how = How.ID, using = DIPLOMA_YEAR_ID)
	public static WebElement diplomaYear;
	@FindBy(how = How.ID, using = MOTHER_TONGUE_ID)
	public static WebElement motherTongue;
	@FindBy(how = How.ID, using = OTHER_LANGUAGE_ID)
	public static WebElement otherLanguage;
	@FindBy(how = How.XPATH, using = SELECT_BUTTON_XPATH)
	public static WebElement selectButton;
	@FindBy(how = How.ID, using = ADD_REMUNERATION_ID)
	public static WebElement addRemuneration;
	@FindBy(how = How.ID, using = FIXED_SALARY_ID)
	public static WebElement fixedSalary;
	@FindBy(how = How.ID, using = DESIRED_FIXED_SALARY_ID)
	public static WebElement desiredFixedSalary;
	@FindBy(how = How.ID, using = ATTACH_A_LETTER_OF_MOTIVATION_ID)
	public static WebElement attachAletterOfMotivation;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement buttonSave;
	
	/* Methods */
	public void clickFirstApplyNow() {
		firstApplyNow.click();
	}

	public void clickNameOfPost() {
		nameOfPost.click();
	}
	
	public void clickSecondApplyNow() {
		secondApplyNow.click();
	}
	
	public void clickManuallyFill() {
		manuallyFill.click();
	}
	
	public void clickRobot() {
		robot.click();
	}
	
	public void selectTitre(String head) {
		Select selectBox = new Select(titre);
	    selectBox.selectByValue(head);
		
	}
	
	public void sendLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void sendFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void sendEmail(String mail) {
		email.sendKeys(mail);
	}

	public void sendAdress(String adr) {
		adress.sendKeys(adr);
	}

	public void sendAdditionalAdress(String additionaladress) {
		additionalAdress.sendKeys(additionaladress);
	}

	public void sendPostalCode(String postalcode) {
		postalCode.sendKeys(postalcode);
	}

	public void sendCity(String town) {
		city.sendKeys(town);
	}

	public void sendCountry(String land) {
		country.sendKeys(land);
	}
	
	public void sendRegion(String district) {
		region.sendKeys(district);
	}

	public void sendPhone(String homePhone) {
		phone.sendKeys(homePhone);
	}

	public void sendCellPhone(String cellphone) {
		cellPhone.sendKeys(cellphone);
	}

	public void clickBrowseButtonCv() {
		browseButtonCv.click();
	}
	
	public void sendDateOfBirth(String dateofBirth) {
		dateOfBirth.sendKeys(dateofBirth);
	}
	
	public void selectNumberOfYearsOfExpr() {
		numberOfYearsOfExpr.isSelected();
	}
	
	public void selectNationality() {
		nationality.isSelected();
	}
	
	public void clickButtonAddSectorCv() {
		buttonAddSector.click();
	}
	
	public void selectSector() {
		sector.isSelected();
	}
	
	public void clickButtonAddExpr() {
		buttonAddExpr.click();
	}
	
	public void sendNameCompany(String namecompany) {
		nameCompany.sendKeys(namecompany);
	}
	
	public void sendPost(String namepost) {
		post.sendKeys(namepost);
	}
	
	public void sendStartDate(String startDt) {
		startDate.sendKeys(startDt);
	}
	
	public void selectCountryExpr() {
		countryExpr.isSelected();
	}
	
	public void sendEndDateExpr(String endDtExpr) {
		endDateExpr.sendKeys(endDtExpr);
	}
	
	public void clickStillInPosition() {
		stillInPosition.click();
	}
	
	public void sendJobSpec(String jobspec) {
		jobSpec.sendKeys(jobspec);
	}
	
	public void sendDesiredPosition(String desiredposition) {
		desiredPosition.sendKeys(desiredposition);
	}
	
	public void selectTypeOfContrat(String typeContrat) {
		Select selectBox = new Select(typeOfContrat);
	    selectBox.selectByValue(typeContrat);
		
	}
	
	public void sendAvailabilityDt(String availabilityDate) {
		availabilityDt.sendKeys(availabilityDate);
	}
	
	public void selectPriorNotice(String priornotice) {
		// final
		Select selectBox = new Select(priorNotice);
	    selectBox.selectByValue(priornotice);
	}
}
