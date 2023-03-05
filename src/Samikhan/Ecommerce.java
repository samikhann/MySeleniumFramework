package Samikhan;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Username
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		//Password
		driver.findElement(By.id("password")).sendKeys("learning");
		
		//RadioButton
		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(4) > div:nth-child(1) > label:nth-child(2) > span:nth-child(3)")).isSelected();
		
		//Static Dropdown
		WebElement staticDropdown= driver.findElement(By.cssSelector("select[class='form-control']"));
		Select Dropdown = new Select(staticDropdown);
		Dropdown.selectByIndex(2);

		
		//Checkbox
		driver.findElement(By.id("terms")).click();
		
		//Signin
	    driver.findElement(By.id("signInBtn")).click();


	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();	
	    
	    //Add all products
	    String [] mobiles = {"iphone x","Samsung Note 8","Nokia Edge","Blackberry"};
	    
	    List<WebElement> type = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
	    
	    for (int i=0; i<type.size();i++)
	    {
	   type.get(i).click();
	}
         driver.findElement(By.partialLinkText("Checkout")).click();
}
	
}