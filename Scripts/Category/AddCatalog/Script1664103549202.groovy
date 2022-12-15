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

WebUI.click(findTestObject('Object Repository/Page_Category/menu_Salary Settings'))

WebUI.click(findTestObject('Page_Category/button_ExpandAll'))

WebUI.click(findTestObject('Page_Category/button_createchild2'))

WebUI.click(findTestObject('Object Repository/Page_Category/span_Please Select (1)'))

WebUI.click(findTestObject('Object Repository/Page_Category/select_Catalog'))

WebUI.setText(findTestObject('Page_Category/input_catalogname'), 'basicchild1')

WebUI.setText(findTestObject('Object Repository/Page_Category/input__catalogkey'), 'basicchild1')

WebUI.click(findTestObject('Object Repository/Page_Category/select_AlgorithmEarning'))

WebUI.click(findTestObject('Object Repository/Page_Category/button_Submit1'))

WebUI.click(findTestObject('Object Repository/Page_Category/noti_successful processing'))

WebUI.click(findTestObject('Object Repository/Page_Category/menu_Upload template'))

WebUI.click(findTestObject('Object Repository/Page_Category/select_filtercatalogname'))

WebUI.setText(findTestObject('Page_Category/input_Searchcatalogname'), 'basic1')

WebUI.click(findTestObject('Object Repository/Page_Category/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Category/check_Catalog namebasicchild'))

WebUI.click(findTestObject('Object Repository/Page_Category/menu_Payroll Management'))

WebUI.click(findTestObject('Object Repository/Page_Category/span_Payroll Group (1)'))

WebUI.click(findTestObject('Object Repository/Page_Category/button_AddGroup'))

WebUI.click(findTestObject('Object Repository/Page_Category/label_basicchild (1)'))

WebUI.delay(3)

WebUI.closeBrowser()

