package com.car.payment.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarPaymentServiceApplication.class, args);
	}

}
