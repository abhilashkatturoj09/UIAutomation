package StepDefs;

import PageObjects.CommonObject;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {
    CommonObject commonObject;

    public CommonStepDefs() {
    }

    public CommonStepDefs(WebDriver webDriver) {

        this.commonObject = new CommonObject(webDriver);
    }

    @Given("I open {string}")
    public void i_open(String url) {
        System.out.println("in commonstepdefs before commonobject: " + url);
        commonObject.openApp(url);
        System.out.println("in commonstepdefs after commonobject: " + url);
    }
}
