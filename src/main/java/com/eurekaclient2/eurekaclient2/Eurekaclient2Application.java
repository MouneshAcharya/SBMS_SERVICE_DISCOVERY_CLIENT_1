package com.eurekaclient2.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Eurekaclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient2Application.class, args);
	}

}
