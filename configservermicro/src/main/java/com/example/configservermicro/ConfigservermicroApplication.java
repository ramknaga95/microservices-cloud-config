package com.example.configservermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigservermicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigservermicroApplication.class, args);
	}

}
