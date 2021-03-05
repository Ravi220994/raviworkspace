package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsk9 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver",
    		 "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
     
    WebDriver s=new ChromeDriver();
    
    s.get("https://www.flipkart.com/");
    
    s.manage().window().maximize();
    

    
    WebElement mob = s.findElement(By.xpath("(//input[@type='text'])[2]"));
    mob.sendKeys("9003652988");
    
    WebElement pass = s.findElement(By.xpath("//input[@type='password']"));
    pass.sendKeys("ravi220994");
     
    WebElement log = s.findElement(By.xpath("(//button[@type='submit'])[2]"));
    log.click();
    
    WebElement textface = s.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
    String text = textface.getText();
    System.out.println(text);
    
  
    WebElement conts = s.findElement(By.xpath("//h2[contains(text(),'Face')]"));
    String text2 = conts.getText();
    System.out.println(text2);
    
	
	
	}
}