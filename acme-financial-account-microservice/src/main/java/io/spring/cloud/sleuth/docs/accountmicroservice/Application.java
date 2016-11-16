package io.spring.cloud.sleuth.docs.accountmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
@RestController
public class Application {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@RequestMapping("/startOfAccount-Microservice")
	public String accountMicroServiceController() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Hello from Acme Financial's Account Microservice");
		return "Hello from Acme Financial's Account Microservice";
	}

	@RequestMapping("/")
	public String frontPage() throws InterruptedException {
		log.info("Front Page");
		return "Front Page";
	}

	public static void main(String... args) {
		new SpringApplication(Application.class).run(args);
	}
}
