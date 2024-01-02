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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputloginusername'), 'herugunadi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/Payment/inputloginpassword'), 'DuturLD9tCPHfXFQ/qqcrg==')

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/button_Log in'))

WebUI.click(findTestObject('Page_STORE/Payment/a_SamsungGalaxy S6'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputname'), 'Heru')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputcountry'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputcity'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputcard'), '2023202401')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputmonth'), '11')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Payment/inputyear'), '2024')

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/Payment/h2_Thank you for your purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/Payment/button_OK'))

WebUI.closeBrowser()

