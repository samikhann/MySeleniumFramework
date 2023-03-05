package Samikhan;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsChildParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.findElement(By.linkText("Multiple Windows")).click();
		//Click Here
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId =it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	
	
	driver.switchTo().window(parentId);
	
	System.out.println(driver.findElement(By.xpath("//h3")).getText());

	}

}
