package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\Ravi_workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement phone = driver.findElement(By.id("twotabsearchtextbox"));
	    insert(phone,"iphone");
	   
	    WebElement search = driver.findElement(By.id("nav-search-submit-text"));
	    search.click();
	    
	    WebElement first = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	    first.click();
	    String parwind = driver.getWindowHandle();
	    Set<String> allwind = driver.getWindowHandles();
	    for (String x : allwind) {
	    	if(!x.equals(parwind)) {
	    		driver.switchTo().window(x);	
	    	}	
		}
	    
	    WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		System.out.println(price.getText());
		
		
		
	
	
		
	}

}
