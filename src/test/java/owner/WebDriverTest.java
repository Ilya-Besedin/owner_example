package owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import owner.config.WedDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver = new WedDriverProvider().get();

    @Test
    public void webDriverTestExample () {
        assertEquals(driver.getTitle(), "Bandcamp");
        driver.quit();
    }
}
