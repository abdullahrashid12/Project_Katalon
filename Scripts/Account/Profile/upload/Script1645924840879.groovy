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


 //<<==============================>>
 // << ---- Upload Random Image --
 //<<==============================>>
 'Path for the file location'
 File uploadflod = new File(GlobalVariable.Profile_Image)
 
 'Keeping all the elemwent into arraylist (note: all the image file)'
 ArrayList nameimgfile = Arrays.asList(uploadflod.list())
 
 'Print all the file in the floder'
 System.print(nameimgfile)
 
 'creating random object for random'
 Random rd = new Random()
 
 'choosing random image file'
 int intd = ((Math.random() * nameimgfile.size()) as int)
 
 String filname = nameimgfile.get(intd)
 
 'set profile image file that was randoly choose'
 GlobalVariable.New_Profile_Path = WebUI.concatenate((([GlobalVariable.Profile_Image, filname]) as String[]), FailureHandling.STOP_ON_FAILURE)
 
 'Upload Image'
 WebUI.uploadFile(findTestObject('Object Repository/Profile/upload image'), GlobalVariable.Profile_Image, FailureHandling.STOP_ON_FAILURE)
 
 'Wait for 2 sec'
 WebUI.delay(GlobalVariable.Wait_Time_S)
 
 'Click change my photo button'
 WebUI.click(findTestObject('Object Repository/Profile/Change My Photo button'), FailureHandling.STOP_ON_FAILURE)
 
 'Wait for 2 sec'
 WebUI.delay(GlobalVariable.Wait_Time_S)
 
 'Verify Toast message for image appears'
 WebUI.verifyElementVisible(findTestObject('Object Repository/Profile/Toast Successful'), FailureHandling.STOP_ON_FAILURE)
 
 'close Toast message for image appears'
 WebUI.click(findTestObject('Object Repository/Profile/close toast message'), FailureHandling.STOP_ON_FAILURE)