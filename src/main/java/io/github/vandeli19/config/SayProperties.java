package io.github.vandeli19.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "say")
public class SayProperties {
    private String userName;
    private String message;
}
