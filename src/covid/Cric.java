package covid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cric {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\athvik\\Ravi_workspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.covid19india.org/");
			driver.manage().window().maximize();
			
			
	}

}
