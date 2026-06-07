package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestforDashBoardPage {

protected WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Login
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Username']")))
				.sendKeys("Admin");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Password']")))
				.sendKeys("admin123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")))
				.click();
	}
	
	@AfterMethod
	public void tearDown ()
	{
		if (driver != null) {
			driver.quit();
		}
	}

}
