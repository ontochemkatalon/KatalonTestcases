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

CustomKeywords.'javascriptClick.Login.loginIntoApplicationWithGlobalVariable'()

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Analytics'), 
    0)

WebUI.mouseOver(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Domain Explorer'))

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Domain Explorer'), 
    0)

WebUI.setText(findTestObject('Object Repository/Domain_Explorer/Page_SciWalker Test/Page_SciWalker Test/input_Domains All (32)_p-inputtext p-compon_5bf855'), 
    'humans')

String Searchtext = WebUI.getAttribute(findTestObject('Domain_Explorer/Page_SciWalker Test/Page_SciWalker Test/li_stem cells'), 
    'text')

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/Page_SciWalker Test/li_stem cells'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('clear all/Page_SciWalker Test/button_Filter'), 
    0)


WebUI.check(findTestObject('Object Repository/Domain_Explorer/Page_SciWalker Test/Page_SciWalker Test/div_Anatomy_p-checkbox-box'))

not_run: WebUI.click(findTestObject('Domain_Explorer/Page_SciWalker Test/div_Proteins_p-checkbox-box'))

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Search in documents'), 
    0)

WebUI.verifyElementPresent(findTestObject('Domain_Explorer/Page_SciWalker Test/span_50,666,284 hits'), 6)

WebUI.closeBrowser()

