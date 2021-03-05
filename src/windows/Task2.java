package windows;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;


public class Task2 extends BaseClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement phone = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		phone.sendKeys("iphone");
		
		WebElement  search = driver.findElement(By.className("searchTextSpan"));
		search.click();
		
		 List<WebElement> allphone = driver.findElements(By.xpath("//p[@class='product-title']"));
		WebElement all = allphone.get(1);
		all.click();
		allphone.get(4).click();
		allphone.get(3).click();
		allphone.get(2).click();
		allphone.get(7).click();
		
		String parwind = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		
		int i=0;
		for (String x : allwind) {
			if(i==3) {
				driver.switchTo().window(x);
			}
			i++;
			
		}
		
		
		
	}

}
