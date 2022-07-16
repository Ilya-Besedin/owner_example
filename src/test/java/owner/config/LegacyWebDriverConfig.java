package owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public Browsers getBrowser () {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browsers.CHROME;
        }
        return Browsers.valueOf(browser);
    }

    public String getBaseURL () {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://bandcamp.com";
        }
        return baseUrl;
    }

    public boolean isRemote () {
        String isRemote = System.getProperty("isRemote");
        if (Objects.isNull(isRemote)) {
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }

    public URL getRemoteURL () {
        String remoteURL = System.getProperty ("remoteURL");
        if (Objects.isNull((remoteURL))) {
            return null;
        }
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
