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

WebUI.navigateToUrl(launchURL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('RS-Academy/Page_Landing/input_Name'), name)

WebUI.setText(findTestObject('RS-Academy/Page_Landing/input_eMail'), eMail)

WebUI.click(findTestObject('RS-Academy/Page_Landing/button_Submit'))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_Home/a_Automation Practise - 1'), 0)

WebUI.click(findTestObject('RS-Academy/Page_Home/a_Automation Practise - 1'))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/div_GREENKART'), 0)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : item1]), 
    0)

WebUI.verifyElementText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/itemPrice', [('itemName') : item1]), 
    price1.toString())

WebUI.setText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/itemQuantity', [('itemName') : item1]), quantity1.toString())

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADD TO CART', [('itemName') : item1]))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADDED'), 0)

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/Product', [('itemName') : item2]), 
    0)

WebUI.verifyElementText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/itemPrice', [('itemName') : item2]), 
    price2.toString())

WebUI.setText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/itemQuantity', [('itemName') : item2]), quantity2.toString())

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADD TO CART', [('itemName') : item2]))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_ADDED'), 0)

WebUI.verifyElementText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/cartItems'), itemCount.toString())

WebUI.verifyElementText(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/cartPrice'), ((price1 * quantity1) + 
    (price2 * quantity2)).toString())

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/cartIcon'))

WebUI.click(findTestObject('RS-Academy/Page_GreenKart - veg and fruits kart/button_PROCEED TO CHECKOUT'))

for (def index : (1..itemCount)) {
    if (index == 1) {
        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_itemName', [('itemCount') : index.toString()]), item1)

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_quantity', [('itemCount') : index.toString()]), quantity1.toString())

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_itemPrice', [('itemCount') : index.toString()]), 
            price1.toString())

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_totalAmount', [('itemCount') : index.toString()]), 
            (price1 * quantity1).toString())
    }
    
    if (index == 2) {
        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_itemName', [('itemCount') : index.toString()]), item2)

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_quantity', [('itemCount') : index.toString()]), quantity2.toString())

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_itemPrice', [('itemCount') : index.toString()]), 
            price2.toString())

        WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/p_totalAmount', [('itemCount') : index.toString()]), 
            (price2 * quantity2).toString())
    }
}

WebUI.verifyElementText(findTestObject('RS-Academy/Page_Cart/cartTotal'), ((price1 * quantity1) + (price2 * quantity2)).toString())

WebUI.click(findTestObject('RS-Academy/Page_Cart/button_Place Order'))

WebUI.selectOptionByValue(findTestObject('RS-Academy/Page_Address/select_Country'), country, false)

WebUI.check(findTestObject('RS-Academy/Page_Address/input_chkAgree'))

WebUI.click(findTestObject('RS-Academy/Page_Address/button_Proceed'))

WebUI.verifyElementPresent(findTestObject('RS-Academy/Page_Confirmation/span_ConfirmationText'), 0)

WebUI.verifyTextPresent('Thank you, your order has been placed successfully', false)

WebUI.closeBrowser()

