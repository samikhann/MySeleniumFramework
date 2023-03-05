package Samikhan;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("checkBoxOption2")).click();
		
		//Static dropdown
		
//		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
//		Select xzc = new Select(staticDropdown);
//		xzc.selectByIndex(2);

		
//		WebElement staticDropdown =driver.findElement(By.id("dropdown-class-example"));
////		Select abc = new Select(staticDropdown);
////		abc.selectByIndex(2;
		
		WebElement staticDropdown= driver.findElement(By.id("dropdown-class-example"));
		Select abc =new Select(staticDropdown);
		abc.selectByIndex(2);
		
		String aaa = "Option2";
		driver.findElement(By.id("name")).sendKeys(aaa);
		//confirmbtn
		//Hello Option2, Are you sure you want to confirm?
		//
		driver.findElement(By.id("confirmbtn")).click();
		String mmm= driver.switchTo().alert().getText();
		
		
		if(mmm.contains(mmm))
		{
		System.err.println("PAss");
//		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Option2, Are you sure you want to confirm?");
		}
		else 
			System.out.println("Fail");

	}
  

}
