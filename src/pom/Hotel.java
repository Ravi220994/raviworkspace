package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import baseclass.BaseClass;
import selenium.LaunchBrowser;

public class Hotel extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/Register.php");
		maximize();
		
		HotelRegister reg = new HotelRegister();
		insert(reg.getUser(),"RAVZ2209" );
		insert(reg.getPassword(), "ravi220994");
		insert(reg.getConfirmpass(),"ravi220994");
		insert(reg.getName(),"RAVIVARMAN");
		insert(reg.getEmail(), "ravi2209994@gmail.com");
		insert(reg.getCaptenter(), scan());
		click(reg.getTick());
	    click(reg.getRegister());
		click(reg.getLoginpage());
		insert(reg.getUsername(), "RAVZ2209");
		insert(reg.getLogpass(), "ravi220994");
		click(reg.getLogin());
		
		
		
		
		
		
	}
}
