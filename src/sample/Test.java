package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Select a = new Select(findElement);
		a.isMultiple();
		a.selectByIndex(0);
		a.selectByValue("");
		a.selectByVisibleText("");
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		}

}
