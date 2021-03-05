package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement mail = driver.findElement(By.xpath("//div[@class='IiD88i _351hSN'][1]"));
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','9003652988')",mail);
		
		WebElement pass = driver.findElement(By.xpath("//div[@class='IiD88i _351hSN'][2]"));
		j.executeScript("arguments[0].setAttribute('value','ravi2209')",pass);
		
		WebElement login = driver.findElement(By.xpath("//div[@class='_1D1L_j']"));
		j.executeScript("arguments[0].click",login);
		
		Object em = j.executeScript("return arguments[0].getAttribute('value')",mail);
		Object ep = j.executeScript("return arguments[0].getAttribute('value')",pass);
		System.out.println(em);
		System.out.println(ep);
		
	}
	
	
	
	

}
