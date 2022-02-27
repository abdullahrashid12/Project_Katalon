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
//<<Test case for Profile>
//Steps
//1.Switch URL to profile
//2.Verify Text "My Profile"
//3.Verify My Profile container
//4.Scroll down to profile container section
//5.Verify 'Profile' text
//6.verify profile icon for image upload
//7.Verify First Name input
//8.Verify Last Name input
//9.Enter First Name
//10.Enter last Name
//11.Upload image
//12.Verify Toast message for image appears
//12.Verify Public display name
//13.Verify display name shows "abdullahrashid12"
//14.Verify About me and input 
//15.Click on "Gravatar profile." button
//16.Verify "Save profile button" is clickable
//17.scroll down to "Profile links" link section
//18.Verify "Add" button is clickable
//19.Verify "Manage which sites appear in your profile."
'Wait for 5 sec'
WebUI.delay(GlobalVariable.Wait_Time_S)

'Set Global URL to me'
GlobalVariable.SET_PAGE_URL = 'me'

'Set New page URL'
GlobalVariable.NEW_PAGE_URL = WebUI.concatenate((([GlobalVariable.HP_URL, GlobalVariable.SET_PAGE_URL]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Navigate to profile page'
WebUI.navigateToUrl(GlobalVariable.NEW_PAGE_URL, FailureHandling.STOP_ON_FAILURE)

'Verify Text My Profile'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/MY Profile Text'), FailureHandling.STOP_ON_FAILURE)

'Verify My Profile container'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Profile Container'), FailureHandling.STOP_ON_FAILURE)

'Scroll down to profile container section'
WebUI.scrollToElement(findTestObject('Object Repository/Profile/Profile Container'), 1, FailureHandling.STOP_ON_FAILURE)

'Verify Profile text'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Profile text'), FailureHandling.STOP_ON_FAILURE)

'verify profile icon for image upload'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Profile Image icon'), FailureHandling.STOP_ON_FAILURE)

'Verify First Name text'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/First Name text'), FailureHandling.STOP_ON_FAILURE)

'Verify Last Name text'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Last Name text'), FailureHandling.STOP_ON_FAILURE)

'Enter First Name'
WebUI.setText(findTestObject('Object Repository/Profile/Input First'), GlobalVariable.FIRST_NAME, FailureHandling.STOP_ON_FAILURE)

'Enter last Name'
WebUI.setText(findTestObject('Object Repository/Profile/Input Last'), GlobalVariable.LAST_NAME, FailureHandling.STOP_ON_FAILURE)

'Verify Public display name'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/public display name'), FailureHandling.STOP_ON_FAILURE)

'Verify display name shows abdullahrashid12'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/user name'), FailureHandling.STOP_ON_FAILURE)
'Verify About me and input'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/about me'), FailureHandling.STOP_ON_FAILURE)

'Click on Gravatar profile. button'
WebUI.click(findTestObject('Object Repository/Profile/Gravatar button'), FailureHandling.STOP_ON_FAILURE)

'Verify Save profile button is clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Profile/profile button'), FailureHandling.STOP_ON_FAILURE)

'scroll down to Profile links link section'
WebUI.scrollToElement(findTestObject('Object Repository/Profile/Profile link section'), 0, FailureHandling.STOP_ON_FAILURE)

'Verify Add button is clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Profile/Add button'), FailureHandling.STOP_ON_FAILURE)

'Verify Manage which sites appear in your profile.'
WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Mange which site text'), FailureHandling.STOP_ON_FAILURE)

