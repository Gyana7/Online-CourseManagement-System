package com.goldteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminserverOnlineInstitueApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminserverOnlineInstitueApplication.class, args);
		System.out.println("admin server");
	}

}
