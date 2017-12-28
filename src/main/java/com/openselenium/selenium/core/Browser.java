package com.openselenium.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.openselenium.selenium.utility.PropertyFileReaderUtil;

public class Browser {

	WebDriver driver; 

	private static void setFirefoxProperties() {
		System.setProperty("webdriver.gecko.driver",
				"C:/selenium/geckodriver.exe");
	}

	private static void setChromeProperties() {

	}

	private static void setInternetExplorerProperties() {

	}

	public WebDriver getBrowser() {
		PropertyFileReaderUtil fileReaderUtil = new PropertyFileReaderUtil("default.properties");
		initializeBrowser(fileReaderUtil.getValue("BROWSER"));
		return driver;
	}

	public WebDriver getBrowser(String browserName) {
		initializeBrowser(browserName);
		return driver;
	}

	private void initializeBrowser(String browserName) {
		// initialize all browser here

		if (browserName.equalsIgnoreCase("firefox")) {
			setFirefoxProperties();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			setChromeProperties();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("internetexplorer")) {
			setInternetExplorerProperties();
			driver = new InternetExplorerDriver();
		} else {
			// by default return fire fox
			setFirefoxProperties();
			driver = new FirefoxDriver();
		}

	}

}
