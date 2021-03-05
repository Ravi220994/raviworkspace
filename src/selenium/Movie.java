package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	                 "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();

       driver.get("https://4movierulz.mn/");
	
       driver.manage().window().maximize();
       Actions s=new Actions(driver);
       
       WebElement telugu = driver.findElement(By.id("menu-item-89812"));
       s.moveToElement(telugu).perform();
       
       WebElement tel = driver.findElement(By.id("menu-item-94219"));
       tel.click();
       
	}

}
