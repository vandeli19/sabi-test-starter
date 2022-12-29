package id.sabi.test.config;

import id.sabi.test.service.ISabiTestService;
import id.sabi.test.service.SabiTestService;
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
