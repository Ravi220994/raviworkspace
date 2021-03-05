package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get(" http://greenstech.in/selenium-course-content.html");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 Thread.sleep(2000);
		 
		 WebElement course = driver.findElement(By.className("header-browse-greens"));
		 s.moveToElement(course).perform();
		 
		 WebElement soft = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		 s.moveToElement(soft).perform();
		 
		  WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		  selenium.click();
	}

}
