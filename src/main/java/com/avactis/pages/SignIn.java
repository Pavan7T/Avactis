package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;
import com.avactis.utils.Constants;

public class SignIn extends BasePage {

	
	@FindBy (xpath="")
	private WebElement registerBtn;
	
	public SignIn(WebDriver driver) {
		super(driver);

	}
	
	

}
