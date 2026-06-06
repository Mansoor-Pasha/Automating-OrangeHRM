package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public DashBoardPage (WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// For DashBoard Header Paths 
	By dashboardText = By.xpath("//h6[text() = 'Dashboard']");
	//By upgradeButton = By.xpath("//button[contains(@class,'orangehrm-upgrade-button')]");
	
	//For Testing the UpgradePage Section of OrangeHRM
	/*public void urlUpgradePage ()
	{
		
		driver.get("https://orangehrm.com/open-source/upgrade-to-advanced");
	}
	
	By UpgradeFullName = By.xpath("//input[@id= 'Form_getForm_FullName']");
	By UpgradeEmail = By.xpath("//input[@id= 'Form_getForm_Email']");
	By UpgradePhoneNumber = By.xpath("//input[@id= 'Form_getForm_Contact']");
	By UpgradeYourFullName = By.xpath("//input[@id= 'Form_getForm_CompanyName']");
	By UpgradeJobTitle = By.xpath("//input[@id= 'Form_getForm_JobTitle']");
	By UpgradeSubmit = By.xpath("//input[@class= 'action']"); */
	
	//LOCATORS FOR TESTING orangeHRM DASHBOARD PAGE 
	//Search Box Path
	By searchPlaceHolder = By.xpath("//input[@placeholder='Search']");
	
	//Left Menu Paths	
	By adminSection = By.xpath("//span[text()='Admin']");
	By pimSection = By.xpath("//span[text()='PIM']");
	By leaveSection = By.xpath("//span[text()='Leave']");
	By timeSection = By.xpath("//span[text()='Time']");
	By recruitmentSection = By.xpath("//span[text()='Recruitment']");
	By myInfoSection = By.xpath("//span[text()='My Info']");
	By performanceSection = By.xpath("//span[text()='Performance']");
	By directorySection = By.xpath("//span[text()='Directory']");
	By maintainSection = By.xpath("//span[text()='Maintenance']");
	By claimSection = By.xpath("//span[text()='Claim']");
	By buzzSection = By.xpath("//span[text()='Buzz']");
	
	//Profile Paths
	By profileDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By logout = By.xpath("//a[text()='Logout']");
	
	// To get CurrentURL of the Page
	public String getCurrentURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Clicking the Upgrade Button of the OrangeHRM Page
	/* public void clickUpgradeButton ()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(upgradeButton));
		button.click();
	} 
	
	//METHODS FOR ACCESSING LOCATORS OF THE UPGRADEPAGE SECTION OF orangeHRM 
	//Method for Entering full name in the Upgrade page Section
	public void enterFullName ()
	{
		driver.findElement(UpgradeFullName).sendKeys("ABCD");
	}
	
	//Method for Entering Work Email in the Upgrade Page Section
	public void enterWorkMail ()
	{
		driver.findElement(UpgradeEmail).sendKeys("abcd123@gmail.com");
	}
	
	//Method for Entering Phone Number in UpgradePage Section
	public void enterContactDetails ()
	{
		driver.findElement(UpgradePhoneNumber).sendKeys("123456789");
	}
	
	// Method for Selecting the Country Name from DropDown of UPGRADE PAGE
	public void countrySelection ()
	{
		WebElement dropDownElement = driver.findElement(By.id("Form_getForm_Country"));
		Select selectCountry = new Select (dropDownElement);
		selectCountry.selectByContainsVisibleText("India");
	}
		
	//Method for Enterting the name in YOUR FULL NAME PlaceHolder in UpgradePage Section
	public void enterYourFullName ()
	{
		driver.findElement(UpgradeYourFullName).sendKeys("NLKNJNLKLJNLK");
	}
	
	//Method for Entering Job Title in Upgrade Page Section
	public void enterJobTitle ()
	{
		driver.findElement(UpgradeJobTitle).sendKeys("Data Entry Operator");
	}
	
	//Method for Selecting the Number of Employees from UPGRADE PAGE DropDown
	public void NumberOfEmployeeSelect ()
	{
		WebElement dropDownElement = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select selectEmployee = new Select (dropDownElement);
		selectEmployee.selectByValue("11 - 50");
	}
	
	//Method for Clicking the Submit Button of the UpgradePage Section
	public void clickSubmitButton ()
	{
		driver.findElement(UpgradeSubmit);
	}  */
	
	//METHODS FOR ACCESSING LOCATORS OF THE orangeHRM DASHBOARD 
	//Method for Getting DashBoardText of the Dashboard
	public String getDashboardText ()
	{
		return driver.findElement(dashboardText).getText();
	}
	
	//Method for Navigating to Upgrade Page
	/* public void clickUpgradePage ()
	{
		driver.findElement(upgradeButton).click();
	} */
	
	//Method for getting Upgrade Page URL
	public String upgradePageURL ()
	{
		return driver.getCurrentUrl();
	}
	
	//Method for Search Place Holder 
	public void searchPlace (String menuName)
	{
		driver.findElement(searchPlaceHolder).clear();
		driver.findElement(searchPlaceHolder).sendKeys(menuName);
	}
	
	//Method for Navigating to Admin Section
	public void clickAdmin ()
	{
		driver.findElement(adminSection).click();
	}
	
	//Method for Navigating to PIM Section
	public void clickPIM ()
	{
		driver.findElement(pimSection).click();
	}
	
	//Method for Navigating to Leave Section
	public void clickLeave ()
	{
		driver.findElement(leaveSection).click();
	}
	
	//Method for Navigating to Time Section
	public void clickTime ()
	{
		driver.findElement(timeSection).click();
	}
	
	//Method for Navigating to Recruitment Section
	public void clickRecruitment ()
	{
		driver.findElement(recruitmentSection).click();
	}
	
	//Method for Navigating to MyInfo Section
	public void clickMyInfo ()
	{
		driver.findElement(myInfoSection).click();
	}
	
	//Method for Navigating to Performance Section
	public void clickPerformance ()
	{
		driver.findElement(performanceSection).click();
	}
	
	//Method for Navigating to Directory Section
	public void clickDirectory ()
	{
		driver.findElement(directorySection).click();
	}
	
	//Method for Navigating to Maintainance Section
	public void clickMaintainance ()
	{
		driver.findElement(maintainSection).click();
	}
	
	//Method for Navigating to Claim Section
	public void clickClaim ()
	{
		driver.findElement(claimSection).click();
	}
	
	//Method for Navigating to Buzz Section
	public void clickBuzz ()
	{
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
		File destinationFile = new File ("./ResultScreenShot/" + fileName + ".jpg");
		FileUtils.copyFile(srcFile, destinationFile);
		System.out.println("ScreenShot Captured Successfully");
	}
}
