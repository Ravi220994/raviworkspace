package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver s=new ChromeDriver();
		
		s.manage().window().maximize();
		
	    s.get("https://www.cleartrip.com/trains/");
		
		WebElement from = s.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("Chennai Egmore (MS)");
		
		WebElement to = s.findElement(By.xpath("//input[@title='To station']"));
		to.sendKeys("Vridhachalam Junction (VRI)");
		
		WebElement search = s.findElement(By.id("trainFormButton"));
		search.click();
 
	}

}
