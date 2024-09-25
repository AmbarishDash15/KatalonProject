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

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Home'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Home'), 'Home')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Blog'), 'Blog')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Books'), 'Books')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Training'), 'Training')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Resources'), 'Resources')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Talks'), 'Talks')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Tools'), 'Tools')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Podcast'), 'Podcast')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Videos'), 'Videos')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Contact'), 'Contact')

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Books'))

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Java For Testers'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Java For Testers'), 'java for testers')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Dear Evil Tester'), 'dear evil tester')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Automating API'), 'automating api')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_All Books'), '... all books')

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Training'))

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Evil Tester Talks'), 'evil tester talks')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Technical Web Testing'), 'technical web testing')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_JavaScript'), 'javascript')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_All Courses'), '... all courses')

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Resources'))

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Agile Testing'), 'agile testing')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Recommended Books List'), 'recommended books list')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Patreon Mentoring'), 'patreon mentoring')

WebUI.mouseOver(findTestObject('EvilTester/Page_EvilTesterHome/a_Contact'))

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Email List'), 'email list')

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Contact Form'), 'contact form')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Recent Blog Posts'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Recent Blog Posts'), 'Recent Blog Posts')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Patreon Membership - Exclusive Online Tr_e4669b'), 
    0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Patreon Membership - Exclusive Online Tr_e4669b'), 
    'Patreon Membership - Exclusive Online Training for Only $1 a Month')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Online Training'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Online Training'), 'Online Training')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Books written by Alan Richardson'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Books written by Alan Richardson'), 'Books written by Alan Richardson')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Podcast - The Evil Tester Show'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Podcast - The Evil Tester Show'), 'Podcast - The Evil Tester Show')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/h2_Mailing List'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/h2_Mailing List'), 'Mailing List')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Join The Evil Tester Email List'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Join The Evil Tester Email List'), 'Join "The Evil Tester" Email List')

WebUI.closeBrowser()

