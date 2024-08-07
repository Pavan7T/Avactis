package com.avactis.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.avactis.pages.HomePage;
import com.avactis.pages.SignIn;
import com.avactis.testComponents.BaseTest;

public class UserLoginTest extends BaseTest {

	SignIn LoginPage;
	HomePage HomePage;

	@Test
	public void userlogin() throws InterruptedException {
		HomePage = new HomePage(driver);
		HomePage.signIn();
	}

}
