package owner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver () {
       driver = new WebDriverProvider().get();
    }

    @Test
    public void webDriverTestExample () {
        assertEquals(driver.getTitle(), "Bandcamp");
    }

    @AfterEach
    public void stopDriver () {
        driver.quit();
    }
}
