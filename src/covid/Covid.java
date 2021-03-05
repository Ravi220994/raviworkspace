package covid;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\athvik\\Ravi_workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.covid19india.org/");
		driver.manage().window().maximize();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='table-container']"));
    
		for (int i=0;i<list.size();i++) {
			
			WebElement all = list.get(i);
			System.out.println(all.getText());
			
		}
		System.out.println("Order");
		Set<WebElement> s=new TreeSet<>();
	    s.addAll(list);
		System.out.println(s);
		
		
	}

}
