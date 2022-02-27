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

//<===========================================>
//>>Test case Step<<>
//1.click on Login from header
//2.Verify 'Log in to your account' text appears
//3.Verify Email label appears
//4.Enter good email 
//5.Click "Continue button"
//6.Enter good password
//7.click "Login" button

'click on login from header'
WebUI.click(findTestObject('Object Repository/Account/Login/Login_button'), FailureHandling.STOP_ON_FAILURE)

'Verify Log in to your account text appears'
WebUI.verifyElementVisible(findTestObject('Object Repository/Account/Login/Login your account text'), FailureHandling.STOP_ON_FAILURE)

'Verify Email label appears'
WebUI.verifyElementVisible(findTestObject('Account/Login/Email input text'), FailureHandling.STOP_ON_FAILURE)

'Enter good email'
WebUI.setText(findTestObject('Object Repository/Account/Login/Input Email'), GlobalVariable.EMAIL_LOGIN, FailureHandling.STOP_ON_FAILURE)

'Click "Continue button'
WebUI.click(findTestObject('Object Repository/Account/Login/contine button'), FailureHandling.STOP_ON_FAILURE)

'Wait for 5 sec'
WebUI.delay(GlobalVariable.Wait_Time_S)

'Enter good password'
WebUI.setText(findTestObject('Object Repository/Account/Login/Input Password'), GlobalVariable.PWD_LOGIN, FailureHandling.STOP_ON_FAILURE)

'click Login button'
WebUI.click(findTestObject('Object Repository/Account/Login/Button Login'), FailureHandling.STOP_ON_FAILURE)








