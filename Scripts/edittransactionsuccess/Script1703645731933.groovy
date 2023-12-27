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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/edittransaction/input_txtUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/edittransaction/input_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/edittransaction/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/edittransaction/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/edittransaction/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/edittransaction/span_View'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/edittransaction/input_textfield-1018'), 'EM')

WebUI.sendKeys(findTestObject('edittransaction/input_textfield-1018'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/edittransaction/span_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/edittransaction/input_Employee_Name'), 'EvMaya')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/edittransaction/divContentPlaceHolder1_FK_Multi_District_Co_a8f754'))

WebUI.click(findTestObject('Object Repository/edittransaction/span_x-grid-checkcolumn'))

WebUI.click(findTestObject('Object Repository/edittransaction/span_x-grid-checkcolumn_1'))

WebUI.click(findTestObject('Object Repository/edittransaction/divtool-1038-toolEl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/edittransaction/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/edittransaction/span_OK'))

WebUI.setText(findTestObject('Object Repository/edittransaction/input_textfield-1018'), 'EM00')

WebUI.sendKeys(findTestObject('edittransaction/input_textfield-1018'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

