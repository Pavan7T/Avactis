package com.avactis.utils;

import java.util.UUID;

public class Constants {
	public static String BASE_URL;
	public static String USERNAME;
	public static String PASSWORD;
	public static String BROWSER;
	public static int TIMEOUT;
	// public static String emailPrefix;
	// public static String emailDomain;
	public static String EMAIL;
	public static String NU_EMAIL;
	public static String NU_REG_PASSWORD;
	public static String REG_PASSWORD;
	public static String REG_REPASSWORD;
	public static String FIRSTNAME;
	public static String LASTNAME;
	public static String COUNTRY;
	public static String STATE;
	public static String ZIPCODE;
	public static String CITY;
	public static String STREETLINE1;
	public static String STREETLINE2;
	public static String PHONE;
	public static String SIGNINFAIL_MSG;
	public static String SIGNINPASS_MSG;

	static {
		try {
			ConfigReader configReader = new ConfigReader();

			BASE_URL = configReader.getProperty("url");
			USERNAME = configReader.getProperty("username");
			PASSWORD = configReader.getProperty("password");
			BROWSER = configReader.getProperty("browser");
			TIMEOUT = Integer.parseInt(configReader.getProperty("timeout"));
			// emailPrefix = configReader.getProperty("emailPrefix");
			// emailDomain = configReader.getProperty("emailDomain");
			EMAIL = configReader.getProperty("email");
			REG_PASSWORD = configReader.getProperty("Reg_Password");
			REG_REPASSWORD = configReader.getProperty("Reg_RePassword");
			FIRSTNAME = configReader.getProperty("FirstName");
			LASTNAME = configReader.getProperty("LastName");
			COUNTRY = configReader.getProperty("Country");
			STATE = configReader.getProperty("State");
			ZIPCODE = configReader.getProperty("ZipCode");
			CITY = configReader.getProperty("City");
			STREETLINE1 = configReader.getProperty("Streetline1");
			STREETLINE2 = configReader.getProperty("Streetline2");
			PHONE = configReader.getProperty("Phone");
			NU_EMAIL = configReader.getProperty("unUsedEmail");
			NU_REG_PASSWORD = configReader.getProperty("unUsedPassword");
			SIGNINFAIL_MSG = configReader.getProperty("SignIn_failMsg");
			SIGNINPASS_MSG = configReader.getProperty("SignIn_Success_Msg");

		} catch (Exception e) {
			e.printStackTrace();
			// Handle the exception appropriately
		}
	}

	/*
	 * public static String generateUniqueEmail() { // You can use UUID or a
	 * combination of timestamp and random number for // uniqueness String
	 * uniquePart = UUID.randomUUID().toString(); // Generates a unique UUID //
	 * Alternatively, you could use a timestamp // String uniquePart = new
	 * SimpleDateFormat("yyyyMMddHHmmss").format(new // Date());
	 * 
	 * return emailPrefix + uniquePart + emailDomain; }
	 */
}
