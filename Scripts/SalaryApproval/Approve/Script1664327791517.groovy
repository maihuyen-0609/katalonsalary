import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.18.0.246:9292/#/login')

WebUI.setText(findTestObject('Page_Permission/input_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Permission/input_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Permission/button_Login'))

WebUI.click(findTestObject('PayGroup/menu_Payroll Management'))

WebUI.click(findTestObject('PayrollMainMenu/menu_Payroll Main Menu'))

WebUI.click(findTestObject('Object Repository/Approvesalary/select_Month2022-12'))

WebUI.click(findTestObject('Object Repository/Approvesalary/button_Gotoworkspace'))

WebUI.click(findTestObject('Object Repository/Approvesalary/button_View Approvals4'))

WebUI.setText(findTestObject('Object Repository/Approvesalary/input_Remark'), 'ok')

WebUI.click(findTestObject('Approvesalary/button_Pass1'))

WebUI.click(findTestObject('Object Repository/Approvesalary/select_Yes'))

WebUI.setText(findTestObject('Object Repository/Approvesalary/input_Remark'), 'ok')

WebUI.click(findTestObject('Approvesalary/button_Pass2'))

WebUI.click(findTestObject('Object Repository/Approvesalary/button_Yes'))

WebUI.setText(findTestObject('Object Repository/Approvesalary/input_Remark'), 'ok')

WebUI.click(findTestObject('Approvesalary/button_Pass3'))

WebUI.click(findTestObject('Object Repository/Approvesalary/button_Yes'))

WebUI.setText(findTestObject('Object Repository/Approvesalary/input_Remark'), 'ok')

WebUI.click(findTestObject('Approvesalary/button_Pass4'))

WebUI.click(findTestObject('Object Repository/Approvesalary/button_Yes'))

WebUI.closeBrowser()

