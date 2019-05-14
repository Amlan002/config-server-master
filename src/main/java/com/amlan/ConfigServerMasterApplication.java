package com.amlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMasterApplication.class, args);
	}

}
/*
test jenkins changes
*/