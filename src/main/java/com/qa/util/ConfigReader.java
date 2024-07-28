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
		FileInputStream in;
		try {
			in = new FileInputStream("src/test/resources/config/config.properties");
			try {
				prop.load(in);
				System.out.println(prop);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

}
