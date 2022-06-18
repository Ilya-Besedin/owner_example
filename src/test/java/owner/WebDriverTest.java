package owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    @Test
    public void webDriverTestExample () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bandcamp.com");
        assertEquals(driver.getTitle(), "Bandcamp");
        driver.quit();
    }
}
