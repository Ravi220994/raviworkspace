package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("ravi220994@mail.com");
		String att = mail.getAttribute("value");//to print which entered by user
		String att2 = mail.getAttribute("placeholder");//to print actual content
		System.out.println(att);
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ravisellam");
		String att1 = pass.getAttribute("value");
		System.out.println(att1);

	}

}
