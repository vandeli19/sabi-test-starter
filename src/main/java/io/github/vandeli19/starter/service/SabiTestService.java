package io.github.vandeli19.starter.service;

import org.springframework.stereotype.Service;

@Service
public class SabiTestService implements ISabiTestService {

    @Override
    public String getSabiDoc() {
        return "SABI Document is Lorem ipsum dolor sit am";
    }
}
