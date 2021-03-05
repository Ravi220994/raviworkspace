package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
           
         //up casting
      WebDriver driver=new FirefoxDriver(); 
      
      
      //to get the url
      driver.get("http://www.greenstechnologys.com/");
      
      driver.get("https://www.facebook.com/");
      
      driver.get("https://www.amazon.in");
      
      driver.get("http://greenstech.in/selenium-course-content.html");
    
      
      
    
    

	}
}

