package com.momsbelief3.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic {
	
	public static String getValue(String key) {
		String value = null;
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(new File("C:\\Users\\Abhi\\eclipse-workspace\\com.momsbelief3.com\\qa.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value = prop.getProperty(key);
		
		 
		return value;
	}
		
	}

	