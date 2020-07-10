package com.CURA.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class LogoutPage {
	
	WebDriver driver
	
	public LogoutPage(WebDriver ldriver) {
		
		this.driver = ldriver
		
	}
	
	@FindBy(xpath = "//*[@id='menu-toggle']/i") WebElement Btn_Menu
	@FindBy(xpath = "//*[@id='sidebar-wrapper']/ul/li[5]/a") WebElement Btn_Logout
	
	public void LogoutCURA() {
		
		Btn_Menu.click()
		Btn_Logout.click()
		
	}
	
}
