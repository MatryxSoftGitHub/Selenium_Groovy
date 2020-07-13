package Utilities


import org.openqa.selenium.WebDriver
import org.testng.ITestResult
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeSuite
import Utilities.BrowserFactory
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports
import com.relevantcodes.extentreports.ExtentTest
import com.relevantcodes.extentreports.LogStatus



class BaseClass {
	
	public WebDriver driver
	public ExcelDataProvider excel
	public ConfigDataProvider config
	public ExtentReports report
	public ExtentTest logger
	
	
//	@BeforeSuite
//	public void setupSuite() {
//		
//
//	}
//	
	@BeforeClass
	public void setUp() {
		excel = new ExcelDataProvider()
		config = new ConfigDataProvider()
		
		//driver = BrowserFactory.startApllication(driver, config.getBrowser(), config.getURL())
		driver = BrowserFactory.startApllication(driver,'Chrome','https://katalon-demo-cura.herokuapp.com')
	}
	
	@AfterClass
	public void tearDown() {
		
		BrowserFactory.quitBrowser(driver)
		
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.CaptureScreenshot(driver)
		}
		
		//report.flush()
	}
}
