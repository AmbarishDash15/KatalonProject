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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.verifyElementVisible(findTestObject('Katalon/Page_Katalon Shop  Katalon Ecommerce/a_Katalon Shop'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Katalon/Page_Katalon Shop  Katalon Ecommerce/h1_Shop'), 0)

WebUI.verifyElementVisible(findTestObject('Katalon/Page_Katalon Shop  Katalon Ecommerce/Flying Ninja1'))

WebUI.click(findTestObject('Katalon/Page_Katalon Shop  Katalon Ecommerce/Flying Ninja1'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementPresent(findTestObject('Katalon/Page_Product Details/h1_Flying Ninja'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Katalon/Page_Product Details/input_Flying Ninja quantity_quantity'), 'value', 
    '1', 0)

WebUI.click(findTestObject('Katalon/Page_Product Details/button_Add to cart'))

WebUI.waitForElementPresent(findTestObject('Katalon/Page_Product Details/div_View cart Flying Ninja has been added to your cart'), 
    30)

WebUI.click(findTestObject('Katalon/Page_Product Details/a_View cart'))

WebUI.waitForPageLoad(60)

WebUI.waitForElementPresent(findTestObject('Katalon/Page_Cart  Katalon Shop/a_Flying Ninja'), 30)

WebUI.verifyElementAttributeValue(findTestObject('Katalon/Page_Cart  Katalon Shop/Quantity'), 'value', '1', 0)

WebUI.verifyElementText(findTestObject('Katalon/Page_Cart  Katalon Shop/itemPriceList'), '$12.00')

WebUI.verifyElementText(findTestObject('Katalon/Page_Cart  Katalon Shop/totalItemPrice'), '$12.00')

WebUI.verifyElementText(findTestObject('Katalon/Page_Cart  Katalon Shop/ShippingPrice'), '$20.00')

WebUI.verifyTextPresent('', false)

WebUI.verifyElementText(findTestObject('Katalon/Page_Cart  Katalon Shop/CartTotal'), '$32.00')

WebUI.click(findTestObject('Katalon/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.waitForPageLoad(60)

WebUI.waitForElementPresent(findTestObject('Katalon/Page_Checkout  Katalon Shop/h1_Checkout'), 30)

WebUI.verifyElementPresent(findTestObject('Katalon/Page_Checkout  Katalon Shop/itemDetails'), 0)

WebUI.verifyElementText(findTestObject('Katalon/Page_Checkout  Katalon Shop/totalPrice'), '$32.00')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_first_name'), 'First')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_last_name'), 'Last')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 'Company')

WebUI.selectOptionByLabel(findTestObject('Katalon/Page_Checkout  Katalon Shop/conutrySelect'), 'Australia', false)

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_address_1'), 'Address1')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input_(optional)_billing_address_2'), 'Address2')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_city'), 'City')

WebUI.selectOptionByValue(findTestObject('Katalon/Page_Checkout  Katalon Shop/stateSelect'), 'New South Wales', false)

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_postcode'), '1234')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_phone'), '0987654321')

WebUI.setText(findTestObject('Katalon/Page_Checkout  Katalon Shop/input__billing_email'), 'test@mail.com')

WebUI.click(findTestObject('Katalon/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.waitForPageLoad(60)

WebUI.waitForElementPresent(findTestObject('Katalon/Page_Checkout  Confirmation/h2_Order details'), 30)

WebUI.verifyElementText(findTestObject('Katalon/Page_Checkout  Confirmation/h1_Checkout'), 'Checkout')

WebUI.verifyElementPresent(findTestObject('Katalon/Page_Checkout  Confirmation/p_Thank you. Your order has been received'), 0)

WebUI.verifyElementPresent(findTestObject('Katalon/Page_Checkout  Confirmation/li_Order number88595'), 0)

WebUI.verifyElementText(findTestObject('Katalon/Page_Checkout  Confirmation/li_Total32.00'), '$32.00')

WebUI.verifyElementText(findTestObject('Katalon/Page_Checkout  Confirmation/span_32.00'), '$32.00')

