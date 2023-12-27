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

WebUI.setText(findTestObject('Object Repository/addnewrecordfailed/input_txtUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/addnewrecordfailed/input_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordfailed/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordfailed/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordfailed/span_View'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_Add New Record'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addnewrecordfailed/input_Employee_ID'), 'EM001')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addnewrecordfailed/input_Employee_Name'), 'Eva Maya')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/divDate_Birth-trigger-picker'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_December 2023'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/a_Mar'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/a_1994'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/div_24'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/input_App.isMerried_Group'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/divFK_District_Code-trigger-picker'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/li_D004 - Jakarta Pusat'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/divContentPlaceHolder1_FK_Multi_District_Co_a8f754'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_x-grid-checkcolumn'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/divtool-1045-toolEl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_Save'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_OK_1'))

WebUI.click(findTestObject('Object Repository/addnewrecordfailed/span_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

