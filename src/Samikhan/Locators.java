package Samikhan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String Text = "rahul";
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String mainass = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Meenakhan");
		
		driver.findElement(By.className("submit")).click(); 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("khan");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ali@gmail.com");
		//Clear
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("0987654421");
		Thread.sleep(2000);

		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(2000);

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);

		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		Thread.sleep(2000);
		
//		System.out.println(driver.findElement(By.xpath("//h1[1]")).getText());
//		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+Text+",");
		Thread.sleep(2000);


		driver.findElement(By.cssSelector(".logout-btn")).click();
		Thread.sleep(2000);
		
		
	}
//	public static String getPassword(WebDriver driver) throws InterruptedException
//	{
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		String a = driver.findElement(By.cssSelector("form p")).getText();
//		String[] b = a.split("'");
//		String c = b[1].split("'")[0];
//		return c;
//		
//		
//		
//}
//	
}
