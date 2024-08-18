package com.avactis.test;

import java.util.List;

import org.testng.annotations.Test;

import com.avactis.pages.HomePage;
import com.avactis.pages.UserSignInPage;
import com.avactis.testComponents.BaseTest;
import com.avactis.utils.ExcelUtils;
import com.avactis.utils.Product;

public class Store_testcases extends BaseTest {

	@Test
	public void TC05() {
		List<Product> products = ExcelUtils
				.getProducts(System.getProperty("user.dir") + "//src//test//java//data//Products.xlsx");
		// .getProducts(System.getProperty("user.dir" +
		// "//src//test//java//data//Products.xlsx"));
		HomePage HomePage = new HomePage(driver);
		UserSignInPage UserSignInPage = HomePage.signIn().oldUserSignIn();

		for (Product product : products) {
			UserSignInPage.selectCategory(product.getCategory());
			UserSignInPage.selectProduct(product.getProductName());

		}
	}
}
