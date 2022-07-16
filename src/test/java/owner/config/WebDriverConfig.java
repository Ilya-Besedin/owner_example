package owner.config;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://bandcamp.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteURL")
    URL gerRemoteUrl();
}
