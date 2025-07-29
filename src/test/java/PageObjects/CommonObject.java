package PageObjects;

import org.openqa.selenium.WebDriver;

public class CommonObject extends BasePage {
    WebDriver webDriver;

    public CommonObject(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void openApp(String url) {
        webDriver.get(url);
    }
}
