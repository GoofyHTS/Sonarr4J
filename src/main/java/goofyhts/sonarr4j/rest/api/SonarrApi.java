package goofyhts.sonarr4j.rest.api;

/**
 * Created by Goofy on 2016/07/04.
 */
public class SonarrApi {

    private String baseUrl;
    private String apiKey;

    public SonarrApi(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
