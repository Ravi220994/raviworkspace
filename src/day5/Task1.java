package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			
		 driver.get("http://demo.guru99.com/test/drag_drop.html");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 
		 WebElement srcbank = driver.findElement(By.id("credit2"));
		 WebElement desacct = driver.findElement(By.id("bank"));
		s.dragAndDrop(srcbank, desacct).perform();
		
		WebElement src5k = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement desamt = driver.findElement(By.id("amt7"));
		s.dragAndDrop(src5k, desamt).perform();
		
		 WebElement srcsale = driver.findElement(By.id("credit1"));
		 WebElement desacct1 = driver.findElement(By.xpath("//ol[@id='loan']"));
		s.dragAndDrop(srcsale, desacct1).perform();
		
		WebElement srck = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement desamt1 = driver.findElement(By.id("amt8"));
		s.dragAndDrop(srck, desamt1).perform();
		
		
		
		
		
		
	}

}
