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

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Java For Testers'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Java For Testers'), 'java for testers')

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Java For Testers'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/books/java-for-testers/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Java For Testers/h1_Title'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/h1_Title'), 'Java For Testers')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/p_Description'), 'An introduction to coding in Java.')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Java For Testers/img_Book'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Buy The eBook_title'), 'Buy The eBook')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Buy The Paperback_title'), 'Buy The Paperback')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Read a Sample_title'), 'Read a Sample')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Java For Testers/youTubeContainer'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Watch on YouTube'), 'Watch on YouTube')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/h2_Helps you learn fast'), 'Helps you learn fast:')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/h2_Who is this book for'), 'Who is this book for?')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/h2_Buy The Book'), 'Buy The Book')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Buy The eBook_bottom'), 'Buy The eBook')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/a_Buy The Paperback_bottom'), 'Buy The Paperback')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Java For Testers/h2_Testimonials from Twitter'), 'Testimonials from Twitter')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Java For Testers/a_Some Java For Testers feedback'), 0)

WebUI.verifyElementAttributeValue(findTestObject('EvilTester/Page_Book - Java For Testers/a_Some Java For Testers feedback'), 
    'href', 'https://twitter.com/i/moments/942703766784094208?ref_src=twsrc%5Etfw', 0)

WebUI.closeBrowser()

