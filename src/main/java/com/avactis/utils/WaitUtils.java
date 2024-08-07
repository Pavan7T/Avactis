package com.avactis.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitUtils {
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitUtils(WebDriver driver, int i) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
	}

	public boolean alertIsPresent() {
		return wait.until(ExpectedConditions.alertIsPresent()) != null;
	}

	public boolean elementSelectionStateToBe(WebElement element, boolean selected) {
		return wait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}

	public WebElement elementToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement elementToBeClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean elementToBeSelected(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public boolean elementToBeSelected(By locator) {
		return wait.until(ExpectedConditions.elementToBeSelected(locator));
	}

	public WebDriver frameToBeAvailableAndSwitchToIt(By locator) {
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}

	public WebDriver frameToBeAvailableAndSwitchToIt(String frameLocator) {
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public WebDriver frameToBeAvailableAndSwitchToIt(int frameLocator) {
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public boolean invisibilityOfElementLocated(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public boolean invisibilityOfElementWithText(By locator, String text) {
		return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
	}

	public List<WebElement> presenceOfAllElementsLocatedBy(By locator) {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public WebElement presenceOfElementLocated(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public boolean textToBePresentInElement(WebElement element, String text) {
		return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public boolean textToBePresentInElementLocated(By locator, String text) {
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	}

	public boolean textToBePresentInElementValue(By locator, String text) {
		return wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
	}

	public boolean titleIs(String title) {
		return wait.until(ExpectedConditions.titleIs(title));
	}

	public boolean titleContains(String title) {
		return wait.until(ExpectedConditions.titleContains(title));
	}

	// Visibility methods
	public WebElement visibilityOf(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public List<WebElement> visibilityOfAllElements(List<WebElement> elements) {
		return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public List<WebElement> visibilityOfAllElementsLocatedBy(By locator) {
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public WebElement visibilityOfElementLocated(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
