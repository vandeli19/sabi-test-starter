package io.github.vandeli19.starter.config;

import io.github.vandeli19.starter.service.ISabiTestService;
import io.github.vandeli19.starter.service.SabiTestService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SabiTestService.class)
public class SabiTestConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public ISabiTestService sabiTestService(){
        return new SabiTestService();
    }
}
