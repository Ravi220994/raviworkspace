package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.shopclues.com/wholesale.html");
			
		 driver.manage().window().maximize();
		 Actions s=new Actions(driver);
		 
		 WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		 s.moveToElement(mob).perform();
		 
		 WebElement real = driver.findElement(By.xpath("//a[text()='Realme']"));
		 real.click();
		 
		 driver.findElement(By.xpath("(//div[@class='menu_wrap_sub'])[6]")).clear();
		 
	}

}
