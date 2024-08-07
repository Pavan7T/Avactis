package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement signbtn;

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	public void signIn() {
		waitForElementToBeVisible(signbtn);
	}

}
