package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			
		 driver.get("http://www.amazon.in");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 
		 WebElement prime = driver.findElement(By.id("nav-link-prime"));
		 s.doubleClick(prime).perform();
		 
	}

}
