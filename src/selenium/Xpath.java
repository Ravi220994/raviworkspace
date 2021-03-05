package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe" );
          
		WebDriver dri=new ChromeDriver();
		
		dri.get("http://demo.automationtesting.in/Register.html");
		
	    WebElement first = dri.findElement(By.xpath("//input[@type='text'][1]"));
			first.sendKeys("ravi");
			
		
		WebElement last = dri.findElement(By.xpath("(//input[@type='text'])[2]"));
	    last.sendKeys("varma");
	    
	    WebElement add = dri.findElement(By.xpath("//textarea[@rows='3']"));
	    add.sendKeys("cuddalore");
	    
	    WebElement mail = dri.findElement(By.xpath("//input[@type='email']"));
	    mail.sendKeys("ravi@gmail.com");
	    
	    WebElement phone = dri.findElement(By.xpath("//input[@type='tel']"));
	    phone.sendKeys("9003652988");
		
		}
	
}
