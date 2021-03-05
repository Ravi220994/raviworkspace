package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	
	//up casting
	WebDriver s=new ChromeDriver();
	
	//to get the url
	s.get("http://www.greenstechnologys.com/");
	
	s.get("http://gmail.com/");
	
    s.get("http://www.flipkart.com/");
	
	s.get("http://greenstech.in/selenium-course-content.html");

	}

}
