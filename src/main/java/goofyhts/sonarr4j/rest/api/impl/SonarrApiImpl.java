/*
 * Copyright (C) 2016 GoofyHTS
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package goofyhts.sonarr4j.rest.api.impl;

import goofyhts.sonarr4j.rest.api.SonarrApi;

/**
 * Created by Goofy on 2016/07/04.
 */
public class SonarrApiImpl implements SonarrApi {

    private String baseUrl;
    private String apiKey;

    public SonarrApiImpl(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
