package pages;

import java.time.Duration;

/**
 * LoginPage.Java = it is a page object model for login page of OrangeHRM
 * 
 *  What is POM :- Instead of writing locators directly in test methods. We keep all locators and actions in a separate class
 *  
 *  Why POM ?
 *  	# If the UI changes, you only update this file. Instead of updating in all fields
 *  	# Test become readable like clean english */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	By usernameField  = By.xpath("//input[@name = 'username']");
	By passwordField = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	By forgotpass = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	By dashboardText = By.xpath("//h6[text()='Dashboard']");
	By getErrorMsg = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
		
	// Page actions - Methods that represent user actions
	
	// Method for Entering UserName 
	public void enterUsername (String username)
	{
		driver.findElement(usernameField).sendKeys(username);		
	}
	
	//Method for Entering Password
	public void enterPassword (String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	//Method for Clicking the Login Button
	public void clickLoginButton ()
	{
		driver.findElement(loginBtn).click();
	}
	
	//Method for Complete Login (By Combining the above 3 Methods)
	public void login (String username, String password)
	{
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}
	
	//Method for Clicking Forgot the Password Link
	public void forgotpass ()
	{
		driver.findElement(forgotpass).click();
	}
	
	//Method for getting URL of the Forgot Password Link
	public String getForPassURL ()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean isDashBoardDisplayed ()
	{
		try {
			return driver.findElement(dashboardText).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getErrorMsg()
	{
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(getErrorMsg));
		return error.getText();
	}
	
	
}
