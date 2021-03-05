package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", 
    		  "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.get("http://www.greenstechnologys.com ");
      driver.manage().window().maximize();
      
      WebElement greens = driver.findElement(By.className("blue_text"));
      String text = greens.getText();
      System.out.println(text);
      
      WebElement tech = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
      String text1 = tech.getText();
      System.out.println(text1);
      
      

	}

}
