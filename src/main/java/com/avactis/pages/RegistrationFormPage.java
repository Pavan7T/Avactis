package com.avactis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;
import com.avactis.utils.Constants;

public class RegistrationFormPage extends BasePage {

	@FindBy(xpath = "//input[@name='customer_info[Customer][Email]']")
	private WebElement Email;

	@FindBy(xpath = "//input[@name='customer_info[Customer][Password]']")
	private WebElement Password;

	@FindBy(xpath = "//input[@name='customer_info[Customer][RePassword]']")
	private WebElement RePassword;

	@FindBy(xpath = "//input[@name='customer_info[Customer][FirstName]']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@name='customer_info[Customer][LastName]']")
	private WebElement LastName;

	@FindBy(xpath = "//select[@name='customer_info[Customer][Country]']")
	private WebElement Country;

	@FindBy(xpath = "//option[text()='India']")
	private WebElement INDCountry;

	@FindBy(xpath = "//select[@name='customer_info[Customer][State]']")
	private WebElement State;

	@FindBy(xpath = "//option[text()='Maharashtra']")
	private WebElement MHState;

	@FindBy(xpath = "//input[@name='customer_info[Customer][ZipCode]']")
	private WebElement ZipCode;

	@FindBy(xpath = "//input[@name='customer_info[Customer][City]']")
	private WebElement City;

	@FindBy(xpath = "//input[@name='customer_info[Customer][Streetline1]']")
	private WebElement Streetline1;

	@FindBy(xpath = "//input[@name='customer_info[Customer][Streetline2]']")
	private WebElement Streetline2;

	@FindBy(xpath = "//input[@name='customer_info[Customer][Phone]']")
	private WebElement Phone;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement Register;

	@FindBy(xpath = "//div[text()='Account created successfully. You are now registered.']")
	private WebElement AccVerification;

	public RegistrationFormPage(WebDriver driver) {
		super(driver);
	}

	public String registrationAction() {
		enterText(Email, Constants.generateUniqueEmail());
		enterText(Password, Constants.Reg_Password);
		enterText(RePassword, Constants.Reg_RePassword);
		enterText(FirstName, Constants.FirstName);
		enterText(LastName, Constants.LastName);
		waitForElementToBeVisible(Country);
		clickElement(INDCountry);
		waitForElementToBeVisible(State);
		clickElement(MHState);
		enterText(ZipCode, Constants.ZipCode);
		enterText(City, Constants.City);
		enterText(Streetline1, Constants.Streetline1);
		enterText(Streetline2, Constants.Streetline2);
		enterText(Phone, Constants.Phone);
		clickElement(Register);
		waitForElementToBeVisible(AccVerification);
		String ActualText = getElementText(AccVerification);
		return ActualText;
	}

}
