package customMethod

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginPage {
	@Keyword
	def loginCRM1() {
		//login to CRM system
		//go to url
		//nhập email pass
		//nhấn sign in
		WebUI.navigateToUrl('https://rise.fairsketch.com/signin')

		WebUI.click(findTestObject('Object Repository/Object handle/Page_Sign in RISE/input_Sign in_email'))

		WebUI.setText(findTestObject('Object Repository/Object handle/Page_Sign in RISE/input_Sign in_password'),
				'12345')

		WebUI.click(findTestObject('Object Repository/Object handle/Page_Sign in RISE/button_Sign in'))

	}
	@Keyword
	def loginCRM2() {
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://rise.fairsketch.com/signin")
		WebUI.setText(findTestObject("Object Repository/Object handle/Page_Sign in RISE/input_Sign in_email"), "admin@demo.com")
		WebUI.setText(findTestObject("Object Repository/Object handle/Page_Sign in RISE/input_Sign in_password"), "riseDemo1")
		WebUI.click(findTestObject("Object Repository/Object handle/Page_Sign in RISE/button_Sign in"))
	}
	@Keyword
	def loginCRM3(String email, String pass) {
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://rise.fairsketch.com/signin")
		WebUI.setText(findTestObject("Object Repository/Object handle/Page_Sign in RISE/input_Sign in_email"), email)
		WebUI.setText(findTestObject("Object Repository/Object handle/Page_Sign in RISE/input_Sign in_password"), pass)
		WebUI.click(findTestObject("Object Repository/Object handle/Page_Sign in RISE/button_Sign in"))
	}
}
