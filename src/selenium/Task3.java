package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		//upcasting
		WebDriver r=new InternetExplorerDriver();
		
		// to get the url
		r.get("http://www.greenstechnologys.com/");
		
		r.get("http://demo.automationtesting.in/Register.html");
	   
		r.get("http://www.greenstechnologys.com/");
		
	    r.get("http://greenstech.in/selenium-course-content.html");
		
	}

}
