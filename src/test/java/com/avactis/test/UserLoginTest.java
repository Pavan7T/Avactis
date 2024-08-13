package com.avactis.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.avactis.pages.HomePage;
import com.avactis.pages.SignInPage;
import com.avactis.testComponents.BaseTest;

public class UserLoginTest extends BaseTest {

	@Test
	public void userlogin() throws InterruptedException {

		HomePage HomePage = new HomePage(driver);
		String Title = HomePage.signIn().titleCheck();
		System.out.println("PageTitle: " + Title);
		assertEquals(Title, "Avactis Demo Store");
	}

	@Test(priority = 1)
	public void newResgistration() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		String actualtext = HomePage.signIn().registeruser().registrationAction();
		System.out.println("Actual text: " + actualtext);
		assertEquals(actualtext, "Account created successfully. You are now registered.");
	}
}
