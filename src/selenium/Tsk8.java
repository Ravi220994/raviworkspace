package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsk8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		
	   sc.get("http://greenstech.in/selenium-course-content.html");
	   
	   sc.manage().window().maximize();
	   
	   WebElement meth = sc.findElement(By.xpath("//div[@id='heading201']"));
       meth.click();
       
       WebElement res = sc.findElement(By.xpath("//a[@title='Model Resume training in chennai'][1]"));
       res.click();
       
       
	}

}
