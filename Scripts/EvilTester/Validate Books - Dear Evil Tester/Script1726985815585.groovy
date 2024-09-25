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

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Dear Evil Tester'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_EvilTesterHome/a_Dear Evil Tester'), 'dear evil tester')

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Dear Evil Tester'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/page/deareviltester/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/h1_Title'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Dear Evil Tester/h1_Title'), 'The "Dear Evil Tester" Book')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Dear Evil Tester/p_Description'), 'A book to help develop the Attitude and Mindset of a Software Tester.')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/a_Buy The eBook_title'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/a_Buy The Paperback_title'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/a_Download a PDF Sample_title'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/imgBook'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/videoPlayer'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/a_Buy The eBook_bottom'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/a_Buy The Paperback_bottom'), 0)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Book - Dear Evil Tester/videoPlayer'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Book - Dear Evil Tester/h2_Reviewer Banner'), 'Read what our early reviewers had to say:')

WebUI.closeBrowser()

