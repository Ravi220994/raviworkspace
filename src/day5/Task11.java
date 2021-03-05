package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Task11 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.homedepot.com/");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 Thread.sleep(2000);
		 
		 WebElement all = driver.findElement(By.xpath("//a[text()='All Departments']"));
		 s.moveToElement(all).perform();
		 
		 WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		 s.moveToElement(heat).perform();
		 
		 WebElement air = driver.findElement(By.xpath("//a[text()='Air Conditioners'][1]"));
		 s.moveToElement(air).perform();

		

	}

}
