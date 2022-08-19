package com.briggitte.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfBriggitteMunozConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfBriggitteMunozConfigServerApplication.class, args);
	}

}
