package owner.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WedDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config = new WebDriverConfig();

    //the same below

    //private final WebDriverConfig config;

    //public WebDriverProvider() {
    //    this.config = new WebDriverConfig();
    //}

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseURL());
        return driver;
    }

    public WebDriver createWebDriver () {
        if (Objects.nonNull(config.getBrowser())) {
            switch (config.getBrowser()) {
                case CHROME: {
                    return new ChromeDriver();
                }
                case FIREFOX: {
                    return new FirefoxDriver();
                }
                case OPERA: {
                    return new OperaDriver();
                }
                default: {
                    throw new RuntimeException("This type of browser in not required");
                }
            }
        }
        throw new RuntimeException("Type of browser can't be equal null");
    }
}
