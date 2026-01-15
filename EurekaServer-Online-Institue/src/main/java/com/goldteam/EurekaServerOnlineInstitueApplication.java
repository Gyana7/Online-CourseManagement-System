package com.goldteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerOnlineInstitueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerOnlineInstitueApplication.class, args);
	}

}
