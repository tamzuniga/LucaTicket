package com.proyect.LucaTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LucaTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketApplication.class, args);
	}

}
