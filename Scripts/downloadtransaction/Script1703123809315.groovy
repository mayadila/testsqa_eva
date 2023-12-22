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

WebUI.navigateToUrl('https://ndsrndserver.southeastasia.cloudapp.azure.com/NFQA_Test/Login.aspx?ReturnUrl=%2fNFQA_Test%2fDefault.aspx')

WebUI.setText(findTestObject('Object Repository/downloadtransaction/input_txtUsername'), 'EngineerTest1')

WebUI.setEncryptedText(findTestObject('Object Repository/downloadtransaction/input_txtPassword'), 'W/OUHaE1QwcnZTXGuncx4g==')

WebUI.click(findTestObject('Object Repository/downloadtransaction/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/downloadtransaction/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/downloadtransaction/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/downloadtransaction/span_View'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/downloadtransaction/span_Export Current Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/downloadtransaction/span_Export All Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/downloadtransaction/divContentPlaceHolder1_cboExportExcel-trigg_294ccd'))

WebUI.click(findTestObject('Object Repository/downloadtransaction/li_CSV'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/downloadtransaction/span_Export Current Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/downloadtransaction/span_Export All Page'))

WebUI.delay(5)

WebUI.closeBrowser()

