package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	//load properties from config.properties file
	public Properties getProperties() {
		prop = new Properties();
		
		try {
			FileInputStream in = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(in);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return prop;
	}

}
