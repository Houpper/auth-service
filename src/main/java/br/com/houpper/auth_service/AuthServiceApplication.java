package br.com.houpper.auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO: Javadoc
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthServiceApplication {

	/**
	 * TODO: Javadoc
	 *
	 * @param args
	 */
	static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}
}