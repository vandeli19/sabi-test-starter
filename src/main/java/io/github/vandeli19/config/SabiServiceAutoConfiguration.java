package io.github.vandeli19.config;

import io.github.vandeli19.service.SabiService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SabiService.class)
public class SabiServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SabiService sabiService(){
        return new SabiService();
    }
}
