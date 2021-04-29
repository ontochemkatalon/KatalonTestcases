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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.testng.Assert as Assert

CustomKeywords.'javascriptClick.Login.loginIntoApplicationWithGlobalVariable'()

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Analytics'), 
    0)

WebUI.mouseOver(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Domain Explorer'))

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Domain Explorer'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Preview/Page_SciWalker Test/span_Chemistry'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('tree search/Page_SciWalker Test/span_Select concept'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Domain_Explorer/Page_SciWalker Test/span_Search in documents'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Preview/Page_SciWalker Test/div_PMC Open Access2,743,278'), 
    0)

CustomKeywords.'javascriptClick.ClickWEBObject.clickUsingJS'(findTestObject('Export/Page_SciWalker Test/a_Export'), 0)

WebUI.delay(6)

String home = System.getProperty('user.home')

String userDownloads = new File(home + '/Downloads/')

println(home)

println(userDownloads)

String fileName = 'results.xlsx'

boolean AssertResult

AssertResult = isFileDownloaded(userDownloads, fileName)
File myFile = new File(userDownloads)
int FileSize=  myFile.length()
assert AssertResult == true 


boolean isFileDownloaded(String userDownloads, String fileName)
 {
	 File myFile = new File(userDownloads)
	 int FileSize=  myFile.length()
	 
    if (Files.exists(Paths.get(userDownloads, fileName))&& FileSize>8000 ) //comparing with bytes
		{
        println('found')
 return Files.exists(Paths.get(userDownloads, fileName))
    } 
	else {
        println('notfound')
		return false
    }
}

