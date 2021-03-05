package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//up casting
		WebDriver driver= new ChromeDriver();
		
		//to get thr url
		
		driver.get("https://www.snapdeal.com/");
		
		//to get the title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the url
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		//to close the current window/tab
		driver.close();
		

	}
	

}
