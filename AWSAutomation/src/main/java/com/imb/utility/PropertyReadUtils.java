package com.imb.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadUtils {
	

	public static String[] getProperty(String key, String filePath) throws IOException {
		String[] values = null;

		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		String partValue = prop.getProperty(key);
		values = partValue.split("##");
		return values;
	}

	public static void main(String[] args) {
		System.out.println("main method is added Prop Read Utils");
	}
}
