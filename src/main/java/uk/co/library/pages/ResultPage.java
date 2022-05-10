package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {


        public ResultPage() {
            PageFactory.initElements(driver, this);
        }


        @FindBy(tagName = "h1")
        WebElement resultText;


        public String getText() throws InterruptedException {
            Thread.sleep(2000);
            Reporter.log("Verify the results " + resultText.toString() + "<br>");
            return resultText.getText();
        }
    }

