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
import java.lang.String as String

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rahulshettyacademy.com/practice-project')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/RS-Academy/Page_Landing/input_Submit your details in the form below_0956c4'), 
    'Ambarish')

WebUI.setText(findTestObject('Object Repository/RS-Academy/Page_Landing/input_Submit your details in the form below_90a8b6'), 
    'dash.ambarish15@gmail.com')

WebUI.click(findTestObject('Object Repository/RS-Academy/Page_Landing/button_Submit'))

WebUI.click(findTestObject('Object Repository/RS-Academy/Page_Home/a_Automation Practise - 1'))

WebUI.waitForPageLoad(0)

siteURL = WebUI.getUrl()

WebUI.verifyMatch(siteURL, 'https://rahulshettyacademy.com/seleniumPractise/#/', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/div_GREENKART'), 0)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : firstItem]), 
    0)

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/incrementor', [('itemName') : firstItem]))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : secondItem]), 
    0)

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/incrementor', [('itemName') : secondItem]))

