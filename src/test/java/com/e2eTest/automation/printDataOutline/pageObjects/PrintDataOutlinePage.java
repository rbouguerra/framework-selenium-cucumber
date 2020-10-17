package com.e2eTest.automation.printDataOutline.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrintDataOutlinePage {

	WebDriver driver;

	public PrintDataOutlinePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String FULL_NAME_ID = "userName";
	final static String EMAIL_ID = "userEmail";

	/* @FindBy */
	@FindBy(how = How.ID, using = FULL_NAME_ID)
	public static WebElement fullName;
	@FindBy(how = How.ID, using = EMAIL_ID)
	public static WebElement email;

	/* Methods */
	public void sendFullName(String name) {
		fullName.sendKeys(name);
	}
	public void sendEmail(String mail) {
		email.sendKeys(mail);
	}

}
