package Samikhan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelBasics {

	public static void main(String[] args) {
		// Step 1 Invoking Browser --> chrome 
		//Step 2 IF you want to run chrome browswer selenium guys has created one class called chromeDriver which has all methods to automate our browser
		
		//Step 4 Setting the property with the value (path of downloaded chromeDriver) /Users/msk/Documents/chromedriver which selenium takes in runtime to chck the property to the path and
		//invoke run driver and perform all the actions on chrome browser 
//		System.setProperty("webdriver.chrome.driver", "/Users/msk/Documents/chromedriver");
		
		//step 3 For above step you need to create one object called ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver() ; 
		
		//For edge EdgeDriver
		//Webdriver driver = new EdgeDriver();
		
		//For firefix
		WebDriver driver = new FirefoxDriver();
		
		//Visiting page
		driver.get("https://www.lidl.de");
		
		//Title
		System.out.println(driver.getTitle());
		
		//Current Url
		System.out.println(driver.getCurrentUrl());
		
		
		//Close current window
		driver.close();
		
//		//Quit the driver
//		driver.quit();
		
		driver.get
//		

	}

}
