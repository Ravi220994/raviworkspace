package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowAndCell {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("(//table[@class='table'])[2]"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++) {
			WebElement rows = tRows.get(i);
			List<WebElement> tDatas = rows.findElements(By.tagName("td"));
			for(int j=0;j<tDatas.size();j++) {
				WebElement data = tDatas.get(j);
				String text = data.getText();
				if(text.equals("Moe")){
					System.out.println("Row no:"+i);
					System.out.println("cell no:"+j);
				}
				
			}
		}

	}

}
