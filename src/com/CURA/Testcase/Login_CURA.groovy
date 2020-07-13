package com.CURA.Testcase

import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.*
import Utilities.BaseClass
import com.CURA.Pages.LoginPage
import com.CURA.Testcase.AddDetailsToBookAppointment
import com.CURA.Testcase.AppoinmentConfirmationPage
import com.CURA.Testcase.NavigateToLoginPage
import com.CURA.Pages.LogoutPage


class Login_CURA extends BaseClass {


	@Test
	public void loginApp() {
		
		//Step-1
		
		println 'Navigate to login page'
		
		NavigateToLoginPage HomePageToLoginPage = PageFactory.initElements(driver, NavigateToLoginPage.class)
		HomePageToLoginPage.HomePageToLoginPage()

		println "Navigation is successfull to home page"
		

		//Step-2
		
		println 'login to Apllication'
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class)
		loginPage.LoginToCURA(excel.readExcel(1, 0),excel.readExcel(1, 1))
		
		println 'Login Successfully'

		//Step-3
		
		println 'Add details to book appointment'
		
		AddDetailsToBookAppointment AddDetails= PageFactory.initElements(driver, AddDetailsToBookAppointment.class)
		AddDetails.AddDetails(excel.readExcel(1, 2))

		println 'Details added successfully'

		//step-4
		
		println 'Go to Home page'

		AppoinmentConfirmationPage homePage= PageFactory.initElements(driver, AppoinmentConfirmationPage.class)
		homePage.GoToHomePage()

		println 'Home page is displayed'

		//step-5
		
		println 'Logout from application'

		LogoutPage logoutPage =  PageFactory.initElements(driver, LogoutPage.class)
		logoutPage.LogoutCURA()

		println 'Logout is successfull'

	}

	@Test
	public void loginApp_test1() {
		

		//Step-1
		
		println 'Navigate to login page'

		NavigateToLoginPage HomePageToLoginPage = PageFactory.initElements(driver, NavigateToLoginPage.class)
		HomePageToLoginPage.HomePageToLoginPage()

		println 'Navigation is successfull to home page'

		//Step-2
		
		println 'login to Apllication'

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class)
		loginPage.LoginToCURA(excel.readExcel(1, 10),excel.readExcel(1, 11))
		
		print 'Login Successfully'


		//Step-3
		
		println 'Add details to book appointment'

		AddDetailsToBookAppointment AddDetails= PageFactory.initElements(driver, AddDetailsToBookAppointment.class)
		AddDetails.AddDetails(excel.readExcel(1, 2))

		println 'Details added successfully'

		//step-4
		
		println 'Go to Home page'

		AppoinmentConfirmationPage homePage= PageFactory.initElements(driver, AppoinmentConfirmationPage.class)
		homePage.GoToHomePage()

		println 'Home page is displayed'

		//step-5
		
		println 'Logout from application'

		LogoutPage logoutPage =  PageFactory.initElements(driver, LogoutPage.class)
		logoutPage.LogoutCURA()

		println 'Logout is successfull'
		
	}
}








