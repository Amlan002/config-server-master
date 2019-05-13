package com.amlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@ConfigurationProperties("localconfig")
public class ConfigServerMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMasterApplication.class, args);
	}

}
