package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.shopclues.com/wholesale.html");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 
		 WebElement sports = driver.findElement(By.id("nav_45"));
		s.moveToElement(sports).perform();
		
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();

	}

}
