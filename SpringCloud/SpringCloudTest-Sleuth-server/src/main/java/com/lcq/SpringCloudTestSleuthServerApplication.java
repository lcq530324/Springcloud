package com.lcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@zipkin2.server.internal.EnableZipkinServer
public class SpringCloudTestSleuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestSleuthServerApplication.class, args);
	}

}
