package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	 
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://greenstech.in/selenium-course-content.html");
	  
	  driver.manage().window().maximize();
	  
	  WebElement add1 = driver.findElement(By.className("mail-info"));
      String adyar = add1.getText();
      System.out.println("adyar address:"+adyar);
      
      WebElement add2 = driver.findElement(By.className("mail-info"));
      String omr = add2.getText();
      System.out.println("omr adress:"+omr);
	}

}
