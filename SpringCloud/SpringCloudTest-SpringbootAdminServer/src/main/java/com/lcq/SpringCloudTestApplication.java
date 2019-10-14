package com.lcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringCloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestApplication.class, args);
	}

}
