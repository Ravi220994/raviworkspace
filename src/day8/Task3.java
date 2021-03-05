package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class Task3   {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		confirm.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button.click();
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		a.sendKeys("ravi");
		a.accept();
		
		
	}

}
