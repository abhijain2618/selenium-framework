package com.openselenium.selenium.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {
	public static void takeScreenShot(WebDriver driver) throws IOException {

//		Removed all variables which need not be created.
		FileUtils.copyFile(
				((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File(new PropertyFileReaderUtil("default.properties")
						.getValue("ERROR_SCREENSHOT_PATH")
						+ "test_"
						+ new SimpleDateFormat("yy_MM_dd_HH_mm_ss_SS")
								.format(new Date()) + ".png"));
		
//		More readable code for reference.
		
//		DateFormat dateFormat = new SimpleDateFormat("yy_MM_dd_HH_mm_ss_SS");
//		Date date = new Date();
//        
//		String fileWithPath = "c://demo//test_"+ dateFormat.format(date) + ".png";
//		System.out.println(fileWithPath);
//		// Convert web driver object to TakeScreenshot
//		TakesScreenshot scrShot = ((TakesScreenshot) driver);
//		// Call getScreenshotAs method to create image file
//		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//		// Move image file to new destination
//		File DestFile = new File(fileWithPath);
//		// Copy file at destination
//		FileUtils.copyFile(SrcFile, DestFile);
		
		
	}
}
