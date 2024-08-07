package com.avactis.abstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.avactis.utils.WaitUtils;

public class BasePage {
	protected WebDriver driver;
	private WaitUtils waitUtil;

	// This is parent class constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitUtil = new WaitUtils(this.driver, 20);
	}

	// Navigation Methods
	public void navigateTo(String url) {
		driver.get(url);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	// Wait Methods
	public void waitForElementToBeVisible(WebElement element) {
		waitUtil.visibilityOf(element);
	}

	public void waitForElementToBeClickable(WebElement element) {
		waitUtil.elementToBeClickable(element);
	}

	public void waitForTitleToBe(String title) {
		waitUtil.titleIs(title);
	}

	public void clickElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	public void enterText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		element.sendKeys(text);
	}

	public void clearAndEnterText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		element.clear();
		element.sendKeys(text);
	}

	public String getElementText(WebElement element) {
		waitForElementToBeVisible(element);
		return element.getText();
	}

	public void selectDropdownByValue(WebElement element, String value) {
		waitForElementToBeVisible(element);
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
	}

	public void selectDropdownByVisibleText(WebElement element, String visibleText) {
		waitForElementToBeVisible(element);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(visibleText);
	}

	// Verification Methods
	public boolean isElementDisplayed(WebElement element) {
		waitForElementToBeVisible(element);
		return element.isDisplayed();
	}

	public boolean isElementEnabled(WebElement element) {
		waitForElementToBeVisible(element);
		return element.isEnabled();
	}

	public boolean doesElementContainText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		return element.getText().contains(text);
	}

	// Utility Methods
	public void takeScreenshot(String fileName) {
		// Implementation for taking a screenshot
		// File screenshot = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshot, new File(fileName));
	}

	public void scrollToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void switchToNewWindow() {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

}
