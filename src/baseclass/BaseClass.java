package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BaseClass {
	 public static WebDriver driver;
       public static void launchBrowser() {
	          System.setProperty("webdriver.chrome.driver",
		       	"C:\\Users\\athvik\\raviworkspace\\selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	             driver=new ChromeDriver();
}
       public static void loadUrl(String url) {
    	   driver.get(url);
	}
       public static void maximize() {
          driver.manage().window().maximize();
	}
       public static String getUrl() {
    	   String url = driver.getCurrentUrl();
    	   return url;
	}
       public static String getTitle() {
    	   String title = driver.getTitle();
    	   return title;
	}
       public static void insert(WebElement e,String value) {
    	   e.sendKeys(value);
	}
       public static void click(WebElement e) {
		e.click();
	}
       public static void closeBrowser() {
	   driver.close();
	}
       public static void quitBrowser() { 
    	   driver.quit();
   }
       public static void moveToElement(WebElement move) {
    	   Actions a=new Actions(driver);
    	   a.moveToElement(move).perform();
	}
       public static void dropAnddrag(WebElement src,WebElement des) {
    	   Actions a=new Actions(driver);
    	   a.dragAndDrop(src,des).perform();
	}
       public static void rightclick(WebElement right) {
    	   Actions a=new Actions(driver);
    	   a.contextClick().perform();
	}
       public static void doubleclick() {
    	   Actions a=new Actions(driver);
    	   a.doubleClick().perform();
	}
       public static String text(WebElement e) {
    	   String text = e.getText();
    	   return text;	
	}
       public static String containstext(WebElement e) {
    	   String contain = e.getText();
    	   return contain;	
	}
       public static String getAttribute(WebElement e) {
    	   String att = e.getAttribute("value");
    	   return att;	
	}
  
    	public static void keys() throws AWTException   {
        Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
    	public static void screenshot(String s) throws IOException {
    		TakesScreenshot tk=(TakesScreenshot)driver;
    		File temp = tk.getScreenshotAs(OutputType.FILE);
    		File permanent = new File(s);
    		FileUtils.copyFile(temp, permanent);
		}
    	public static void javaGet(String s,WebElement set) {
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			jk.executeScript("arguments[0].setAttribute('value','s')", set);
		}
    	public static void javaReturn(String value,WebElement ret) {
    		JavascriptExecutor jk=(JavascriptExecutor)driver;
    		jk.executeScript("return agruments[0].getAttribute('value')",ret);
	}
    	public static void javaScrollUp( WebElement up) {
    		JavascriptExecutor jk=(JavascriptExecutor)driver;
    		jk.executeScript("arguments[0]scrollIntoView('false')",up );
			
		}
    	public static void javaScrollDown( WebElement down) {
    		JavascriptExecutor jk=(JavascriptExecutor)driver;
    		jk.executeScript("arguments[0]scrollIntoView('true')",down );
			
		}
        public static void simpleAlert() {
       		Alert a = driver.switchTo().alert();
       		a.accept();
       	}

        public static void confirmAlert() {
       		Alert a = driver.switchTo().alert();
       		a.dismiss();
       	}

        public static void promptAlert(String s) {
       		Alert a = driver.switchTo().alert();
       		a.sendKeys(s);
       		a.accept();
       	}
        public static void tableAllRow() {
        	List<WebElement> tRows = driver.findElements(By.name("tr"));
        	for(int i=0;i<tRows.size();i++) {
        		WebElement row = tRows.get(i);
        		System.out.println(row.getText());
        	}	
		}
        public static void singleTable() {
			List<WebElement> tRows = driver.findElements(By.name("tr"));
			for(int i=0;i<tRows.size();i++) {
				WebElement row = tRows.get(i);
				List<WebElement> single = row.findElements(By.name("td"));
				for(int j=0;j<single.size();j++) {
					WebElement data = single.get(j);
					System.out.println(data.getText());
					
				}
			}
		}
       
       
        public static String scan() {			
			Scanner sc=new Scanner(System.in);
			String capta=sc.next();
			  return capta;
			
        }
       
        
       
       
       
       
        

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        

}
