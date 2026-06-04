package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	/** TEST CASES FOR LOGIN PAGE OF ORANGEHRM
	 *
	 * TC_001 :- Login with valid credentials (Valid Username & Valid Password)
	 * TC_002 :- Login with Valid UserName and Invalid Password
	 * TC_003 :- Login with Invalid UserName and valid Password
	 * TC_004 :- Login with Blank UserName and Valid Password
	 * TC_005 :- Login with Blank UserName and Invalid Password
	 * TC_006 :- Login with Valid UserName and Blank password
	 * TC_007 :- Login with Invalid UserName and Blank Password
	 * TC_008 :- Login with Keeping Both fields blank
	 * TC_009 :- Forgot password link navigation
	 * */
	
	private static final String VALID_USERNAME = "Admin";
	private static final String VALID_PASSWORD = "admin123";
	private static final String INVALID_USERNAME = "ADMIN";
	private static final String INVALID_PASSWORD = "ADMIN1234";
	
	// TC_001 :- Login with Valid Credentials (Valid Username & Valid Password)
	
	@Test (priority = 1, description = "Verify Successful Login with Valid Credentials")
	public void testValidLogin ()
	{
		LoginPage lp = new LoginPage (driver);
		lp.login(VALID_USERNAME, VALID_PASSWORD);
		
		// Verifying Dashboard is visible after login
		boolean dashBoardVisible = lp.isDashBoardDisplayed ();
		Assert.assertTrue(dashBoardVisible, "TC_001 Failed: DashBoard is not Visible");		
		System.out.println("TC_001 Passed : Login Successful. Dashboard is Visible");
	}
	
	// TC_002 :- Login with Invalid Credentials (Valid UserName & Invalid Password)
	@Test (priority = 2, description = "Verify Login with Valid UserName & Invalid Password")
	public void testInvalidPass ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login(VALID_USERNAME, INVALID_PASSWORD);
		
		String actualError = lp.getErrorMsg();
		String expectedError = "Invalid Credentials";
		
		Assert.assertTrue(actualError.contains(expectedError), 
				"TC_002 Failed :- Expected error " + expectedError + "but, The Actual error is " + actualError);
		System.out.println("TC_002 Passed : Error message shown for wrong password " + actualError);
	}
	
	//TC_003 :- Login with Invalid Credentials (Invalid UserName and Valid Password)
	
	@Test (priority = 3, description = "Verify login with Invalid UserName and Valid Password")
	public void testInvalidUserName ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login(INVALID_USERNAME, VALID_PASSWORD);
		
		String actualError = lp.getErrorMsg();
		String expectedError = "Invalid Credentials";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_003 Failed :- Excepted error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_003 Passed : Error message shown for wrong UserName" + actualError);
	}
	
	//TC_004 :- Login with Blank UserName & Valid Password 
	@Test (priority = 4, description = "Verifying Login with keeping userName blank and entering Valid Password")
	public void testBlankUserName ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("");
		lp.enterpass(VALID_PASSWORD);
		lp.clickBtn();
		
		String actualError = lp.getErrorMsg();
		String expectedError = "UserName field should be enter";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_004 Failed :- because, Expected error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_004 is Passed :- Error message is shown for Blank UserName " + actualError);
	}
	
	//TC_005 :- Login with Blank UserName and Invalid Password
	@Test (priority = 5, description = "Verifying Login with Keeping UserName blank and entering the Invalid Password")
	public void testBlankUserInvaPass ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("");
		lp.enterpass(INVALID_PASSWORD);
		lp.clickBtn();
		
		String actualError = lp.getErrorMsg();
		String expectedError = "UserName field should be enter";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_005 Failed :- because, Excepted error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_005 Passed :- Error message is shown for blank UserName " + actualError);
	}
	
	//TC_006 :- Login with Entering Valid UserName and Keeping Blank Password
	@Test (priority = 6, description = "Verifying login with Entering Valid UserName and Keeping Password Blank")
	public void testBlankPass ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(VALID_USERNAME);
		lp.enterpass("");
		lp.clickBtn();
		
		String actualError = lp.getErrorMsg();
		String expectedError = "Password field should be enter";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_006 Failed:- because, Expected error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_006 Passed :- Error message is shown for Valid UserName and blank password " + actualError);	
	}
	
	//TC_007 :- Login with Entering Invalid UserName and Keeping Blank Password
	@Test (priority = 7, description = "Verifying login with Invalid UserName and Keeping password Blank")
	public void testBlankPassInvUserName ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(INVALID_USERNAME);
		lp.enterpass("");
		lp.clickBtn();
		
		String actualError = lp.getErrorMsg();
		String expectedError = "Password field should be enter";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_007 Failed :- because, Expected error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_007 Passed :- Error message is shown for Invalid UserName and blank password " + actualError);
	}
	
	//TC_008 :- Login with Keeping Both UserName and Password field Empty
	@Test (priority = 8, description = "Verifying the login with keeping both UserName and Password field Blank")
	public void testBlankCrede ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("");
		lp.enterpass("");
		lp.clickBtn();
		
		String actualError = lp.getErrorMsg();
		String expectedError = "UserName and Password field should be enter";
		
		Assert.assertTrue(actualError.contains(expectedError),
				"TC_008 is Failed :- because, Expected error is " + expectedError + "but, got error as " + actualError);
		System.out.println("TC_008 Passed :- Error message is shown for keeping both UserName & Password fields blank" + actualError);
	
	}
	
	//TC_009 :- Forgot Password Link Navigation
	@Test (priority = 9, description = "Navigating to Forgot Password Link")
	public void testNavigate ()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(VALID_USERNAME);
		lp.forgotpass();
		
		String currentURL = lp.getForPassURL();
		
		Assert.assertTrue(currentURL.contains(currentURL));
		System.out.println("The Forgot Password Page has been opened");
	}
}
