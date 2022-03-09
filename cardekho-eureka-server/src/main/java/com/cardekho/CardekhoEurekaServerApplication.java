package com.cardekho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CardekhoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardekhoEurekaServerApplication.class, args);
	}

}
