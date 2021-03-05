package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastRow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("(//table[@class='table'])[2]"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		int size = tRows.size();
		
		WebElement lastRow = tRows.get(size-1);
		List<WebElement> tDatas = lastRow.findElements(By.tagName("td"));
		for(int i=0;i<tDatas.size();i++) {
			WebElement data = tDatas.get(i);
			System.out.println(data.getText());
			
		}

	}

}
