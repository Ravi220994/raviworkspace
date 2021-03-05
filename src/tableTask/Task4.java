package tableTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-hover'])"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++) {
			WebElement rows = tRows.get(i);
			List<WebElement> tDatas = rows.findElements(By.tagName("td"));
			for(int j=0;j<tDatas.size();j++) {
				WebElement data = tDatas.get(j);
				
				System.out.println(data.getText());
			}
			}
		
		
			
			
		

	}

}
