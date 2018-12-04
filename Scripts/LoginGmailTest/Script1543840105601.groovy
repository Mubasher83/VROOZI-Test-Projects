import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.katalon.com/')

WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Katalon Studio Simplify API We/a_Tutorials'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Katalon Tutorials Library | Katalon Docs')

WebUI.click(findTestObject('Page_Katalon Tutorials Library  Kat/a_Web Testing'))

WebUI.click(findTestObject('Page_Getting Started with Web Testi/a_Creating test case using Rec'))

WebUI.closeBrowser()

