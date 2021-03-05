package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import baseclass.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("http://www.greenstechnologys.com/");
			
		 driver.manage().window().maximize();
		//down casting or type conversion
	  TakesScreenshot tk=(TakesScreenshot)driver;
	  File temp=tk.getScreenshotAs(OutputType.FILE);
	  File permanent=new File("G:\\greens.png");
	  FileUtils.copyFile(temp, permanent);
				 
		 
		 

	}

}
