package tests.iOS;

import lib.iOSTestCase;
import lib.ui.WelcomePageObject;
import org.junit.Test;

public class GetStartedTest extends iOSTestCase
{

    @Test
    public void testPassThroughWelcome()
    {
        WelcomePageObject WelcomePageObject = new WelcomePageObject(driver);

        WelcomePageObject.waitForScreenAddLang();
        WelcomePageObject.clickNextButton();
        WelcomePageObject.waitForNewWaysToExp();
        WelcomePageObject.clickNextButton();
        WelcomePageObject.waitForReadingList();
        WelcomePageObject.clickNextButton();
        WelcomePageObject.waitForSendAnonymousData();
        WelcomePageObject.clickGetStartedButton();
    }
}