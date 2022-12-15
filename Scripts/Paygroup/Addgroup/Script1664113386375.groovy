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

WebUI.click(findTestObject('Object Repository/PayGroup/menu_Payroll Management'))

WebUI.click(findTestObject('Object Repository/PayGroup/menu_Payroll Group'))

WebUI.click(findTestObject('Object Repository/PayGroup/button_Add'))

WebUI.click(findTestObject('Object Repository/PayGroup/select_Month'))

WebUI.click(findTestObject('Object Repository/PayGroup/select_December'))

WebUI.setText(findTestObject('PayGroup/input_Groupname'), 'IT')

WebUI.setText(findTestObject('PayGroup/input_Remark'), 'Mina')

WebUI.click(findTestObject('Object Repository/PayGroup/button_Upload Data'))

CustomKeywords.'paygroup.PayGroup.UploadFile'('E:\\Bảng lương team IT\\basic salary 20 user IT.xlsx')

WebUI.click(findTestObject('PayGroup/select_basicsalary'))

WebUI.click(findTestObject('PayGroup/select_Overtime'))

WebUI.click(findTestObject('PayGroup/select_LeaveDeduc'))

WebUI.click(findTestObject('PayGroup/select_perfect attendance'))

WebUI.click(findTestObject('PayGroup/select_Managergroup'))

WebUI.click(findTestObject('PayGroup/select_ApproverGroup'))

WebUI.click(findTestObject('Object Repository/PayGroup/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('PayGroup/checkGroup'))

WebUI.delay(3)

WebUI.closeBrowser()

