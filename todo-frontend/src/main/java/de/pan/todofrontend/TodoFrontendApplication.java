package de.pan.todofrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TodoFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoFrontendApplication.class, args);
	}
}
