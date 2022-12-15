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

public class AddPermission  {
	@Keyword
	def addPermission() {
		for(i=0;i<3;i++) {

			WebUI.click(findTestObject('Page_Permission/Menu_Permission'))

			WebUI.click(findTestObject('Object Repository/Page_Permission/button_Add'))

			WebUI.click(findTestObject('Object Repository/Page_Permission/field_AddName'))

			WebUI.setText(findTestObject('Page_Permission/enter_Name'), Name_and_permission)

			WebUI.click(findTestObject('Page_Permission/field_Addpermission name'))

			WebUI.setText(findTestObject('Page_Permission/enter_Permission Name'), Name_and_permission)

			WebUI.click(findTestObject('Object Repository/Page_Permission/field_AddName'))

			WebUI.setText(findTestObject('Page_Permission/enter_Remark'), Name_and_permission)

			WebUI.click(findTestObject('Page_Permission/button_submit'))
			WebUI.click(findTestObject('Object Repository/Page_Permission/noti_SuccessAdded successfully'))
		}
	}
}
