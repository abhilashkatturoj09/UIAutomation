package StepDefs;

import PageObjects.CommonObject;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {
    CommonObject commonObject;

    protected CommonStepDefs(WebDriver webDriver) {
        commonObject = new CommonObject(webDriver);
    }

    @Given("I open {string}")
    public void i_open(String string) {
        commonObject.openApp(string);
    }
}
