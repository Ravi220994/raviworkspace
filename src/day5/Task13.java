package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task13 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get(" https://www.snapdeal.com/");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 Thread.sleep(2000);
		 
		 WebElement mob = driver.findElement(By.xpath(" (//li[@class='navlink'])[2]"));
		 s.moveToElement(mob).perform();
		 
		 WebElement cover = driver.findElement(By.className("rightMenuLink  dp-widget-link"));
		 cover.click();
		 
		 
		 
		
	}

}
