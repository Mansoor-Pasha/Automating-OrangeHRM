package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashBoardPage;
import utils.BaseTest;

public class DashBoardTest extends BaseTest  {

	/**
	 * -: TEST CASES :- 
	 * TC_001 :- Verifying the Visibility of Dashboard text in dashboard
	 * TC_002 :- Verifying the Upgrade button is Clickable or not in Dashboard page
	 * TC_003 :- Verifying the Functionality of UpgradePage Section
	 * TC_004 :- Verifying the Search Menu 
	 * TC_005 :- Verifying the Visibility of the "admin" text in the Admin page URL
	 * TC_006 :- Verifying the Visibility of the "pim" text in the PIM page URL
	 * TC_007 :- Verifying the Visibility of the "leave" text in the Leave page URL
	 * TC_008 :- Verifying the Visibility of the "time" text in the Time page URL
	 * TC_009 :- Verifying the Visibility of the "recruitement" text in the Recruitement page URL
	 * TC_010 :- Verifying the Visibility of the "viewpersonal" text in the MyInfo page URL
	 * TC_011 :- Verifying the Visibility of the "performance" text in the Performance page URL
	 * TC_012 :- Verifying the Visibility of the "directory" text in the Directory page URL
	 * TC_013 :- Verifying the Visibility of the "maintainance" text in the Maintainance page URL
	 * TC_014 :- Verifying the Visibility of the "claim" text in the Claim page URL
	 * TC_015 :- Verifying the Visibility of the "buzz" text in the Buzz page URL 
	*/
	
	@Test (priority = 1)
	public void testDashBoardText ()
	{
		DashBoardPage db = new DashBoardPage(driver);		
		Assert.assertEquals(db.getDashboardText(), 
				"Dashboard");
	}
	
	/*@Test (priority = 2)
	public void testClickUpgradeButton ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickUpgradeButton();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("upgrade"));
	}
	
	@Test (priority = 3, dependsOnMethods = "testClickUpgradeButton")
	public void testUpgradeInfo ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.urlUpgradePage();
		db.enterFullName();
		db.enterWorkMail();
		db.enterContactDetails();
		db.countrySelection();
		db.enterYourFullName();
		db.enterJobTitle();
		db.NumberOfEmployeeSelect();
		//db.clickSubmitButton();		
	} */
	
	@Test (priority = 4)
	public void testSearchMenu ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.searchPlace("Admin");
		
		String menuText = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		Assert.assertEquals(menuText, "Admin");
	}
	
	@Test (priority = 5)
	public void testAdminVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickAdmin();

		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("admin"));
	}
	
	@Test (priority = 6)
	public void testPIMvisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickPIM();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("pim"));
	}
	
	@Test (priority = 7)
	public void testLeaveVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickLeave();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("leave"));
	}
	
	@Test (priority = 8)
	public void testTimeVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickTime();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("time"));
	}
	
	@Test (priority = 9)
	public void testRecruitementVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickRecruitment();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("recruitment"));
	}   
	
	@Test (priority = 10)
	public void testMyInfoPage ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickMyInfo();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("viewPersonalDetails"));
	}
	
	@Test (priority = 11)
	public void testPerformanceVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickPerformance();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("performance"));
	}
	
	@Test (priority = 12)
	public void testDirectoryVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickDirectory();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("directory"));
	}
	
	@Test (priority = 13)
	public void testMaintainanceVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickMaintainance();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("maintenance"));
	}
	
	@Test (priority = 14)
	public void testClaimVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickClaim();
		
		String currentURL = db.getCurrentURL();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Claim']")));
		db.getScreenShot("claim-text-visibility");
		Assert.assertTrue(currentURL.contains("claim"));
	}
	
	@Test (priority = 15)
	public void testBuzzVisibility ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickBuzz();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("buzz"));
	}
	
}
