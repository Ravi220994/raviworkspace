package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		WebElement job = driver.findElement(By.id("heading2011"));
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",job);
		
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		File temp = job.getScreenshotAs(OutputType.FILE);
		
		File permanent= new File("G:\\jobs.jpeg");
		FileUtils.copyFile(temp, permanent);
		Thread.sleep(2000);
		
		WebElement online = driver.findElement(By.xpath("(//div[@class='promo-content-2'])[2]"));
		j.executeScript("arguments[0].scrollIntoView(false)",online);
		
	

	}

}
