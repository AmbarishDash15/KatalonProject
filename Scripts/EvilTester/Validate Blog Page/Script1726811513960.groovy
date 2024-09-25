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

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_EvilTesterHome/a_Blog'), 0)

WebUI.click(findTestObject('EvilTester/Page_EvilTesterHome/a_Blog'))

WebUI.waitForPageLoad(0)

pageURL = WebUI.getUrl()

WebUI.verifyMatch(pageURL, 'https://www.eviltester.com/blog/', false)

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Blog/h1_Blog Posts'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/h1_Blog Posts'), 'Blog Posts')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Blog/p_pageCategories'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/a_All Posts'), 'All Posts')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/a_Categories'), 'Categories')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/a_Archive'), 'Archive')

WebUI.verifyElementPresent(findTestObject('EvilTester/Page_Blog/a_SelectedPage'), 0)

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/a_SelectedPage'), '1')

WebUI.verifyElementText(findTestObject('EvilTester/Page_Blog/a_FirstBlog'), 'Modelling Software Testing for Naming and Understanding')

WebUI.closeBrowser()

