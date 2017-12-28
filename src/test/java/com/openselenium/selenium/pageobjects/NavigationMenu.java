package com.openselenium.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu {

	public static String HOME_XPATH = ".//*[contains(text(),'Home')]";
	
	public WebElement getHomeLink(WebDriver driver){
		WebElement webElement = driver.findElement(By.xpath("element"));
		return webElement;
	}
	
}
