package com.avactis.utils;

public class Constants {
	public static String BASE_URL;
	public static String USERNAME;
	public static String PASSWORD;
	public static String BROWSER;
	public static int TIMEOUT;

	static {
		try {
			ConfigReader configReader = new ConfigReader();
			BASE_URL = configReader.getProperty("url");
			USERNAME = configReader.getProperty("username");
			PASSWORD = configReader.getProperty("password");
			BROWSER = configReader.getProperty("browser");
			TIMEOUT = Integer.parseInt(configReader.getProperty("timeout"));
		} catch (Exception e) {
			e.printStackTrace();
			// Handle the exception appropriately
		}
	}
}
