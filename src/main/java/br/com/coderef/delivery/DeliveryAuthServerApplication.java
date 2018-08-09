package br.com.coderef.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeliveryAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryAuthServerApplication.class, args);
	}
}

