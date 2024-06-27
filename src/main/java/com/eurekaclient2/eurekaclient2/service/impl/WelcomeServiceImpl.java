package com.eurekaclient2.eurekaclient2.service.impl;

import com.eurekaclient2.eurekaclient2.service.UserFeignClient;
import com.eurekaclient2.eurekaclient2.service.WelcomeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class WelcomeServiceImpl implements WelcomeService {

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public String getWelcomeMessage() {
        log.info("getting welcome details");
        ResponseEntity<String> user = userFeignClient.getUser();
        return "Good Evening" + " " + user.getBody();
    }
}
