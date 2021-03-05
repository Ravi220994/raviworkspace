package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		WebElement address = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",address);
		String att = address.getAttribute("class");
		System.out.println(att);
		
	}

}
