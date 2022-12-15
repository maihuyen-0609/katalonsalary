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

WebUI.navigateToUrl('https://demoqa.com/alerts')

WebUI.verifyElementNotPresent(findTestObject('Object handle/Page_ToolsQA/span_You selected Cancel'), 0)

WebUI.click(findTestObject('Object Repository/Object handle/Page_ToolsQA/button_Click me'))

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object handle/Page_ToolsQA/span_You selected Cancel'), 'You selected Ok')

WebUI.click(findTestObject('Object Repository/Object handle/Page_ToolsQA/button_Click me'))

WebUI.dismissAlert()

WebUI.verifyElementText(findTestObject('Object handle/Page_ToolsQA/span_You selected Cancel'), 'You selected Cancel')

WebUI.verifyElementNotPresent(findTestObject('Object handle/Page_ToolsQA/span_You entered'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('Object handle/Page_ToolsQA/button_Click me 2'))

WebUI.delay(2)

WebUI.setAlertText('Mina')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object handle/Page_ToolsQA/span_You entered'), 'You entered Mina')

WebUI.closeBrowser()

WebUI.acceptAlert()

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject(null), '')

