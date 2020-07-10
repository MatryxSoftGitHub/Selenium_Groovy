package com.CURA.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class LoginPage {
	
	WebDriver driver
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver
		
	}
	
	//@FindBy(id = "btn-make-appointment") WebElement Btn_MakeApointment
	
	@FindBy(name = "username") WebElement Txt_UserName
	
	@FindBy(name = "password") WebElement Txt_Passwrod
	
	@FindBy(id = "btn-login") WebElement Btn_Login
	
	public void LoginToCURA(String UserName, String Password) {
		
		
		Thread.sleep(2000)
		//Btn_MakeApointment.click()
		Txt_UserName.sendKeys(UserName)
		Txt_Passwrod.sendKeys(Password)
		Btn_Login.click()
	
	}
}
