package com.CURA.Testcase

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class AppoinmentConfirmationPage {

	WebDriver driver

	public AppoinmentConfirmationPage(WebDriver ldriver) {

		this.driver = ldriver
	}

	@FindBy(xpath = "//*[@id='summary']/div/div/div[7]/p/a") WebElement Btn_GoToHomePage

	public void GoToHomePage() {

		Btn_GoToHomePage.click()
	}
}
