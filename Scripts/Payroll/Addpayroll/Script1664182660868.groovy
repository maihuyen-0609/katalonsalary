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

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/button_Login'))

WebUI.click(findTestObject('PayGroup/menu_Payroll Management'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/menu_Payroll Main Menu'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/button_Add'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_Monthpayroll'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_December'))

WebUI.click(findTestObject('PayrollMainMenu/dropdown_groupname'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_IT'))

WebUI.setText(findTestObject('Object Repository/PayrollMainMenu/input_payrollname'), 'IT 8')

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_uploadendtime'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_30'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/dropdown_currency'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_PHP'))

WebUI.click(findTestObject('PayrollMainMenu/select_expecteddate'))

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/select_29'))

WebUI.setText(findTestObject('PayrollMainMenu/input_remark'), 'Mina')

WebUI.click(findTestObject('Object Repository/PayrollMainMenu/button_Submit'))

WebUI.closeBrowser()

