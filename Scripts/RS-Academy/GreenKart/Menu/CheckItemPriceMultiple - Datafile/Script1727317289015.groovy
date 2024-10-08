import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.beust.jcommander.converters.IntegerConverter as IntegerConverter
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
import java.lang.String as String
import java.lang.Integer as Integer

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/RS-Academy/Page_Landing/input_Name'), GlobalVariable.Name)

WebUI.setText(findTestObject('Object Repository/RS-Academy/Page_Landing/input_eMail'), GlobalVariable.eMail)

WebUI.click(findTestObject('Object Repository/RS-Academy/Page_Landing/button_Submit'))

WebUI.click(findTestObject('RS-Academy/Page_Home/a_Automation Practise - 1', [('practicePath') : GlobalVariable.Path]))

WebUI.waitForPageLoad(0)

siteURL = WebUI.getUrl()

WebUI.verifyMatch(siteURL, GlobalVariable.pathURL, false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/div_GREENKART'), 0)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : item]), 
    0)

unitPrice = WebUI.getText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/itemPrice', [('itemName') : item]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(unitPrice, price, false)

WebUI.closeBrowser()

