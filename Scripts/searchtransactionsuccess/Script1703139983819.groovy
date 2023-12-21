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

WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_txtUsername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/searchingtransactionsuccess/input_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/searchingtransactionsuccess/span_Login'))

WebUI.doubleClick(findTestObject('Object Repository/searchingtransactionsuccess/span_Engineer Test'))

WebUI.doubleClick(findTestObject('Object Repository/searchingtransactionsuccess/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/searchingtransactionsuccess/span_View'))

'Searching by employeeID'
WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_textfield-1018'), 'Test')

WebUI.sendKeys(findTestObject('searchingtransactionsuccess/input_textfield-1018'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'Searching by EmployeeName'
WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_textfield-1021'), 'Web')

WebUI.sendKeys(findTestObject('searchingtransactionsuccess/input_textfield-1021'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'Searching by Is Merried'
WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_textfield-1026'), 'No')

WebUI.sendKeys(findTestObject('searchingtransactionsuccess/input_textfield-1026'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.clearText(findTestObject('searchingtransactionsuccess/input_textfield-1018'))

WebUI.clearText(findTestObject('searchingtransactionsuccess/input_textfield-1021'))

WebUI.clearText(findTestObject('searchingtransactionsuccess/input_textfield-1026'))

'Searching by  Mulyi District'
WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_textfield-1032'), 'Jakarta')

WebUI.sendKeys(findTestObject('searchingtransactionsuccess/input_textfield-1032'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'Searching by  District'
WebUI.setText(findTestObject('Object Repository/searchingtransactionsuccess/input_textfield-1029'), 'Pusat')

WebUI.sendKeys(findTestObject('searchingtransactionsuccess/input_textfield-1029'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

