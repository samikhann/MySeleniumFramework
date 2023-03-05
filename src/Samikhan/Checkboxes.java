package Samikhan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Checking
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		
		//Unchecking
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Count of Checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[@value= 'checkbox']")).size());
		
		
		
		
		
		
		
		
		

	}

}
