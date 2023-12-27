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

WebUI.setText(findTestObject('Object Repository/addnewrecordsuccess/input_txtUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/addnewrecordsuccess/input_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordsuccess/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordsuccess/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/addnewrecordsuccess/span_View'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_Add New Record'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addnewrecordsuccess/input_Employee_ID'), GlobalVariable.empID)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addnewrecordsuccess/input_Employee_Name'), 'Maya')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/divDate_Birth-trigger-picker'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_December 2023'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/a_Mar'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/amonthpicker-1017-prevEl'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/a_1994'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/div_24'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/input_App.isMerried_Group'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/divFK_District_Code-trigger-picker'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/li_D010 - Jakarta Barat'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/divContentPlaceHolder1_FK_Multi_District_Co_a8f754'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_x-grid-checkcolumn'))

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/divtool-1045-toolEl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addnewrecordsuccess/span_OK_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addnewrecordsuccess/input_textfield-1018'), 'Emp')

WebUI.sendKeys(findTestObject('addnewrecordsuccess/input_textfield-1018'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

