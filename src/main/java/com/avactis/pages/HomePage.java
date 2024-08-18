package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement signbtn;

	@FindBy(xpath = "// a[text()='My Account']")
	private WebElement myAccount;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public SignInPage signIn() {
		waitForElementToBeVisible(signbtn).click();
		return new SignInPage(driver);
	}

}
