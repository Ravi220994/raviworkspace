package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		driver.manage().window().maximize();
		
		//to fetch all the tables rows present in the webpage
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		System.out.println("normal for loop");
		
		for(int i=0;i<tRows.size();i++) {
			WebElement row = tRows.get(i);
			System.out.println(row.getText());
		}
	 
	}

}
