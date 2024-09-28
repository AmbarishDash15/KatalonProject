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

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_ProductsName (A to Z)Name (Z to A)Price_299f0c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Products'), 'Products')

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/button_ADD TO CART - Sauce Labs Onesie'), 'ADD TO CART')

WebUI.click(findTestObject('SwagLab/Page_Swag Labs/button_ADD TO CART - Sauce Labs Onesie'))

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/path'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Your Cart'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Your Cart'), 'Your Cart')

WebUI.verifyElementPresent(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Onesie'), 0)

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Onesie'), 'Sauce Labs Onesie')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_CHECKOUT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Checkout Your Information'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Checkout Your Information'), 'Checkout: Your Information')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_first-name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_last-name'), 'User')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_postal-code'), '1234')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Checkout Overview'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Checkout Overview'), 'Checkout: Overview')

WebUI.verifyElementPresent(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Onesie'), 0)

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Onesie'), 'Sauce Labs Onesie')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_ProductsName (A to Z)Name (Z to A)Price_299f0c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Products'), 'Products')

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/button_REMOVE - Sauce Labs Onesie'), 'REMOVE')

WebUI.closeBrowser()

