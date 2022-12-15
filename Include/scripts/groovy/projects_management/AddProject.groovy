package projects_management

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

public class AddProject {

	@Given("user login to system with email (.*) and password (.*)")
	def user_login_to_system_with_email_and_password(String email, String password) {
	}

	@And("user open project page")
	def user_open_project_page() {
	}

	@When("user click Add Project button")
	def user_click_add_project_button() {
	}

	@Then("the Add Project dialog is display")
	def the_add_project_dialog_is_display() {
	}

	@When("enter all data on field on Add Project form (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
	def enter_all_data_on_field_on_add_project_form(String title, String client, String description, String start_date, String deadline, String price, String labels) {
	}

	@And("user click Save button")
	def user_click_save_button() {
	}

	@Then("all data just added is correct (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
	def all_data_just_added_is_correct (String title, String client, String description, String start_date, String deadline, String price, String labels) {
	}

	@Then("the project just added shall display at project dropdown on Add Task dialog (.*)")
	def the_project_just_added_shall_display_at_project_dropdown_on_add_task_dialog(String title) {
	}
}
