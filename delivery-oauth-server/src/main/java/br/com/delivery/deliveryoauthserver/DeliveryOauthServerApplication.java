package br.com.delivery.deliveryoauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeliveryOauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryOauthServerApplication.class, args);
	}

}
