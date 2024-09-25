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

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Training'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/onlinetraining/courses/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/h1_Title'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/h1_Title'), 'Online Courses')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/p_Description'), 'List of our Online Training Courses.')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Selenium WebDriver With Java Course Cover Image'), 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Selenium WebDriver Support ClassesCourse Cover Image'), 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Selenium WebDriver Synchronisation Course Cover Image'), 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Page Objects Course Image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Technical Web Testing Course Image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Conference Talk Archive Course Image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Get Your Message Out Course Image_course'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Test Ability Course Image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_JavaScript Game Testing Course Image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_Automating In The Browser with JavaScript course image'), 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_how i test course image'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Training/img_java desktop apps course image'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver with Java'), 'Selenium WebDriver with Java')

linkhrefURL = WebUI.concatenate((([pageURL, '#selenium-webdriver-with-java']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver with Java'), 'href', linkhrefURL, 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver Support Classes with Java'), 'Selenium WebDriver Support Classes with Java')

linkhrefURL = WebUI.concatenate((([pageURL, '#selenium-webdriver-support-classes-with-java']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver Support Classes with Java'), 
    'href', linkhrefURL, 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver Synchronisation'), 'Selenium WebDriver Synchronisation')

linkhrefURL = WebUI.concatenate((([pageURL, '#selenium-webdriver-synchronisation']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Selenium WebDriver Synchronisation'), 'href', 
    linkhrefURL, 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Selenium Page Objects and Abstractions'), 'Selenium Page Objects and Abstractions')

linkhrefURL = WebUI.concatenate((([pageURL, '#selenium-webdriver-page-objects-and-abstractions']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Selenium Page Objects and Abstractions'), 'href', 
    linkhrefURL, 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Training/a_Technical Web Testing 101'), 'Technical Web Testing 101')

linkhrefURL = WebUI.concatenate((([pageURL, '#technical-web-testing-101']) as String[]))

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Training/a_Technical Web Testing 101'), 'href', linkhrefURL, 
    0)

WebUI.closeBrowser()

