package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject {
    private static final String
    MY_LISTS_LINK = "xpath://android.widget.FrameLayout[@content-desc='My lists']",
    ITEM_CONTAINER="id:org.wikipedia:id/item_container";

    public NavigationUI (AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists() {

        this.waitForElementAndClick(
                MY_LISTS_LINK,
                "Cannot find navigation button to My list",
                5
        );

        this.waitForElementPresent(ITEM_CONTAINER,"Cannot find folder", 10);
    }
}
