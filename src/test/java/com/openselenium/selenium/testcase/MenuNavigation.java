package com.openselenium.selenium.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.openselenium.selenium.core.Browser;
import com.openselenium.selenium.pageobjects.NavigationMenu;

public class MenuNavigation {

	WebDriver driver ;
	
	@BeforeClass
	public void setUp(){
		driver = new Browser().getBrowser();
	}
	
	@Test
	public void testNavigation(){
		driver.get("http://demoqa.com");
		//Option A
		driver.findElement(By.xpath(NavigationMenu.HOME_XPATH)).click();
		
		//Option B
		NavigationMenu navigationMenu = new NavigationMenu();
		navigationMenu.getHomeLink(driver).click();
	}
	
	@AfterClass
	public void tearDown(){
		
	}
}
