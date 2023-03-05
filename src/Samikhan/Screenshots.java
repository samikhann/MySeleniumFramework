package Samikhan;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/1982418#questions");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File(//Users//msk//Desktop//Selenium\\ Screenshots.png));
		
		FileUtils.copyFile(src,  new File("logo.png"));
		

	}

}
