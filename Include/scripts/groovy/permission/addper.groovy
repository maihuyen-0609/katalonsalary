package permission

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
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class addper {

	@Given("login to system with email (.*) and password (.*)")
	def login_to_system_with_email_and_password(String email, String password) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://172.18.0.246:9292/#/login')

		WebUI.setText(findTestObject('Object Repository/Page_Permission/input_username'), GlobalVariable.username)

		WebUI.setText(findTestObject('Object Repository/Page_Permission/input_password'), GlobalVariable.password)

		WebUI.click(findTestObject('Object Repository/Page_Permission/button_Login'))

		WebUI.maximizeWindow()
	}

	@And("user open permission page")
	def user_open_permission_page() {
		WebUI.click(findTestObject('Page_Permission/Menu_Permission'))
	}

	@When("user click Add Permission button")
	def user_click_add_permission_button() {
		WebUI.click(findTestObject('Object Repository/Page_Permission/button_Add'))
	}

	@Then("the Add Permission dialog is display")
	def the_add_permission_dialog_is_display() {
	}

	@When("enter all data on field on Add Permission form (.*) (.*) (.*)")
	def enter_all_data_on_field_on_add_permission_form(String name, String permissionname, String remark) {
		WebUI.click(findTestObject('Object Repository/Page_Permission/field_AddName'))

		WebUI.setText(findTestObject('Page_Permission/enter_Name'), Name_and_permission)
		WebUI.click(findTestObject('Page_Permission/field_Addpermission name'))

		WebUI.setText(findTestObject('Page_Permission/enter_Permission Name'), Name_and_permission)

		WebUI.click(findTestObject('Object Repository/Page_Permission/field_AddName'))

		WebUI.setText(findTestObject('Page_Permission/enter_Remark'), Name_and_permission)
	}

	@And("user click Save button")
	def user_click_save_button() {
		WebUI.click(findTestObject('Page_Permission/button_submit'))
	}

	@Then("all data just added is correct (.*) (.*) (.*)")
	def all_data_just_added_is_correct(String name, String permissionname, String remark) {
	}

	@Then("the success popup display")
	def the_success_popup_display() {
		WebUI.click(findTestObject('Object Repository/Page_Permission/noti_SuccessAdded successfully'))
	}
}
