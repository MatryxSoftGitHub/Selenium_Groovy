package com.CURA.Testcase

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.Keys

/**
 * @author pavani
 *
 */
class AddDetailsToBookAppointment {
	
	WebDriver driver
	
	public AddDetailsToBookAppointment(WebDriver ldriver) {
		
		this.driver = ldriver
	}
	
	@FindBy(xpath = "//*[@id='combo_facility']") WebElement Pop_Facility
	@FindBy(id = "chk_hospotal_readmission") WebElement Chk_ReAdmission
	@FindBy(xpath = "//*[@id='appointment']/div/div/form/div[4]/div/div/div/span") WebElement VisitDate
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[5]/td[5]") WebElement Txt_Date
	@FindBy(id = "radio_program_medicaid") WebElement rBtn_HealthCare
	@FindBy(name = "comment") WebElement Txt_Comment
	@FindBy(id = "btn-book-appointment") WebElement Btn_BookAppointment
	
	public void AddDetails(def comment)
	{
		
		Select dropDown = new Select(Pop_Facility)
		dropDown.selectByIndex(2)
		Chk_ReAdmission.click()
		rBtn_HealthCare.click()
		VisitDate.click()
		Txt_Date.click()
		Txt_Comment.sendKeys(comment)
		Btn_BookAppointment.click()
		
	}
	
}
