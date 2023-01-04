package io.github.vandeli19;

import io.github.vandeli19.config.SabiConfig;
import io.github.vandeli19.service.SabiService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SabiConfig.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Bean
    public ApplicationRunner applicationRunner(SabiConfig sabiConfig) {
        SabiService sabiService = new SabiService();
        var ss = System.getProperties();
        SabiConfig config = new SabiConfig();
        String doc = sabiConfig.toString() + " || "+sabiService.connect(config);
        return args -> System.out.println(sabiConfig);
    }

//    @Bean
//    public String sabiConfig() {
//        return "";
//    }


}