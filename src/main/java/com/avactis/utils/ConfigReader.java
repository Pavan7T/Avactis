package com.avactis.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;

	public ConfigReader() throws FileNotFoundException {
		properties = new Properties();
		FileInputStream input = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//avactis//resources//config.properties");

		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
