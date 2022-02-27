package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : 5 sec wait time</p>
     */
    public static Object Wait_Time_S
     
    /**
     * <p>Profile default : Homepage URL</p>
     */
    public static Object HP_URL
     
    /**
     * <p></p>
     */
    public static Object EMAIL_LOGIN
     
    /**
     * <p></p>
     */
    public static Object PWD_LOGIN
     
    /**
     * <p></p>
     */
    public static Object FIRST_NAME
     
    /**
     * <p></p>
     */
    public static Object LAST_NAME
     
    /**
     * <p>Profile default : Image location</p>
     */
    public static Object Profile_Image
     
    /**
     * <p></p>
     */
    public static Object SET_PAGE_URL
     
    /**
     * <p></p>
     */
    public static Object NEW_PAGE_URL
     
    /**
     * <p></p>
     */
    public static Object New_Profile_Path
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            Wait_Time_S = selectedVariables['Wait_Time_S']
            HP_URL = selectedVariables['HP_URL']
            EMAIL_LOGIN = selectedVariables['EMAIL_LOGIN']
            PWD_LOGIN = selectedVariables['PWD_LOGIN']
            FIRST_NAME = selectedVariables['FIRST_NAME']
            LAST_NAME = selectedVariables['LAST_NAME']
            Profile_Image = selectedVariables['Profile_Image']
            SET_PAGE_URL = selectedVariables['SET_PAGE_URL']
            NEW_PAGE_URL = selectedVariables['NEW_PAGE_URL']
            New_Profile_Path = selectedVariables['New_Profile_Path']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
