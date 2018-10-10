package com.study.discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CF create on 2018/9/7 16:58
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaApplication.class, args);
	}
}
