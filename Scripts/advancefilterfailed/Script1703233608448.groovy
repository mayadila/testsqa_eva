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

WebUI.setText(findTestObject('Object Repository/advancedfilterfailed/input_txtUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/advancedfilterfailed/input_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/advancedfilterfailed/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/advancedfilterfailed/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/advancedfilterfailed/span_View'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/span_Advanced Filter'))

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/divContentPlaceHolder1_AdvancedFilter1_cboF_b58eab'))

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/li_Employee ID'))

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/divContentPlaceHolder1_AdvancedFilter1_cboF_ea7e77'))

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/li_Equal'))

WebUI.setText(findTestObject('Object Repository/advancedfilterfailed/input_ContentPlaceHolder1_AdvancedFilter1_t_8fd482'), 
    'abcde')

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/span_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/advancedfilterfailed/span_Filter'))

WebUI.delay(5)

WebUI.closeBrowser()

