package io.github.vandeli19.service;

import io.github.vandeli19.config.SayConfig;
import io.github.vandeli19.config.SayParam;

public class Saying {
    private SayConfig sayConfig;

    public Saying(SayConfig sayConfig) {
        this.sayConfig = sayConfig;
    }

    public String sayHello() {
      String username = sayConfig.getProperty(SayParam.USERNAME);
      String message = sayConfig.getProperty(SayParam.MESSAGE);
      return String.format(message,username);
    }
}
