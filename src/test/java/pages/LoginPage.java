package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	By usernameField  = By.xpath("//input[@name = 'username']");
	By passwordField = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	By forgotpass = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	// Page actions - Methods that represent user actions
	
	// Method for Entering UserName 
	public void enterusername (String username)
	{
		driver.findElement(usernameField).sendKeys("Admin");		
	}
	
	//Method for Entering Password
	public void enterpass (String password) {
		driver.findElement(passwordField).sendKeys("admin123");
	}
	
	//Method for Clicking the Login Button
	public void clickBtn ()
	{
		driver.findElement(loginBtn).click();
	}
	
	//Method for Complete Login (By Combining the above 3 Methods)
	public void login (String username, String password)
	{
		enterusername("Admin");
		enterpass("admin123");
		clickBtn();
	}
	
	//Method for Clicking Forgot the Password Link
	public void forgotpass ()
	{
		driver.findElement(forgotpass).click();
	}
}
