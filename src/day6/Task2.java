package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.google.co.in/webhp");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("velmurugan");
		 
		 s.doubleClick(search).perform();
		 
		 Thread.sleep(2000);
		 
	      Robot r=new Robot();
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_X);
		 
		 
		

	}

}
