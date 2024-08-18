package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;
import com.avactis.utils.Constants;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SignInPage extends BasePage {

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerBtn;

	@FindBy(xpath = "//input[@id='account_sign_in_form_email_id']")
	private WebElement signInEmail;

	@FindBy(xpath = "//input[@id='account_sign_in_form_passwd_id']")
	private WebElement signInPassword;

	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement submit;

	@FindBy(xpath = "//div[text()='Account and password could not be identified. Try again or create an account.']")
	private WebElement signinfailmsg;

	public SignInPage(WebDriver driver) {
		super(driver);

	}

	public String titleCheck() {
		String HomePageTilte = getCurrentPageTitle();
		System.out.println("HomePageTilte: " + HomePageTilte);
		return HomePageTilte;
	}

	public RegistrationFormPage registeruser() {
		clickElement(waitForElementToBeVisible(registerBtn));
		return new RegistrationFormPage(driver);
	}

	public UserSignInPage oldUserSignIn() {
		enterText(signInEmail, Constants.EMAIL);
		enterText(signInPassword, Constants.REG_PASSWORD);
		clickElement(waitForElementToBeVisible(submit));
		return new UserSignInPage(driver);
	}

	public WebElement UserSignIn_negativecase() {
		enterText(signInEmail, Constants.NU_EMAIL);
		enterText(signInPassword, Constants.NU_REG_PASSWORD);
		clickElement(waitForElementToBeVisible(submit));
		isElementDisplayed(signinfailmsg);
		return signinfailmsg;
	}
}
