package goofyhts.sonarr4j.rest.api;

import org.junit.Test;

/**
 * Created by Goofy on 2016/07/04.
 */
public class SonarrApiTest {

    @Test
    public void name() throws Exception {
        SonarrApi sonarrApi = new SonarrApi("http://url.com", "ApiKey");

    }
}
