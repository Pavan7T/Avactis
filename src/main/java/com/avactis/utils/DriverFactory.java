package com.avactis.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver getChromeDriver() {

		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

	public static WebDriver getFFDriver() {

		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

}
