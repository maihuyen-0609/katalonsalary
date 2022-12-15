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

'admin'
WebUI.setText(findTestObject('Object Repository/Page_Permission/input_username'), GlobalVariable.username)

'123456'
WebUI.setText(findTestObject('Object Repository/Page_Permission/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Permission/button_Login'))

WebUI.click(findTestObject('Page_Permission/Menu_Permission'))

WebUI.click(findTestObject('Object Repository/Page_Permission/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Permission/field_AddName'))

WebUI.setText(findTestObject('Page_Permission/enter_Name'), Name)

WebUI.click(findTestObject('Page_Permission/field_Addpermission name'))

WebUI.setText(findTestObject('Page_Permission/enter_Permission Name'), PermissionName)

WebUI.click(findTestObject('Page_Permission/filed_AddRemark'))

WebUI.setText(findTestObject('Page_Permission/enter_Remark'), Remark)

WebUI.click(findTestObject('Page_Permission/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_Permission/noti_SuccessAdded successfully'))

WebUI.click(findTestObject('Page_Permission/button_filter Name'))

WebUI.setText(findTestObject('Object Repository/Page_Permission/input_search'), Name)

WebUI.click(findTestObject('Object Repository/Page_Permission/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Permission/view_NameMina1'))

WebUI.click(findTestObject('Page_Permission/Menu_Role'))

WebUI.click(findTestObject('Object Repository/Page_Permission/td_Namecatalog_manager'))

WebUI.click(findTestObject('Page_Permission/button_add permission to role'))

WebUI.setText(findTestObject('Object Repository/Page_Permission/input_Not configured permission'), Name)

WebUI.click(findTestObject('Object Repository/Page_Permission/textfield_Mina1'))

WebUI.closeBrowser()

