package tests;

import org.openqa.selenium.By;
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
	
	@Test (priority = 2)
	public void testClickUpgradeButton ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickUpgradePage();
		
		String currentURL = db.getCurrentURL();
		Assert.assertTrue(currentURL.contains("upgrade-to-advanced"));
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
		db.clickNotRobotCheckBox();
		db.clickSubmitButton();		
	}
	
	@Test (priority = 4)
	public void testSearchMenu ()
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.searchPlace("Admin");
		
		String menuText = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		Assert.assertEquals(menuText, "Admin");
	}
	
}
