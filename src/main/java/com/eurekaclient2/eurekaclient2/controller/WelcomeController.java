package com.eurekaclient2.eurekaclient2.controller;

import com.eurekaclient2.eurekaclient2.service.WelcomeService;
import com.eurekaclient2.eurekaclient2.service.impl.WelcomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private WelcomeService welcomeService;

    @Autowired
    WelcomeController(WelcomeServiceImpl welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome-message")
    public ResponseEntity<String> getWelcomeMessage(){
        String welMsg = welcomeService.getWelcomeMessage();
        return new ResponseEntity<String>(welMsg, HttpStatus.OK);
    }
}
