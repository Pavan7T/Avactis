package com.avactis.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.avactis.pages.HomePage;
import com.avactis.pages.SignInPage;
import com.avactis.pages.UserSignInPage;
import com.avactis.testComponents.BaseTest;
import com.avactis.utils.Constants;

public class UserLoginTest extends BaseTest {

	@Test
	public void TC1() throws InterruptedException {
		// Register - Positive
		HomePage HomePage = new HomePage(driver);
		String actualtext = HomePage.signIn().registeruser().registrationAction();
		System.out.println("Actual text: " + actualtext);
		assertEquals(actualtext, "Account created successfully. You are now registered.");
	}

	@Test
	public void TC2() throws InterruptedException {
		// Register - Negative
		HomePage HomePage = new HomePage(driver);
		String actualtext = HomePage.signIn().registeruser().alreadyAccountRegistrationAction();
		System.out.println("Actual text: " + actualtext);
		assertEquals(actualtext, Constants.SIGNINPASS_MSG);
	}

	@Test
	public void TC3() {
		// Login - Positive
		HomePage HomePage = new HomePage(driver);
		UserSignInPage UserSignInPage = HomePage.signIn().oldUserSignIn();
		assertEquals(UserSignInPage.verifyUserloggedIn(), "ORDERS");

	}

	public void TC3_negative() {
		// Login - Positive
		HomePage HomePage = new HomePage(driver);
		WebElement failmsg = HomePage.signIn().UserSignIn_negativecase();
		assertEquals(failmsg, Constants.SIGNINFAIL_MSG);

	}
	

	public void TC4() {
		// Login - negative
		HomePage HomePage = new HomePage(driver);
		WebElement failmsg = HomePage.signIn().UserSignIn_negativecase();
		assertEquals(failmsg, Constants.SIGNINFAIL_MSG);

	}

}
