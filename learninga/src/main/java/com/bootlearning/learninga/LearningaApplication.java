package com.bootlearning.learninga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LearningaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningaApplication.class, args);
	}

}
