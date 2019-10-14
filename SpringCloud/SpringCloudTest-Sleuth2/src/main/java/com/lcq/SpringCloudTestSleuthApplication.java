package com.lcq;

import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@SpringBootApplication
@RestController
public class SpringCloudTestSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestSleuthApplication.class, args);
	}
	
	@RequestMapping("/hi")
	public String home(){
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info(){
		return restTemplate.getForObject("http://localhost:8769/info",String.class);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}


	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
