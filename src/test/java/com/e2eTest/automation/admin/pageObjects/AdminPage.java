package com.e2eTest.automation.admin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	String chaine = "";
	WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String MODULE_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String LIENTEXT_USERNAME_XPATH = "//*[@id=\"resultTable\"]/tbody/tr[4]/td[2]/a";
	final static String BUTTON_EDIT_ID = "btnSave";
	final static String COPY_NAME_EMPL_ID = "systemUser_employeeName_empName";
	final static String BUTTON_CANCEL_ID = "btnCancel";
	final static String BUTTON_ADD_ID = "btnAdd";
	final static String PASTE_NAME_EMPL_ID = "systemUser_employeeName_empName";
	final static String USERNAME_ID = "systemUser_userName";
	final static String PASSWORD_ID = "systemUser_password";
	final static String CONFIRM_PASSWORD_ID = "systemUser_confirmPassword";
	final static String BUTTON_SAVE = "btnSave";

	/* @FindBy */
	@FindBy(how = How.ID, using = MODULE_ADMIN_ID)
	public static WebElement moduleAdmin;
	@FindBy(how = How.XPATH, using = LIENTEXT_USERNAME_XPATH)
	public static WebElement LientextUsername;
	@FindBy(how = How.ID, using = BUTTON_EDIT_ID)
	public static WebElement buttonEdit;
	@FindBy(how = How.ID, using = COPY_NAME_EMPL_ID)
	public static WebElement copyNameEmpl;
	@FindBy(how = How.ID, using = BUTTON_CANCEL_ID)
	public static WebElement buttonCancel;
	@FindBy(how = How.ID, using = BUTTON_ADD_ID)
	public static WebElement buttonAdd;
	@FindBy(how = How.ID, using = PASTE_NAME_EMPL_ID)
	public static WebElement pasteNameEmpl;
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = CONFIRM_PASSWORD_ID)
	public static WebElement confirmPwd;
	@FindBy(how = How.ID, using = BUTTON_SAVE)
	public static WebElement buttonSave;

	/* Methods */
	public void clickModuleAdmin() {
		moduleAdmin.click();
	}

	public void clickLienTextUserName() {
		LientextUsername.click();
	}

	public void clickButtonEdit() {
		buttonEdit.click();
	}

	public void copyNameEmpl() {	
		chaine = pasteNameEmpl.getText();
	}

	public void clickButtonCancel() {
		buttonCancel.click();
	}

	public void clickButtonAdd() {
		buttonAdd.click();
	}

	public void pasteEmplName() {
		pasteNameEmpl.sendKeys(pasteNameEmpl.getText());
	}

	public void sendUserName(String user) {
		userName.sendKeys(user);
	}

	public void sendPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void sendConfirmPassword(String confirmpwd) {
		confirmPwd.sendKeys(confirmpwd);
	}

	public void clickButtonSave() {
		buttonSave.click();
	}

	public void VerifyAdminName() {

	}

}
