package Utilities

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.support.ui.WebDriverWait



class BrowserFactory {

	public static WebDriver startApllication(WebDriver driver, def browserName , def appURL) {
		//def wait = new WebDriverWait()
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe")
			driver = new ChromeDriver()
			
		}
		else if(browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe")
			driver = new FirefoxDriver()
		}
		else if(browserName.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe")
			driver = new InternetExplorerDriver()
			
		}else {
			println "We donot support this browser"
		}
		
		//wait.until(30)
		//driver.manage().timeouts().pageLoadTimeout(30, wait())
		driver.manage().window().maximize()
		driver.get(appURL)
		//wait.until(30)
		//driver.manage().timeouts().implicitlyWait(30, wait())
		return driver
			
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit()
	}
}


