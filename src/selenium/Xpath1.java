package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver s=new ChromeDriver();
		
		s.get("https://www.redbus.in/");
		
		s.manage().window().maximize();
		
		WebElement sign = s.findElement(By.id("i-icon-profile"));
		sign.click();
		
		WebElement sec = s.findElement(By.id("signInLink"));
		sec.click();
		Thread.sleep(5000);
		
		WebElement mob = s.findElement(By.className("(mobileInput clearfix"));
		mob.click();
		mob.sendKeys("9003652988");
		
		
		
		

	}

}
