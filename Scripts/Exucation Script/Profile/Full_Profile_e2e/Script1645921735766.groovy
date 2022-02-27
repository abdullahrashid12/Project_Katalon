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

//<<<====================================>
//<<<Profile TEST>>
//Steps
//1. Open Browser
//2. Calling Login test case
//3. Calling Profile test case
//4. Close Browser
//<<<====================================>
'Open Browser'
WebUI.callTestCase(findTestCase('Global/Browser/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

'calling test case for login'
WebUI.callTestCase(findTestCase('Account/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Calinng test case profile'
WebUI.callTestCase(findTestCase('Account/Profile/Profile'), [:], FailureHandling.STOP_ON_FAILURE)


'Calling test case for closing browser'
WebUI.callTestCase(findTestCase('Global/Browser/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

