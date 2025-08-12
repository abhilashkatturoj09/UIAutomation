package StepDefs;

import PageObjects.BasePage;
import PageObjects.CommonObject;
import RunTime.SharedDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {
    CommonObject commonObject;
    SharedDriver sharedDriver;
    BasePage basePage;

    public CommonStepDefs() {

//        sharedDriver = new SharedDriver();
        this(new SharedDriver());
//        basePage = null;
//        commonObject = null;


    }

    public CommonStepDefs(SharedDriver webDriver) {
        this.sharedDriver = webDriver;
        commonObject = new CommonObject(webDriver.getWebDriver());
        basePage = new BasePage(webDriver.getWebDriver());
    }


    @Given("I open {string}")
    public void i_open(String url) {
        System.out.println("in commonstepdefs before commonobject: " + url);
        basePage.openApp(url);
        System.out.println("in commonstepdefs after commonobject: " + url);
    }
}
