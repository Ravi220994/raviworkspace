package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement benefit = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)",benefit);
		String att = benefit.getAttribute("value");
		System.out.println(att);
		
	}

}
