package com.openselenium.selenium.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReaderUtil {

	private Properties properties = new Properties();

	// parameterized constructor
	public PropertyFileReaderUtil(String filePath) {

		try {
			InputStream inputFile = new FileInputStream(filePath);
			properties.load(inputFile);
			inputFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}


}
