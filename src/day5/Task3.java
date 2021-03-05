package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.flipkart.com/");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 Thread.sleep(2000);
		 WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 
		 btn.click();
//		 JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click()", btn);

		 WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));		// home.click();
		 s.moveToElement(home).perform();
		 
		
		
	}

}
