package covid;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athvik\\Ravi_workspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.covid19india.org/");
		driver.manage().window().maximize();
		
		List<String> li = new ArrayList<>();
		Thread.sleep(2000);
			List<WebElement> cov = driver.findElements(By.xpath("//div[@class='table fadeInUp']/div/div[1]"));
			for(int j=1;j<cov.size();j++) {
			li.add(	cov.get(j).getText());
				
			}
			
      System.out.println(li);
      Set<String> s=new TreeSet<>();
      s.addAll(li);
      System.out.println(s);
    //div[@class='row']/div[contains(text(),'')]
		
		
			

			
		}
		
	}


