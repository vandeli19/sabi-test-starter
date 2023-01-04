package io.github.vandeli19.service;


import io.github.vandeli19.config.SabiConfig;
import org.springframework.stereotype.Component;

import java.util.Objects;




@Component
public class SabiService {

    private String partnerId;
    private String partnerKey;
    private String version;

    public String connect(SabiConfig config) {
        if(Objects.nonNull(config)){
            this.partnerId =  config.getPartnerId();
            this.partnerKey =  config.getPartnerKey();
            this.version =  config.getVersion();
        }else {
            throw new IllegalStateException("Config can't be null");
        }

       return String.format("Partner %s is connected.",partnerId);
    }
}
