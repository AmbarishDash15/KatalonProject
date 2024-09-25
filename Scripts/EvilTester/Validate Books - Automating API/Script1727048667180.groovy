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

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Automating API'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Automating API'), 'automating api')

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Automating API'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/books/automating-testing-api-casestudy/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Automating API/h1_Title'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/h1_Title'), 'Tracks Automating and Testing Case Study')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/p_Description'), 'A Case study of Testing and Automating a REST API.')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Automating API/img_Book'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/a_Buy the ebook'), 'Buy the ebook')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Automating API/a_Amazon'), 'href', 'https://www.amazon.com/gp/product/0956733298/ref=as_li_qf_sp_asin_il_tl?ie=UTF8&tag=compendiumdev-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=0956733298&linkId=ae4fe6a1132097050fc6c2cbe2ae717f', 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/a_Read a .pdf Sample'), '[Read a .pdf Sample]')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/a_Read sample online'), '[Read sample online]')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/a_Book Support Page'), '[Book Support Page]')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/h2_About the book'), 'About the book')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/h2_Resources'), 'Resources')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/h2_Social Media Mentions and Reviews'), 'Social Media Mentions and Reviews')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Automating API/a_Social Media Review link'), 'Some "Automating & Testing a REST API" feedback')

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Automating API/a_Social Media Review link'), 'href', 'https://twitter.com/i/moments/942723529354641409?ref_src=twsrc%5Etfw', 
    0)

WebUI.closeBrowser()

