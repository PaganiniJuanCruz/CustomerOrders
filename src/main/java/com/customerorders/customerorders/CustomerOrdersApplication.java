package com.customerorders.customerorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrdersApplication.class, args);
	}

}
