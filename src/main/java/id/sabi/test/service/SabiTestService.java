package id.sabi.test.service;

import org.springframework.stereotype.Service;

@Service
public class SabiTestService implements ISabiTestService {

    @Override
    public String getSabiDoc() {
        return "SABI Document is Lorem ipsum dolor sit am";
    }
}
