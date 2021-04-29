package javascriptClick

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {

	@Keyword
	def static void loginIntoApplication(String applicationURL,String username,String password) {


		WebUI.openBrowser(applicationURL)
		WebUI.waitForPageLoad(GlobalVariable.waitPresentTimeout)
		WebUI.maximizeWindow()

		(new javascriptClick.ClickWEBObject()).clickUsingJS(findTestObject('Domain_Explorer/Page_SciWalker Test/Page_SciWalker Test/a_Got it'),1)
		WebUI.sendKeys(findTestObject('Page_SciWalkerlogin/input_Sign in toSciWalker Test_username-input'), username)
		WebUI.sendKeys(findTestObject('Page_SciWalkerlogin/input_Username_password-input'), password)
		WebUI.click(findTestObject('Page_SciWalkerlogin/span_Sign in'))
		WebUI.delay(1)
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication(GlobalVariable.urlLogin, GlobalVariable.username, GlobalVariable.password)
	}

	/*//@Keyword
	 def static void logoutFromApplication(){
	 WebUI.waitForElementPresent(findTestObject('Pages/MyAccount page/lnkMyAccount'), GlobalVariable.waitPresentTimeout)
	 WebUI.click(findTestObject('Pages/MyAccount page/lnkMyAccount'))
	 WebUI.waitForElementPresent(findTestObject('Pages/MyAccount page/lnkLogout'), GlobalVariable.waitPresentTimeout)
	 WebUI.click(findTestObject('Pages/MyAccount page/lnkLogout'))
	 WebUI.waitForElementVisible(findTestObject('Pages/MyAccount page/nav_HomeMyaccount'), GlobalVariable.waitPresentTimeout)
	 }// */
}

