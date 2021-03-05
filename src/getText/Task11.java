package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txtnum = driver.findElement(By.className("_2IX_2- VJZDxU"));
		txtnum.sendKeys("9003652988");
	    String num = txtnum.getAttribute("value");
	    System.out.println(num);
	    
	    WebElement txtpass = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
	    txtpass.sendKeys("ravi20994");
	    String pass = txtpass.getAttribute("value");
	    System.out.println(pass);
	}
}
