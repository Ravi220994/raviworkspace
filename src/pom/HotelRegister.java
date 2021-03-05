package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class HotelRegister extends BaseClass {

	public HotelRegister() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="re_password")
	private WebElement confirmpass ;
	
	@FindBy(id="full_name")
	private WebElement name ;
	
	@FindBy(id="email_add")
	private WebElement email;
	
	@FindBy(id="captcha-form")
	private WebElement captenter ;
	
	
	@FindBy(id="tnc_box")
	private WebElement tick;
	
	@FindBy(id="Submit")
	private WebElement register;
	
	@FindBy(id="Reset")
	private WebElement reset;

	@FindBy(xpath="//a[text()='Go back to Login page']")
	private WebElement loginpage;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement logpass;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}

	
	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	

	public WebElement getName() {
		return name;
	}

	

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getCaptenter() {
		return captenter;
	}

	
	public WebElement getTick() {
		return tick;
	}

	

	public WebElement getRegister() {
		return register;
	}

	

	public WebElement getReset() {
		return reset;
	}

	

	public WebElement getLoginpage() {
		return loginpage;
	}

	

	public WebElement getUsername() {
		return username;
	}

	

	public WebElement getLogpass() {
		return logpass;
	}

	
	public WebElement getLogin() {
		return login;
	}

	

	
	
	

	

	
	
	
	
	
}
