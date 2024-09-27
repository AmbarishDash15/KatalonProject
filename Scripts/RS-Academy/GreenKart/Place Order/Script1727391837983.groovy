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

WebUI.navigateToUrl(launchURL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('RS-Academy/Page_Landing/input_Name'), name)

WebUI.setText(findTestObject('RS-Academy/Page_Landing/input_eMail'), eMail)

WebUI.click(findTestObject('RS-Academy/Page_Landing/button_Submit'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_Home/a_Automation Practise - 1'), 0)

WebUI.click(findTestObject('RS-Academy/Page_Home/a_Automation Practise - 1'))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/div_GREENKART'), 0)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : item]), 
    0)

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADDED'), 0)

WebUI.verifyElementText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/cartItems'), '1')

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/cartIcon'))

