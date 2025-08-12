package PageObjects;

import org.openqa.selenium.WebDriver;

public class CommonObject extends BasePage {
    WebDriver webDriver = null;

    public CommonObject(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }


}
