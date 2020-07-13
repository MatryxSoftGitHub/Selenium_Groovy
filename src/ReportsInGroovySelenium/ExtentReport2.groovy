package ReportsInGroovySelenium




import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport2 {


	@Test
	def loginTest() throws IOException {
		// Create global variable which will be used in all method
		ExtentReports extent;
		ExtentTest logger;
		WebDriver driver;

		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Google.html");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		logger=extent.createTest("LoginTest");

// Actual Test which will start the application and verify the title
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe")
		driver = new ChromeDriver()
		//driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Vidya"));

		extent.flush();
		driver.quit();

	}
}