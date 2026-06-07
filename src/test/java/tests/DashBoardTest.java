package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashBoardPage;
import utils.BaseTestforDashBoardPage;

public class DashBoardTest extends BaseTestforDashBoardPage  {

	/**
	 * -: TEST CASES :- 
	 * TC_001 :- Verifying the Visibility of Dashboard text in dashboard
	 * TC_002 :- Verifying the Search Menu 
	 * TC_003 :- Verifying the Visibility of the "admin" text in the Admin page URL
	 * TC_004 :- Verifying the Visibility of the "pim" text in the PIM page URL
	 * TC_005 :- Verifying the Visibility of the "leave" text in the Leave page URL
	 * TC_006 :- Verifying the Visibility of the "time" text in the Time page URL
	 * TC_007 :- Verifying the Visibility of the "recruitement" text in the Recruitement page URL
	 * TC_008 :- Verifying the Visibility of the "viewpersonal" text in the MyInfo page URL
	 * TC_009 :- Verifying the Visibility of the "performance" text in the Performance page URL
	 * TC_010 :- Verifying the Visibility of the "directory" text in the Directory page URL
	 * TC_011 :- Verifying the Visibility of the "maintainance" text in the Maintainance page URL
	 * TC_012 :- Verifying the Visibility of the "claim" text in the Claim page URL
	 * TC_013 :- Verifying the Visibility of the "buzz" text in the Buzz page URL 
	 * @throws IOException 
	*/
	
	@Test (priority = 1)
	public void testDashBoardText () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.waitForElement();
		db.getScreenShot("DashBoard-page");
		Assert.assertEquals(db.getDashboardText(), 
				"Dashboard");
	}
	
	@Test (priority = 2)
	public void testSearchMenu () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.waitForElement();		
		db.searchPlace("Admin");

		String menuText = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		db.waitForElement();
		db.getScreenShot("Search-Text-Visible");
		Assert.assertEquals(menuText, "Admin");
	}
	
	@Test (priority = 3)
	public void testAdminVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickAdmin();

		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Admin-page");
		Assert.assertTrue(currentURL.contains("admin"));
	}
	
	@Test (priority = 4)
	public void testPIMvisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickPIM();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("PIM-page");
		Assert.assertTrue(currentURL.contains("pim"));
	}
	
	@Test (priority = 5)
	public void testLeaveVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickLeave();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Leave-page");
		Assert.assertTrue(currentURL.contains("leave"));
	}
	
	@Test (priority = 6)
	public void testTimeVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickTime();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Time-page");
		Assert.assertTrue(currentURL.contains("time"));
	}
	
	@Test (priority = 7)
	public void testRecruitementVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickRecruitment();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Recruitment-page");
		Assert.assertTrue(currentURL.contains("recruitment"));
	}   
	
	@Test (priority = 8)
	public void testMyInfoPage () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickMyInfo();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("MyInfo-page");
		Assert.assertTrue(currentURL.contains("viewPersonalDetails"));
	}
	
	@Test (priority = 9)
	public void testPerformanceVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickPerformance();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Performance-page");
		Assert.assertTrue(currentURL.contains("performance"));
	}
	
	@Test (priority = 10)
	public void testDirectoryVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickDirectory();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Directory-page");
		Assert.assertTrue(currentURL.contains("directory"));
	}
	
	@Test (priority = 11)
	public void testMaintainanceVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickMaintainance();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Maintainance-page");
		Assert.assertTrue(currentURL.contains("maintenance"));
	}
	
	@Test (priority = 12)
	public void testClaimVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickClaim();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Claim-page");
		Assert.assertTrue(currentURL.contains("claim"));
	}
	
	@Test (priority = 13)
	public void testBuzzVisibility () throws IOException
	{
		DashBoardPage db = new DashBoardPage(driver);
		db.clickBuzz();
		
		String currentURL = db.getCurrentURL();
		db.waitForElement();
		db.getScreenShot("Buzz-page");
		Assert.assertTrue(currentURL.contains("buzz"));
	}
	
}
