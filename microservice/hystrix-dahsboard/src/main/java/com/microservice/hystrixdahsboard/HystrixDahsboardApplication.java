package com.microservice.hystrixdahsboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDahsboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDahsboardApplication.class, args);
	}

}
