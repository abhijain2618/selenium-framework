package com.openselenium.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("internetexplorer")) {
			driver = new ChromeDriver();
		} else {
			// by default return fire fox
			driver = new FirefoxDriver();
		}

	}

}
