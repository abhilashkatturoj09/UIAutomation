package PageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {

    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(600));
    }

    public void openApp(String url) {
        webDriver.get(url);
    }


}
