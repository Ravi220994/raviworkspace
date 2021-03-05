package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
		WebElement mail = driver.findElement(By.id("email"));
		insert(mail, "ravi220994@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		insert(password, "ravisellam");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		getTitle();
		getUrl();
		System.out.println(getTitle());
		System.out.println(getUrl());
		
		
		

	}

}
