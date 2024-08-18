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

	@FindBy(className = "orders_search1")
	private WebElement category;

	String navlink1 = "//div[@class='header-navigation']//a[contains(text(),'";
	String navlink2 = "')]";

	String productlink1 = "//h3[text()='";
	String productlink2 = "']";

	public UserSignInPage(WebDriver driver) {
		super(driver);

	}

	public String verifyUserloggedIn() {
		isElementDisplayed(orderHeading);
		String actualText = getElementText(orderHeading);
		return actualText;

		// return cartLogo;
	}

	public void selectCategory(String category) {
		// Locate and click on the category based on the provided name
		if (category.equals("Computers")) {
			
		} else if (category.equals("DVD")) {

		} else {
			driver.findElement(By.xpath(navlink1 + category + navlink2)).click();
		}
	}

	public void selectProduct(String productName) {
		// Locate and click on the product based on the provided name
		driver.findElement(By.xpath(productlink1 + productName + productlink2)).click();

	}

}
