package Utilities

import org.openqa.selenium.WebDriver
import org.openqa.selenium.TakesScreenshot
import java.text.DateFormat
import java.text.SimpleDateFormat
import org.openqa.selenium.OutputType
import org.openqa.selenium.io.FileHandler


class Helper {

	public static void CaptureScreenshot(WebDriver driver) {

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot,new File("./Screenshot/CURAHealthCare "+ getDateTimeFormat() +".png"))
			println "Screenshot captured"
		}catch(IOException e) {
			println "Unable to take screenshot" +e.message()
		}
	}
	
	public static def getDateTimeFormat() {
		
		DateFormat CustomFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss")
		Date Currentdate = new  Date()
		return CustomFormat.format(Currentdate)
	}
}