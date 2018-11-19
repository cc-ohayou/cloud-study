package com.study.provideruser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author CF create on 2018/6/29 16:50
 * @description
 */

@SpringBootApplication
@EnableFeignClients
public class EurekaConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
	}
}
