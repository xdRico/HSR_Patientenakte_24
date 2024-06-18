package de.pan.patientfilefrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PatientfileFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientfileFrontendApplication.class, args);
	}
}
