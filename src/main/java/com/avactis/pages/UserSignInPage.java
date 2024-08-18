package com.avactis.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;
import com.avactis.utils.Constants;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UserSignInPage extends BasePage {

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerBtn;

	@FindBy(className = "orders_search1")
	private WebElement orderHeading;

	public UserSignInPage(WebDriver driver) {
		super(driver);

	}

	public String verifyUserloggedIn() {
		isElementDisplayed(orderHeading);
		String actualText = getElementText(orderHeading);
		return actualText;

		// return cartLogo;
	}

}
