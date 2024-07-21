/*package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertionEx {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\X_Jars and drivers\\chromedriver_win32.exe");  
	//	  driver = new ChromeDriver();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Softassert softassert= new SoftAssert();
		String getActualTitle=driver.getTitle();
		boolean verifyTitle=driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");				
		softassert.assertEquals(getActualTitle, "Facebook – log in or sign up","The facebook title is correct");  //Soft Assertions
		softassert.assertNotEquals(getActualTitle, "Facebook – log in or insign up","The facebook title is notcorrect"); 
		softassert.assertNull(verifyTitle);
		softassert.assertNotNull(verifyTitle);
//		softassert.assertTrue();
//		softassert.assertFalse();		
//		softassert.assertAll();

	}

}
*/