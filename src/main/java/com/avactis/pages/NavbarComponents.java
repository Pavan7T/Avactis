package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.avactis.abstractComponents.BasePage;

public class NavbarComponents extends BasePage {

	private WebDriver driver;
	private Actions actions;

	@FindBy(xpath = "//img[@alt='Desktops']")
	private WebElement desktopSection;

	@FindBy(xpath = "Notebooks")
	private WebElement notebookSection;

	public NavbarComponents(WebDriver driver) {
		super(driver);
	}

	public void hoverOverCategory(String category) {
		WebElement categoryElement = driver.findElement(By.linkText(category));
		actions.moveToElement(categoryElement).perform();
	}

	public void selectSubCategory(String category, String subCategory) {
		hoverOverCategory(category);
		WebElement subCategoryElement = driver.findElement(By.linkText(subCategory));
		subCategoryElement.click();
	}

	public void selectCategory(String category) {
		WebElement categoryElement = driver.findElement(By.linkText(category));
		categoryElement.click();
	}
}
