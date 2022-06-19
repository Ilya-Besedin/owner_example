package owner.config;

import java.net.URL;

public class WebDriverConfig {

    public Browsers getBrowser () {
        return Browsers.OPERA;
    }

    public String getBaseURL () {
        return "https://bandcamp.com";
    }

    public boolean isRemote () {
        return false;
    }

    public URL getRemoteURL () {
        return null;
    }
}
