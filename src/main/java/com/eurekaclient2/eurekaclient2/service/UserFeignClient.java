package com.eurekaclient2.eurekaclient2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eurekaclient", path = "/eureka-client-1/api")
public interface UserFeignClient {

    @GetMapping("/user")
    public ResponseEntity<String> getUser();

}
