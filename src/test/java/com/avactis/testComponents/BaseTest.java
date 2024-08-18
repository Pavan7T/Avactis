package com.avactis.testComponents;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.avactis.utils.Constants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseTest {
	protected WebDriver driver;
	protected Logger log;
	// private static final Logger logger =
	// Logger.getLogger(BaseTest.class.getName());

	// @Parameters({ "browser" })
	@BeforeMethod
	public void setUp() {

		initializeDriver(Constants.BROWSER);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TIMEOUT));
		DOMConfigurator.configure(System.getProperty("user.dir") + "//src//test//resources//log4j.xml");
		// DOMConfigurator.configure("test/resources/log4j/log4j-alternate.xml");
		log = Logger.getLogger(BaseTest.class.getName());
		log.info("Driver Launch successfully");

		driver.manage().window().maximize();

	}

	private void initializeDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			// Add Chrome-specific options here
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("ff")) {
			FirefoxOptions options = new FirefoxOptions();
			// Add Firefox-specific options here
			driver = new FirefoxDriver(options);
		} else {
			throw new IllegalArgumentException("Browser not supported: " + browser);
		}

		driver.get(Constants.BASE_URL);
	}

	//@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	/*
	 * @BeforeMethod public void beforeMethod() { // Perform actions before each
	 * test method, if any }
	 */

	/*
	 * public void afterMethod(ITestResult result) { if (result.getStatus() ==
	 * ITestResult.FAILURE) { takeScreenshot(result.getName()); } // Perform actions
	 * after each test method, if any }
	 */

	protected void takeScreenshot(String testName) {
		// Implementation for taking a screenshot on test failure
		// File screenshot = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshot, new File("screenshots/" + testName + ".png"));
	}

	protected void clearCookies() {
		driver.manage().deleteAllCookies();
	}

	protected void switchToNewTab() {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	/*
	 * protected void closeCurrentTab() { driver.close(); switchToNewTab(); }
	 */

	protected void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	protected void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
}
