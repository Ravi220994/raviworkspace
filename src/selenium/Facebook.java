package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		//to maximize
		 driver.manage().window().maximize();
		 
   
	     WebElement txtemail = driver.findElement(By.id("username"));
	     txtemail.sendKeys("ravisellamuthu");
	      
	      WebElement txtpass = driver.findElement(By.name("password"));
		  txtpass.sendKeys("ravi220994");
	    
	      WebElement btnlogin = driver.findElement(By.name("login"));
          btnlogin.click();
	}

}
