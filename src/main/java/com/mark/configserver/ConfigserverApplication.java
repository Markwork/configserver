package com.mark.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {
//测试
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
