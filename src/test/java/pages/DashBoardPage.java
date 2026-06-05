package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	
	WebDriver driver;
	
	By selfReview = By.xpath("//p[text() = '(1) Pending Self Review']");
	By mainMenuButton = By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']");
	By upgradeButton = By.xpath("//button[@class='oxd-glass-button orangehrm-upgrade-button']");
	By searchPlaceHolder = By.xpath("//input[@class='oxd-input oxd-input--active']");
	By adminSection = By.xpath("//span[text()='Admin']");
	By pimSection = By.xpath("//span[text()='PIM']");
	By leaveSection = By.xpath("//span[text()='Leave']");
	By timeSection = By.xpath("//span[text()='Time']");
	By performanceSection = By.xpath("//span[text()='Performance']");

	
	
	private WebDriverWait wait;
	
	public String getCurrentURL ()
	{
		return driver.getCurrentUrl();
	}
	
	public DashBoardPage (WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//Method for Navigating to Upgrade Page
	public void upgradePage ()
	{
		driver.findElement(upgradeButton).click();
	}
	
	//Method for getting Upgrade Page URL
	public String upgradePageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Search Place Holder 
	public void searchPlace ()
	{
		driver.findElement(searchPlaceHolder);
	}
	
	//Method for getting Search Place URL
	public String searchPageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Navigating to Admin Section
	public void adminSection ()
	{
		driver.findElement(adminSection);
	}
	
	//Method for getting Admin Section URL
	public String adminPageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Navigating to PIM Section
	public void pimSection ()
	{
		driver.findElement(pimSection);
	}
	
	//Method for getting PIM Section Page URL
	public String pimPageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Navigating to Leave Section
	public void leaveSection ()
	{
		driver.findElement(leaveSection);
	}
	
	//Method for getting Leave Section URL
	public String leavePageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Navigating to Time Section
	public void timeSection ()
	{
		driver.findElement(timeSection);
	}
	
	//Method for getting Time Section URL
	public String timePageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Navigating to Performance Section
	public void performanceSection ()
	{
		driver.findElement(performanceSection);
	}
	
	//Method for getting Performance Section URL
	public String performancePageURL ()
	{
		return driver.getCurrentUrl();
	}	
}
