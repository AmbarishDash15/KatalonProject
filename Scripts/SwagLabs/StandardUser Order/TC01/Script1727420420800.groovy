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

WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_29.99'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/path'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/button_REMOVE'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_29.99_1'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_29.99_1'), '29.99')

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_Continue Shopping'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_CHECKOUT'), 0)

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_first-name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_last-name'), 'User')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_postal-code'), '1234')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Item total 29.99'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Tax 2.40'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Total 32.39'), 0)

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_FINISH'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 'THANK YOU FOR YOUR ORDER')

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/img_THANK YOU FOR YOUR ORDER_pony_express'), 
    0)

WebUI.closeBrowser()

