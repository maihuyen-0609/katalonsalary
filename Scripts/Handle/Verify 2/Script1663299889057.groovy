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

WebUI.navigateToUrl('https://rise.fairsketch.com/signin')

WebUI.click(findTestObject('Object Repository/Object handle/Page_Sign in RISE/input_Sign in_email'))

WebUI.setText(findTestObject('Object Repository/Object handle/Page_Sign in RISE/input_Sign in_password'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Object handle/Page_Sign in RISE/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object handle/Page_Sign in RISE/div_Authentication failed'), 
    10)

WebUI.verifyElementText(findTestObject('Object handle/Page_Sign in RISE/div_Authentication failed'), 
    'Authentication failed!')

checkUrl = WebUI.getUrl()

WebUI.verifyEqual(checkUrl, 'https://rise.fairsketch.com/signin', FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Object handle/Page_Sign in RISE/input_Sign in_password'), 
    'k338bVHfr8nLp6qcLQ2I7Q==')

WebUI.click(findTestObject('Object Repository/Object handle/Page_Sign in RISE/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Object handle/Page_Dashboard  RISE - Ultimate Project Man_3e4e90/h4_Dashboard'))

WebUI.closeBrowser()

