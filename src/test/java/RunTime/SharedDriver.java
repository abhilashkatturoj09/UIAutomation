package RunTime;

import org.junit.Before;

public class SharedDriver {

    @Before
    public void setChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
    }
}
