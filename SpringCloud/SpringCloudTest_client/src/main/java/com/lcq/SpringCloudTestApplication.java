package com.lcq;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudTestApplication {

	@RequestMapping("/name")
	public String name() {
		return "Eureka Client(provider) Start up !";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestApplication.class, args);
	}
	
}
