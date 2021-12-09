import lib.CoreTestCase;
import lib.ui.*;
import org.junit.Test;
import org.openqa.selenium.By;


 public class FirstTest extends CoreTestCase {

     private MainPageObject MainPageObject;

     protected void setUp() throws Exception {
         super.setUp();
         MainPageObject = new MainPageObject(driver);
     }

     @Test
     public void testElementContainsText() {

         MainPageObject.waitForElementAndClick(
                 By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                 "Cannot find 'Search Wikipedia' input",
                 5
         );


         By locatorElement = By.id("org.wikipedia:id/search_src_text");
         MainPageObject.waitForElementPresent(
                 locatorElement,
                 "Cannot find attribut text Search...",
                 15
         );

         MainPageObject.assertElementHasText(
                 locatorElement,
                 "Search…",
                 "Text does not contain 'Search…'");
     }
 }


