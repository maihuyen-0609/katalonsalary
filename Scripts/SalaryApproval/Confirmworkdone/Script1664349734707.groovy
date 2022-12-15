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

WebUI.click(findTestObject('Salarysubmit/menu_Payroll Main Menu SalarySubmit'))

WebUI.click(findTestObject('Salarysubmit/select_Month2022-12'))

WebUI.click(findTestObject('Salarysubmit/button_Go to workspace'))

WebUI.click(findTestObject('Salarysubmit/button_Basic Salary'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/button_Confirm work done'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_OK to Proceed'))

WebUI.click(findTestObject('Salarysubmit/button_Overtime'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_Confirm work done'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_OK to Proceed'))

WebUI.click(findTestObject('Salarysubmit/button_LeaveDeduc'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_Confirm work done'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_OK to Proceed'))

WebUI.click(findTestObject('Salarysubmit/button_Perfect'))

WebUI.click(findTestObject('Object Repository/Salarysubmit/span_Confirm work done'))

WebUI.click(findTestObject('Salarysubmit/span_OK to Proceed'))

WebUI.closeBrowser()

