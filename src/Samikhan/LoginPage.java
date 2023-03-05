package Samikhan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("SamiKhan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("samikhan@icloud.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Samikhan");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
//		
////	//Statis Dropdown
////		
//		
		
		WebElement a = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select Dropdown = new Select(a);
		
		Dropdown.selectByIndex(1);
		
		//(//input[@name='bday'])[1]

		driver.findElement(By.xpath("(//input[@id='inlineRadio2'])[1]")).click();
//		
//		//Calender
		driver.findElement(By.xpath("(//input[@name='bday'])[1]")).sendKeys("02.03.1996");
		
//		//Button
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		
		//TEXT
		System.out.print(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
