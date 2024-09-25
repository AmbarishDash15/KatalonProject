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

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Books'), 0)

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Books'))

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_All Books'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_All Books'), '... all books')

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_All Books'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/books/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h1_Books Written By Alan Richardson'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/h1_Books Written By Alan Richardson'), 'Books Written By Alan Richardson')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_Java for tester_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_Dear Evil Tester_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/imgAutomating and Testing a REST API_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_Hacking JavaScript_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_Selenium Simplified_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_Migrating Selenium_gen'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_An Interactive COBOL Interpreter_gen'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Java For Testers'), 'Java For Testers')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Java For Testers'), 'href', 'https://www.eviltester.com/page/books/#java-for-testers', 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Dear Evil Tester'), 'Dear Evil Tester')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Dear Evil Tester'), 'href', 'https://www.eviltester.com/page/books/#dear-evil-tester', 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Automating and Testing a REST API'), 'Automating and Testing a REST API')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Automating and Testing a REST API'), 'href', 
    'https://www.eviltester.com/page/books/#automating-and-testing-a-rest-api', 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Selenium Simplified'), 'Selenium Simplified')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Selenium Simplified'), 'href', 'https://www.eviltester.com/page/books/#selenium-simplified', 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Migrating Selenium 1 to Selenium 2'), 'Migrating Selenium 1 to Selenium 2')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Migrating Selenium 1 to Selenium 2'), 'href', 
    'https://www.eviltester.com/page/books/#migrating-selenium-1-to-selenium-2', 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_An Interactive COBOL Interpreter and JSP Debugger'), 
    'An Interactive COBOL Interpreter and JSP Debugger')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_An Interactive COBOL Interpreter and JSP Debugger'), 
    'href', 'https://www.eviltester.com/page/books/#an-interactive-cobol-interpreter-and-jsp-debugger', 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Books - all/a_Hacking JavaScript ebook'), 'Hacking JavaScript ebook')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Hacking JavaScript ebook'), 'href', 'https://www.eviltester.com/page/books/#hacking-javascript-ebook', 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Java For Testers'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_java for tester'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Learn more about the book Java For Testers'), 
    'innerText', 'Learn more about the book "Java For Testers"', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Dear Evil Tester'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_dear-evil-tester'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Learn more about the book Dear Evil Tester'), 
    'innerText', 'Learn more about the book "Dear Evil Tester"', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Automating and Testing a REST API'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_automating-and-testing-a-rest-api'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Learn more about the book Automating and Testing a REST API'), 
    'innerText', 'Learn more about the book "Automating and Testing a REST API"', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Selenium Simplified'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_selenium-simplified'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_More about the book and free download links'), 
    'innerText', 'More about the book and free download links', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Migrating Selenium 1 to Selenium 2'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_migrating-selenium-1-to-selenium-2'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Download as a free pdf_migrating selenium'), 
    'href', 'https://github.com/eviltester/seleniumWebDriverCompendium/tree/main/deprecated/migrating-sel1-sel2', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_An Interactive COBOL Interpreter and JSP Debugger'), 
    0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_an-interactive-cobol-interpreter-and-jsp-debugger'), 
    0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Download as a free pdf_interactive cobol'), 
    'href', 'https://github.com/eviltester/jsp-diagrammer-cobol-interpreter', 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/h2_Hacking JavaScript ebook'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Books - all/img_hacking-javascript-ebook'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Books - all/a_Download Free Ebook'), 'href', 'https://www.eviltester.com/page/ebook/hacking-javascript-free-ebook/', 
    0)

WebUI.closeBrowser()

