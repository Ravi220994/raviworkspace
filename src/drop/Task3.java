package drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;

public class Task3 extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s=new Select (year);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> opt = s.getOptions();
		for(int i=0;i<opt.size();i++) {
			WebElement op = opt.get(i);
			System.out.println(op.getText());
		}
		
		
		
		
	}

}
