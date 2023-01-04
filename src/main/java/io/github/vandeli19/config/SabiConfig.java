package io.github.vandeli19.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;


@ConfigurationProperties("sabi-config")
@Data
public class SabiConfig {
   public static final String SABI_VERSION = "sabi-config.version";
   public static final String SABI_PARTNER_ID = "sabi-config.partnerId";
   public static final String SABI_PARTNER_KEY = "sabi-config.partnerKey";

//   @Value("${sabi-config.partnerId}")
//   private String partner_id;
//   @Value("${sabi-config.partnerKey}")
//   private String partner_key;
//   @Value("${sabi-config.version}")
//   private String partner_version;
   /**
    * Partner Id anda di LaaS
    */
   @NotBlank
   public String partnerId;
   /**
    * Partner Key anda di LaaS
    */
   @NotBlank
   public String partnerKey;
   public String version;

   public SabiConfig(String partnerId, String partnerKey, String version) {
      this.partnerId = partnerId;
      this.partnerKey = partnerKey;
      this.version = version;
   }

   public SabiConfig() {
      this.partnerId = "UNDEFINED";
      this.partnerKey = "UNDEFINED";
      this.version = "UNDEFINED";
   }


   public String getConfig(){
      return String.format("version=%s,Id=%s,Key=%s",this.version, this.partnerId,this.partnerKey);
   }



}
