package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public DashBoardPage (WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
			
	//LOCATORS FOR TESTING orangeHRM DASHBOARD PAGE 
	//Search Box Path
	private By searchPlaceHolder = By.xpath("//input[@placeholder='Search']");
	private By dashBoardText = By.xpath("//h6[text()='Dashboard']");
	
	//Left Menu Paths	
	private By adminSection = By.xpath("//span[text()='Admin']");
	private By pimSection = By.xpath("//span[text()='PIM']");
	private By leaveSection = By.xpath("//span[text()='Leave']");
	private By timeSection = By.xpath("//span[text()='Time']");
	private By recruitmentSection = By.xpath("//span[text()='Recruitment']");
	private By myInfoSection = By.xpath("//span[text()='My Info']");
	private By performanceSection = By.xpath("//span[text()='Performance']");
	private By directorySection = By.xpath("//span[text()='Directory']");
	private By maintainSection = By.xpath("//span[text()='Maintenance']");
	private By claimSection = By.xpath("//span[text()='Claim']");
	private By buzzSection = By.xpath("//span[text()='Buzz']");
	
	//Profile Paths
	private By profileDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private By logout = By.xpath("//a[text()='Logout']");
	
	// To get CurrentURL of the Page
	public String getCurrentURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for wait
	public void waitForElement ()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(dashBoardText));
	} 
	
	public void waitForLocator (By locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	//METHODS FOR ACCESSING LOCATORS OF THE orangeHRM DASHBOARD 
	//Method for Getting DashBoardText of the Dashboard
	public String getDashboardText ()
	{
		return driver.findElement(dashBoardText).getText();
	}
	
	
	//Method for Search Place Holder 
	public void searchPlace (String menuName)
	{
		driver.findElement(searchPlaceHolder).click();
		driver.findElement(searchPlaceHolder).clear();
		driver.findElement(searchPlaceHolder).sendKeys(menuName);
	}
	
	//Method for Navigating to Admin Section
	public void clickAdmin ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(adminSection));
		driver.findElement(adminSection).click();
	}
	
	//Method for Navigating to PIM Section
	public void clickPIM ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(pimSection));
		driver.findElement(pimSection).click();
	}
	
	//Method for Navigating to Leave Section
	public void clickLeave ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(leaveSection));
		driver.findElement(leaveSection).click();
	}
	
	//Method for Navigating to Time Section
	public void clickTime ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(timeSection));
		driver.findElement(timeSection).click();
	}
	
	//Method for Navigating to Recruitment Section
	public void clickRecruitment ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(recruitmentSection));
		driver.findElement(recruitmentSection).click();
	}
	
	//Method for Navigating to MyInfo Section
	public void clickMyInfo ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(myInfoSection));
		driver.findElement(myInfoSection).click();
	}
	
	//Method for Navigating to Performance Section
	public void clickPerformance ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(performanceSection));
		driver.findElement(performanceSection).click();
	}
	
	//Method for Navigating to Directory Section
	public void clickDirectory ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(directorySection));
		driver.findElement(directorySection).click();
	}
	
	//Method for Navigating to Maintainance Section
	public void clickMaintainance ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(maintainSection));
		driver.findElement(maintainSection).click();
	}
	
	//Method for Navigating to Claim Section
	public void clickClaim ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(claimSection));
		driver.findElement(claimSection).click();
	}
	
	//Method for Navigating to Buzz Section
	public void clickBuzz ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(buzzSection));
		driver.findElement(buzzSection).click();
	}
	
	//Method for Logging Out 
	public void logout ()
	{
		driver.findElement(profileDropDown).click();
		driver.findElement(logout).click();
	}
	
	//Method for Taking the Screenshot
	public void getScreenShot (String fileName) throws IOException
	{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File folder = new File ("./DashBoardPageSrnShots");
		folder.mkdir();
		String timeStamp = String.valueOf(System.currentTimeMillis());
		File destinationFile = new File 
				("./DashBoardPageSrnShots/" + fileName + "_" + timeStamp +  ".jpg");
		FileUtils.copyFile(srcFile, destinationFile);
		System.out.println("ScreenShot of " + fileName + " captured Successfully");
	}
}
