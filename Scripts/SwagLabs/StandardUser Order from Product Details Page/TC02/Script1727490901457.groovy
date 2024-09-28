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

WebUI.click(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Bike Light'))

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/details_Sauce Labs Bike Light'), 'Sauce Labs Bike Light')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/details_9.99'), '$9.99')

WebUI.verifyElementVisible(findTestObject('Object Repository/SwagLab/Page_Swag Labs/img_- Back_inventory_details_img'))

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADD TO CART - Details'))

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/path'))

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Bike Light'), 'Sauce Labs Bike Light')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/item_9.99'), '9.99')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_first-name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_last-name'), 'User')

WebUI.setText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_Checkout Your Information_postal-code'), '1234')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/link_Sauce Labs Bike Light'), 'Sauce Labs Bike Light')

WebUI.verifyElementText(findTestObject('SwagLab/Page_Swag Labs/item_9.99'), '$9.99')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Item total 9.99'), 'Item total: $9.99')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Tax 0.80'), 'Tax: $0.80')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/div_Total 10.79'), 'Total: $10.79')

WebUI.click(findTestObject('Object Repository/SwagLab/Page_Swag Labs/a_FINISH'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 'THANK YOU FOR YOUR ORDER')

WebUI.verifyElementVisible(findTestObject('Object Repository/SwagLab/Page_Swag Labs/img_THANK YOU FOR YOUR ORDER_pony_express'))

WebUI.closeBrowser()

