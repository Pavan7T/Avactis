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
}
