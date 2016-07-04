package goofyhts.sonarr4j.rest.api;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Goofy on 2016/07/04.
 */
public class SonarrApiTest {

    @Test
    public void sonarrApiTest() throws Exception {
        String baseUrl = "http://base.url.com";
        String apiKey = "apiKey";

        SonarrApi sonarrApi = new SonarrApi(baseUrl, apiKey);

        assertEquals(baseUrl, sonarrApi.getBaseUrl());
        assertEquals(apiKey, sonarrApi.getApiKey());
    }
}
