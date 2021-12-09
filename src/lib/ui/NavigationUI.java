package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject {
    private static final String
    MY_LISTS_LINK = "//android.widget.FrameLayout[@content-desc='My lists']";

    public NavigationUI (AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists() {

        this.waitForElementAndClick(
                By.xpath(MY_LISTS_LINK),
                "Cannot find navigation button to My list",
                5
        );

        this.waitForElementPresent(By.id("org.wikipedia:id/item_container"),"Cannot find folder", 10);
    }
}
