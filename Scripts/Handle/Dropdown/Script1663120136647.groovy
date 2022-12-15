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

WebUI.navigateToUrl('https://demo.anhtester.com/basic-select-dropdown-demo.html')

WebUI.verifyElementText(findTestObject('Object Repository/Object handle/Page_Selenium Easy Demo - Automate All Scenarios/h3_This would be your first example'), 
    'This would be your first example on select dropd down list to with Selenium.')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Object handle/Page_Selenium Easy Demo - Automate All Scenarios/select_Please select'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object handle/Page_Selenium Easy Demo - Automate All Scenarios/select_Please select'), 
    'Friday', true)

WebUI.delay(2)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object handle/Page_Selenium Easy Demo - Automate All Scenarios/select_Please select'), 
    'Friday', false, 10)

WebUI.closeBrowser()

