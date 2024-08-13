package com.avactis.utils;

import java.util.UUID;

public class Constants {
	public static String BASE_URL;
	public static String USERNAME;
	public static String PASSWORD;
	public static String BROWSER;
	public static int TIMEOUT;
	public static String emailPrefix;
	public static String emailDomain;
	public static String Reg_Password;
	public static String Reg_RePassword;
	public static String FirstName;
	public static String LastName;
	public static String Country;
	public static String State;
	public static String ZipCode;
	public static String City;
	public static String Streetline1;
	public static String Streetline2;
	public static String Phone;

	static {
		try {
			ConfigReader configReader = new ConfigReader();

			BASE_URL = configReader.getProperty("url");
			USERNAME = configReader.getProperty("username");
			PASSWORD = configReader.getProperty("password");
			BROWSER = configReader.getProperty("browser");
			TIMEOUT = Integer.parseInt(configReader.getProperty("timeout"));
			emailPrefix = configReader.getProperty("emailPrefix");
			emailDomain = configReader.getProperty("emailDomain");
			Reg_Password = configReader.getProperty("Reg_Password");
			Reg_RePassword = configReader.getProperty("Reg_RePassword");
			FirstName = configReader.getProperty("FirstName");
			LastName = configReader.getProperty("LastName");
			Country = configReader.getProperty("Country");
			State = configReader.getProperty("State");
			ZipCode = configReader.getProperty("ZipCode");
			City = configReader.getProperty("City");
			Streetline1 = configReader.getProperty("Streetline1");
			Streetline2 = configReader.getProperty("Streetline2");
			Phone = configReader.getProperty("Phone");

		} catch (Exception e) {
			e.printStackTrace();
			// Handle the exception appropriately
		}
	}

	public static String generateUniqueEmail() {
		// You can use UUID or a combination of timestamp and random number for
		// uniqueness
		String uniquePart = UUID.randomUUID().toString(); // Generates a unique UUID
		// Alternatively, you could use a timestamp
		// String uniquePart = new SimpleDateFormat("yyyyMMddHHmmss").format(new
		// Date());

		return emailPrefix + uniquePart + emailDomain;
	}
}
