package com.lcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudTestConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestConfigClientApplication.class, args);
	}

}
