package io.github.eugeneshin.dguaispringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dgu.ai")
public class DguAiProperties {
    private String baseUrl;
    private String username;
    private String password;
}
