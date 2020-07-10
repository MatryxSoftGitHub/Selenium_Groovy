package com.CURA.Testcase

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class NavigateToLoginPage {
	
	WebDriver driver
	
	public NavigateToLoginPage(WebDriver ldriver) {
		
		this.driver = ldriver
		
	}
	
	@FindBy(id = "btn-make-appointment") WebElement Btn_MakeAppointment
	
	public void HomePageToLoginPage() {
		
		Thread.sleep(2000)
		Btn_MakeAppointment.click()
		
	}
}
