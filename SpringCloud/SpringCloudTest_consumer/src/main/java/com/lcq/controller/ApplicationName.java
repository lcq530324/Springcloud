package com.lcq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Configuration
@RestController
public class ApplicationName {

	private final String  url = "http://provider";
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping("/getName")
	public String getName() {
		RestTemplate template = getTemplate();
		String provider = template.getForObject(url+"/name", String.class);
		return provider+"ribbon";
	}
	
	@RequestMapping("/htest")
	@HystrixCommand(fallbackMethod = "Error")
	public String HystrixTest() {
		RestTemplate template = getTemplate();
		String provider = template.getForObject(url+"/name", String.class);
		return provider;
	}
	
	public String Error() {
		return "抱歉！！,你访问的服务已经挂了";
	}
}
