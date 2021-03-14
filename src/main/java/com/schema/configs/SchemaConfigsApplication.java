package com.schema.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SchemaConfigsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaConfigsApplication.class, args);
	}

}
