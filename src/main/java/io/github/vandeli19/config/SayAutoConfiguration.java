package io.github.vandeli19.config;

import io.github.vandeli19.service.Saying;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Saying.class)
@EnableConfigurationProperties(SayProperties.class)
public class SayAutoConfiguration {

    @Autowired
    private SayProperties sayProperties;

    @Bean
    @ConditionalOnMissingBean
    public SayConfig sayConfig() {
        String username = sayProperties.getUserName() == null
                ? System.getProperty("user.name") : sayProperties.getUserName();
        SayConfig sayConfig = new SayConfig();
        sayConfig.put(SayParam.USERNAME,username);
        return sayConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public Saying saying(SayConfig sayConfig) {
        return new Saying(sayConfig);
    }

}
