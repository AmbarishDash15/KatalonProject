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

WebUI.navigateToUrl('https://www.eviltester.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Training'), 0)

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Training'))

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Technical Web Testing'), 0)

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Technical Web Testing'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/onlinetraining/courses/#technical-web-testing-101', false)

WebUI.verifyElementVisible(findTestObject('EvilTester/Page_Training/h2_Technical Web Testing 101'))

WebUI.verifyElementVisible(findTestObject('EvilTester/Page_Training/img_Technical Web Testing 101 Course Image_course'))

WebUI.verifyElementVisible(findTestObject('EvilTester/Page_Training/a_Learn more about this Technical Course'))

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Learn more about this Technical Course'), 'Learn more about this Technical Course')

linkURL = WebUI.concatenate(((['https://www.eviltester.com', '/page/onlinetraining/techwebtesting101/']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Learn more about this Technical Course'), 'href', 
    linkURL, 0)

WebUI.closeBrowser()

