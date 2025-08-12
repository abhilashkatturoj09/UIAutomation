package RunTime;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class SharedDriver {

    //    WebDriver webDriver=new ChromeDriver();
    ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    public WebDriver getWebDriver() {
        if (webDriver.get() == null) {
            setChromeDriver();
        }
        return webDriver.get();
    }

    @Before
    public void setChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Abhilash/Git/UIAutomation/Drivers/chromedriver");
//        System.setProperty("download.default_directory", System.getProperty("user.home") + "/Downloads");
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.addArguments();
//        webDriver.set(new ChromeDriver(chromeOptions));
        HashMap<String, Object> chromePrefs = new HashMap<>();

        String downloadFilepath = "/Users/abhilashkatturoj/Downloads"; // Use appropriate path for your OS
        chromePrefs.put("download.default_directory", System.getProperty("user.home") + "/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
//        WebDriver driver = new ChromeDriver(options);
        webDriver.set(new ChromeDriver(options));
//        driver.get("https://google.com");
    }
}
