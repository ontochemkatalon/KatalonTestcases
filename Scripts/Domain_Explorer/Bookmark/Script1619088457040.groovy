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

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Preview/Page_SciWalker Test/span_Clinical study dictionary'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('tree search/Page_SciWalker Test/span_Select concept'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('tree search/Page_SciWalker Test/span_Search in documents'), 
    5)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Preview/Page_SciWalker Test/div_PMC Open Access2,743,278'), 
    0)

WebUI.verifyElementPresent(findTestObject('Preview/Page_SciWalker Test/a_Abstract'), 2)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Preview/Page_SciWalker Test/a_Abstract'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Preview/Page_SciWalker Test/span_Abstract'), 2)



boolean compare = WebUI.verifyElementNotPresent(findTestObject('Bookmarkand rating verify/Page_SciWalker Test/span_Bookmarked'), 
    20, FailureHandling.CONTINUE_ON_FAILURE)

if (compare == true) 
	{
    WebUI.click(findTestObject('Object Repository/Bookmarkand rating verify/Page_SciWalker Test/span_Bookmark'))
	WebUI.click(findTestObject('Bookmarkand rating verify/Page_SciWalker Test/button_Document preview_close'))
	WebUI.verifyElementPresent(findTestObject('Bookmarkand rating verify/Page_SciWalker Test/span_BookmarkedLableInResults'),5)		
}
 else
	 {
    WebUI.click(findTestObject('Object Repository/Bookmarkand rating verify/Page_SciWalker Test/span_Bookmarked'))
	WebUI.click(findTestObject('Bookmarkand rating verify/Page_SciWalker Test/button_Document preview_close'))
	
	WebUI.verifyElementNotPresent(findTestObject('Bookmarkand rating verify/Page_SciWalker Test/span_BookmarkedLableInResults'),5)
}



